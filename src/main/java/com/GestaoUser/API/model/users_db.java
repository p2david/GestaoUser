package com.GestaoUser.API.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class users_db {

	 @Id
	    private int id;
	    private int is_active;
	    private LocalDateTime create_date;
	    private String create_by;
	    private String email;
	    private LocalDateTime last_login;
	    private String name;
	    private String password;
	    private LocalDateTime update_date;
	    private String updated_by;
	    private String username;
	    private  String organic_unit_id;
	    private String station;
	    private String superior;
		public users_db() {
			super();
			// TODO Auto-generated constructor stub
		}
		public users_db(int id, int is_active, LocalDateTime create_date, String create_by, String email,
				LocalDateTime last_login, String name, String password, LocalDateTime update_date, String updated_by,
				String username, String organic_unit_id, String station,  String superior) {
			super();
			this.id = id;
			this.is_active = is_active;
			this.create_date = create_date;
			this.create_by = create_by;
			this.email = email;
			this.last_login = last_login;
			this.name = name;
			this.password = password;
			this.update_date = update_date;
			this.updated_by = updated_by;
			this.username = username;
			this.organic_unit_id = organic_unit_id;
			this.station = station;
            this.superior = superior;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getIs_active() {
			return is_active;
		}
		public void setIs_active(int is_active) {
			this.is_active = is_active;
		}
		public LocalDateTime getCreate_date() {
			return create_date;
		}
		public void setCreate_date(LocalDateTime create_date) {
			this.create_date = create_date;
		}
		public String getCreate_by() {
			return create_by;
		}
		public void setCreate_by(String create_by) {
			this.create_by = create_by;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public LocalDateTime getLast_login() {
			return last_login;
		}
		public void setLast_login(LocalDateTime last_login) {
			this.last_login = last_login;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public LocalDateTime getUpdate_date() {
			return update_date;
		}
		public void setUpdate_date(LocalDateTime update_date) {
			this.update_date = update_date;
		}
		public String getUpdated_by() {
			return updated_by;
		}
		public void setUpdated_by(String updated_by) {
			this.updated_by = updated_by;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getOrganic_unit_id() {
			return organic_unit_id;
		}
		public void setOrganic_unit_id(String organic_unit_id) {
			this.organic_unit_id = organic_unit_id;
		}
		public String getStation() {
			return station;
		}
		public void setStation(String station) {
			this.station = station;
		}

	public String getSuperior() {
		return superior;
	}

	public void setSuperior(String superior) {
		this.superior = superior;
	}
}
