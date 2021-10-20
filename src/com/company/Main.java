package com.company;

import com.company.banco.CuentaBancaria;
import com.company.ejercicioencap.Person;
import com.company.paquete2.Animal;

public class Main {
	public static void main(String[] args) {
	/*CuentaBancaria cuenta = new CuentaBancaria();
	cuenta.setNombre("Víctor");
	cuenta.setClave("ERT-124573");
	cuenta.setSaldo(100000000);

	System.out.println(cuenta.getNombre());
	cuenta.mostrarSaldo();*/

		//Modificador de acceso privado nos permite acceder a elementos
	//  solo desde la misma clase
    	/*
	    Persona persona = new Persona();
	    persona.nombre = "Hugo";
	    persona.edad = 31;
	    persona.
				*/

		//ejercicio

		Person person= new Person();

		System.out.println("Name:" + person.getName());
		System.out.println("Age:" + person.getAge());
		System.out.println("Id" + person.getId());

    }
}
