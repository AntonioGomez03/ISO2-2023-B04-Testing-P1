 package org.javahispano.trabajo_teorico_2;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.javahispano.trabajo_teorico_2.Persona;

/**
 * Unit test for simple App.
 */
public class PersonaTest 
{
    /**
     * Rigorous Test :-)
     */    
//    @Test
//    public void esEuropeoArgentina() {
//    	Persona persona=new Persona("abc", "p", new Date(105,5,12), "Argentina", "Master", "B1", 693270475, "email@alu.uclm.es");
//    	assertFalse(persona.esEuropeo());
//    }
//    
//    @Test
//    public void esEuropeo() {
//    	Persona persona=new Persona("abc", "p", new Date(105,5,12), "España", "Master", "B1", 693270475, "email@alu.uclm.es");
//    	assertTrue(persona.esEuropeo());
//    }
    
    @Test
    public void casoPrueba1_EachUse() {
    	Persona persona= new Persona("Juan","Gómez", new Date(103,10,30), "España", "Primaria", "A1", 683472958,"email@alu.uclm.es");
    	assertTrue(persona.esEuropeo());
    	assertTrue(persona.esMayorEdad());
    	assertFalse(persona.puedeDoctorado());
    }
    
    @Test
    public void casoPrueba2_EachUse() {
    	Persona persona= new Persona("Juan","Gómez", new Date(123,11,19), "Argentina", "ESO", "A1", 683472958,"email@alu.uclm.es");
    	assertFalse(persona.esEuropeo());
    	assertFalse(persona.esMayorEdad());
    	assertFalse(persona.puedeDoctorado());
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void casoPrueba3_EachUse() {
    	Persona persona= new Persona("Juan","Gómez", new Date(124,0,1), "Ciudad Real", "Bachillerato", "A1", 683472958,"email@alu.uclm.es");
    	assertFalse(persona.esEuropeo());
    	assertFalse(persona.esMayorEdad());
    	assertFalse(persona.puedeDoctorado());
    }
    @Test (expected = IllegalArgumentException.class)
    public void casoPrueba4_EachUse() {
    	Persona persona= new Persona("Juan","Gómez", new Date(-1,0,1), "", "FP", "A1", 683472958,"email@alu.uclm.es");
    	assertFalse(persona.esEuropeo());
    	assertTrue(persona.esMayorEdad());
    	assertFalse(persona.puedeDoctorado());
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void casoPrueba5_EachUse() {
    	Persona persona= new Persona("Juan","Gómez", new Date(124,0,1), "España", "Grado Universitario", "A1", 683472958,"email@alu.uclm.es");
    	assertTrue(persona.esEuropeo());
    	assertFalse(persona.esMayorEdad());
    	assertFalse(persona.puedeDoctorado());
    }
    
    @Test
    public void casoPrueba6_EachUse() {
    	Persona persona= new Persona("Juan","Gómez", new Date(103,10,30), "España", "Master", "A1", 683472958,"email@alu.uclm.es");
    	assertTrue(persona.esEuropeo());
    	assertTrue(persona.esMayorEdad());
    	assertTrue(persona.puedeDoctorado());
    }
    @Test
    public void casoPrueba7_EachUse() {
    	Persona persona= new Persona("Juan","Gómez", new Date(103,10,30), "España", "Doctorado", "A1", 683472958,"email@alu.uclm.es");
    	assertTrue(persona.esEuropeo());
    	assertTrue(persona.esMayorEdad());
    	assertTrue(persona.puedeDoctorado());
    }
    
    @Test
    public void casoPrueba8_EachUse() {
    	Persona persona= new Persona("Juan","Gómez", new Date(103,10,30), "España", "YouTuber", "A1", 683472958,"email@alu.uclm.es");
    	assertTrue(persona.esEuropeo());
    	assertTrue(persona.esMayorEdad());
    	assertFalse(persona.puedeDoctorado());
    }
    
    @Test
    public void casoPrueba9_EachUse() {
    	Persona persona= new Persona("Juan","Gómez", new Date(103,10,30), "España", "Nini", "A1", 683472958,"email@alu.uclm.es");
    	assertTrue(persona.esEuropeo());
    	assertTrue(persona.esMayorEdad());
    	assertFalse(persona.puedeDoctorado());
    }
    
    @Test
    public void casoPrueba10_EachUse() {
    	Persona persona= new Persona("Juan","Gómez", new Date(103,10,30), "España", "Manipulador de Alimentos", "A1", 683472958,"email@alu.uclm.es");
    	assertTrue(persona.esEuropeo());
    	assertTrue(persona.esMayorEdad());
    	assertFalse(persona.puedeDoctorado());
    }
}
