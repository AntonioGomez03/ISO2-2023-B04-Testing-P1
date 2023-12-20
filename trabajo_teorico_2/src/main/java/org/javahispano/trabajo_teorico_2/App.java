package org.javahispano.trabajo_teorico_2;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		
		@SuppressWarnings("deprecation")
		Persona persona=new Persona("a", "p", new Date(105,5,12), "Noruega", "Master", "B1", 693270475, "antogomez@alu.uclm.es");
		System.out.println(persona.esMayorEdad());
		

	}
}
