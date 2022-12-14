package com.biblioteca.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name= "Ciudades")
public class Ciudad {

	@Column (name = "ciu_codigo")
	private Integer codigo;
	
	@Column (name = "ciu_descripcion")
	private String descripcion;

	public Ciudad() {
		super();
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	

}
