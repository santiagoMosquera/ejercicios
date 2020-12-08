package com.clearminds.admin;

import com.clearminds.dtos.Persona;

public class TestPersona {
	public static void main(String[] args) {
		Persona p=new Persona();
		p.setCedula("12313");
		p.setNombre("Juan");
		System.out.println(p.getCedula()+" "+p.getNombre());
	}
}
