package com.biblioteca.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "usuarios")
public class Usuario {

	@Column (name = "use_codigo")
	private Integer codigo;
	
	@Column (name = "usu_usename")
	private String usename;
	
	@Column (name = "usu_password")
	private String password;

	public Usuario() {
		super();
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getUsename() {
		return usename;
	}

	public void setUsename(String usename) {
		this.usename = usename;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
