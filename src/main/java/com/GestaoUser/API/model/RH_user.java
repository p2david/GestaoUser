package com.GestaoUser.API.model;

import javax.persistence.*;

@Entity
@Table(name = "rh_user")
public class RH_user {
    @Id
    private int id;
    private String user;
    private String nome;
   private String funcao;
    private String direcao;
    private String departamento;
    private String area;
    private String cargochefia;
    private int saldoferias;
    private String email;
    private int centrocusto;
    private String superiorhierarquico;
    private String emailsuperhierarquico;
    private String usersuperiorhierarquico;

    public RH_user() {
    }

	public RH_user(int id, String user, String nome, String funcao, String direcao, String departamento, String area,
			String cargochefia, int saldoferias, int centrocusto, String superiorhierarquico,
			String emailsuperhierarquico, String usersuperiorhierarquico,String email) {
		super();
		this.id = id;
		this.user = user;
		this.nome = nome;
		this.funcao = funcao;
		this.direcao = direcao;
		this.departamento = departamento;
		this.area = area;
		this.cargochefia = cargochefia;
		this.saldoferias = saldoferias;
		this.centrocusto = centrocusto;
		this.superiorhierarquico = superiorhierarquico;
		this.emailsuperhierarquico = emailsuperhierarquico;
		this.usersuperiorhierarquico = usersuperiorhierarquico;
		this.email =email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCargochefia() {
		return cargochefia;
	}

	public void setCargochefia(String cargochefia) {
		this.cargochefia = cargochefia;
	}

	public int getSaldoferias() {
		return saldoferias;
	}

	public void setSaldoferias(int saldoferias) {
		this.saldoferias = saldoferias;
	}

	public int getCentrocusto() {
		return centrocusto;
	}

	public void setCentrocusto(int centrocusto) {
		this.centrocusto = centrocusto;
	}

	public String getSuperiorhierarquico() {
		return superiorhierarquico;
	}

	public void setSuperiorhierarquico(String superiorhierarquico) {
		this.superiorhierarquico = superiorhierarquico;
	}

	public String getEmailsuperhierarquico() {
		return emailsuperhierarquico;
	}

	public void setEmailsuperhierarquico(String emailsuperhierarquico) {
		this.emailsuperhierarquico = emailsuperhierarquico;
	}

	public String getUsersuperiorhierarquico() {
		return usersuperiorhierarquico;
	}

	public void setUsersuperiorhierarquico(String usersuperiorhierarquico) {
		this.usersuperiorhierarquico = usersuperiorhierarquico;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    
	
}
