package com.GestaoUser.API.resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestaoUser.API.model.RH_user;
import com.GestaoUser.API.model.users_db;
import com.GestaoUser.API.sevice.RH_userSevice;
import com.GestaoUser.API.sevice.UsersdbSevice;

@RestController
@RequestMapping(value="/excel")
public class importarExcelRHuser {
	
	@Autowired
	private RH_userSevice res;
	@Autowired
	private UsersdbSevice usdb;
	
	//pegar fichiero excel
@Bean
public void exceltouser(){
	
			try {
				InputStream input = new FileInputStream("C://Users//Patricio//Desktop//Progecto Banco/Lista Colaboradores - WF FÉRIAS.xlsx");
				 Workbook workbook = new XSSFWorkbook(input);
				
				 Sheet sheet = workbook.getSheetAt(0);
				 			
				 List<RH_user> listRH_user = new ArrayList<RH_user>();
					
				 RH_user userexcel = new RH_user();
					for (Row row : sheet) {
						if(row.getRowNum()>=7) {
							
					if(row.getCell(1)!=null &&
							row.getCell(2) !=null &&
							row.getCell(3)!=null && 
							row.getCell(4)!=null && 
							row.getCell(5)!=null && 
							row.getCell(6)!=null && 
							row.getCell(7)!=null && 
							row.getCell(8)!=null && 
							row.getCell(9)!=null && 
							row.getCell(10)!=null && 
							row.getCell(11)!=null && 
							row.getCell(12)!=null && 
							row.getCell(13)!=null &&
							row.getCell(14)!=null ) {
						
						  
						
						userexcel.setId(convertInt(""+row.getCell(1)));


						userexcel.setUser(""+row.getCell(2));
						userexcel.setNome(""+row.getCell(3));
						userexcel.setFuncao(""+row.getCell(4));
						userexcel.setDirecao(""+row.getCell(5));
						userexcel.setDepartamento(""+row.getCell(6));
						userexcel.setArea(""+row.getCell(7));
						userexcel.setCargochefia(""+row.getCell(8));
						userexcel.setSaldoferias(convertInt(""+row.getCell(9)));
						userexcel.setEmail(""+row.getCell(10));
						userexcel.setCentrocusto(convertInt(""+row.getCell(11)));
						userexcel.setSuperiorhierarquico(""+row.getCell(12));
						userexcel.setEmailsuperhierarquico(""+row.getCell(13));
						userexcel.setUsersuperiorhierarquico(""+row.getCell(14));

						res.save(userexcel);
					verficar(userexcel);
					}
				
					
						}
						
					}
					 
					workbook.close();
				
					
					
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
			
		
			

	}

//conversao String para Int
	public int convertInt(String valor) {
		  double valorconverte=Double.parseDouble(valor);
		  int id=(int) valorconverte;
		  
		  return id;
	}
	
	//Verficar do ficheiro do exel com BD
	public void verficar(RH_user rh_user) {
		RH_user rhuser_excel = rh_user;




			if(usdb.verficaUsername(rhuser_excel.getUser())>0) {
             users_db userupdete = usdb.buscarid(rhuser_excel.getId());
				userupdete.setSuperior(rhuser_excel.getUsersuperiorhierarquico());
				//user.setUpdated_by(rhuser_excel.getSuperiorhierarquico());

				userupdete.setCreate_date(LocalDateTime.now());
				userupdete.setUpdate_date(LocalDateTime.now());
				usdb.save(userupdete);
				
			}else {
				
				users_db usuario = new users_db();
				usuario.setId(rhuser_excel.getId());
				usuario.setEmail(rhuser_excel.getEmail());
				usuario.setName(rhuser_excel.getNome());
				usuario.setUsername(rhuser_excel.getUser());
				usuario.setCreate_date(LocalDateTime.now());
				usuario.setUpdate_date(LocalDateTime.now());
				usuario.setSuperior(rhuser_excel.getUsersuperiorhierarquico());
				usdb.save(usuario);
;
			}


		
	}


}
