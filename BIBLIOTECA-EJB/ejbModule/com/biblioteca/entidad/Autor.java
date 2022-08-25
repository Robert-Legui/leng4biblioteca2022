package com.biblioteca.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table (name = "autores")



public class Autor {
	
	@Column (name= "aut_codigo")
	private Integer codigo;
	
	@Column (name= "aut_nombre")
	private String nombre;
	
	@Column (name= "aut_foto")
	private byte[] foto;
	public Autor() {
		super();
		
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	
	
}
