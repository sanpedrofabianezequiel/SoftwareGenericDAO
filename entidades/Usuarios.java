package com.curso.java.entidades;

import com.curso.java.interfaces.DAO;

public class Usuarios implements DAO<Usuarios> {

	private String correo;
	private String  clave;
	private static Integer auto=0;
	private Integer id;
	
	
	public Usuarios(String correo, String clave) {
		
		this.correo = correo;
		this.clave = clave;
		auto++;
		this.id=auto;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public static Integer getAuto() {
		return auto;
	}


	public static void setAuto(Integer auto) {
		Usuarios.auto = auto;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Usuarios [correo=" + correo + ", clave=" + clave + ", id=" + id + "]";
	}


	@Override
	public boolean eliminar() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean guardar() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Usuarios buscar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
