package com.biblioteca.session;

import java.util.List;

import javax.ejb.Stateless;

import com.biblioteca.entidad.Autor;

@Stateless
public class AutorSession {
	
	public List<Autor> consultarAutores(){
		return null;
	}
	
	public Autor buscarporCodigo(Integer codigo) {
		return null;
		
	}
	
	public Autor incluir (Autor autor) {
		return null;
	}
	
	public Autor actualizar(Autor autor) {
		return null;
	}
	public void eliminar (Integer codigo) {
		return;
	}
}
