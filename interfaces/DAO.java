package com.curso.java.interfaces;

import com.curso.java.entidades.Usuarios;

public interface DAO<T> {

	boolean eliminar();
	boolean guardar();
	
	T buscar();
	
	
}
