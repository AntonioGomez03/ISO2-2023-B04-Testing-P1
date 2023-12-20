package org.javahispano.trabajo_teorico_2;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Persona {
	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;
	private String nacionalidad;
	private String titulacion;
	private String certificacionIngles;
	private int numeroTelefono;
	private String correoElectronico;
	
	
	public Persona(String nombre, String apellidos, Date fechaNacimiento, String nacionalidad, String titulacion,
			String certificacionIngles, int numeroTelefono, String correoElectronico)  {
		setNombre(nombre);
		setApellidos(apellidos);
		setFechaNacimiento(fechaNacimiento);
		setNacionalidad(nacionalidad);
		setTitulacion(titulacion);
		setCertificacionIngles(certificacionIngles);
		setNumeroTelefono(numeroTelefono);
		setCorreoElectronico(correoElectronico);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public String getTitulacion() {
		return titulacion;
	}
	public String getCertificacionIngles() {
		return certificacionIngles;
	}
	public int getNumeroTelefono() {
		return numeroTelefono;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setNombre(String nombre) throws IllegalArgumentException{ 
		try {
			nombre=nombre.toUpperCase();
			comprobarCadenaVacia(nombre);
			this.nombre = nombre;
		}catch(Exception e) {
			throw new IllegalArgumentException("Error. Nombre no válido");
		}
	}
	public void setApellidos(String apellidos) {
		try {
			apellidos=apellidos.toUpperCase();
			comprobarCadenaVacia(apellidos);
			this.apellidos = apellidos;
		}catch(Exception e) {
			throw new IllegalArgumentException("Error. Apellidos no válidos");
		}
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		try {
			comprobarFechaInvalida(fechaNacimiento);
			this.fechaNacimiento = fechaNacimiento;
		}catch(Exception e) {
			throw new IllegalArgumentException("Error. Fecha no válida");
		}
		
	}
	public void setNacionalidad(String nacionalidad) {
		try {
			nacionalidad=nacionalidad.toUpperCase();
			comprobarCadenaVacia(nacionalidad);
			this.nacionalidad = nacionalidad;
		}catch(Exception e) {
			throw new IllegalArgumentException("Error. Nacionalidad no válida");
		}
	}
	public void setTitulacion(String titulacion) {
		try {
			titulacion=titulacion.toUpperCase();
			comprobarCadenaVacia(titulacion);
			this.titulacion = titulacion;
		}catch(Exception e) {
			throw new IllegalArgumentException("Error. Titulacion no válida");
		}
		
	}
	public void setCertificacionIngles(String certificacionIngles) {
		try {
			certificacionIngles=certificacionIngles.toUpperCase();
			comprobarCadenaVacia(certificacionIngles);
			this.certificacionIngles = certificacionIngles;
		}catch(Exception e) {
			throw new IllegalArgumentException("Error. Certificación de inglés no válida");
		}
	}
	public void setNumeroTelefono(int numeroTelefono) {
		try {
			comprobarNumeroTelefono(numeroTelefono);
			this.numeroTelefono = numeroTelefono;
		}catch(IllegalArgumentException e) {
			throw new IllegalArgumentException("Error. No se ingresó un número correcto");
		}
	}
	public void setCorreoElectronico(String correoElectronico) {
		try {
			
			correoElectronico=correoElectronico.toUpperCase();
			comprobarCadenaVacia(correoElectronico);
			validarCorreoElectronico(correoElectronico);
			this.correoElectronico = correoElectronico;
		}catch(Exception e) {
			throw new IllegalArgumentException("Error. Correo electronico no válido");
		}
	}
	
	public boolean esEuropeo()  {
		boolean europeo=false;
		String[] nacionalidadesEuropeas = {
			    "Albania", "Alemania", "Andorra", "Armenia", "Austria", "Azerbaiyán", "Bélgica", "Bielorrusia",
			    "Bosnia y Herzegovina", "Bulgaria", "Chipre", "Croacia", "Dinamarca", "Eslovaquia", "Eslovenia",
			    "España", "Estonia", "Finlandia", "Francia", "Georgia", "Grecia", "Hungría", "Irlanda", "Islandia",
			    "Italia", "Kazajistán", "Kosovo", "Letonia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte",
			    "Malta", "Moldavia", "Mónaco", "Montenegro", "Noruega", "Países Bajos", "Polonia", "Portugal", "Reino Unido",
			    "República Checa", "Rumanía", "Rusia", "San Marino", "Serbia", "Suecia", "Suiza", "Ucrania", "Vaticano"
			};

		 for (String nacionalidadEuropea : nacionalidadesEuropeas) {
		        if (this.nacionalidad.equals(nacionalidadEuropea.toUpperCase())) {
		            europeo=true; 
		        }
		    }
		return europeo;
	}
	
	public boolean esMayorEdad() {
	        Calendar ahora = Calendar.getInstance();
	        Calendar fechaNacimientoCal = Calendar.getInstance();
	        fechaNacimientoCal.setTime(this.fechaNacimiento);

	        int edad = ahora.get(Calendar.YEAR) - fechaNacimientoCal.get(Calendar.YEAR);

	        if (ahora.get(Calendar.DAY_OF_YEAR) < fechaNacimientoCal.get(Calendar.DAY_OF_YEAR)) {
	            edad--;
	        }

	        return edad >= 18;
	    }
	
	public boolean puedeDoctorado() {
		boolean doctorado =false;
		if(this.titulacion.equals("MASTER") || this.titulacion.equals("DOCTORADO")) {
			doctorado =true;
		}
		return doctorado;
	}
	 private void comprobarCadenaVacia(String cadena){
			if (cadena=="" || cadena==null){
				throw new IllegalArgumentException();
			}
	 }
	 
	 private void comprobarFechaInvalida(Date fecha) {
		 Date fechaActual = new Date ();
		 if (fecha.after(fechaActual) || fecha==null) {
			 throw new IllegalArgumentException();
		 }
	 }
	 
	 private void comprobarNumeroTelefono(int numeroTel) {
		 if(numeroTel >= 1000000000 || numeroTel <=0 ) {
			 throw new IllegalArgumentException();
		 }
	 }
	 
	 private  void validarCorreoElectronico(String correo) {
	        String patronCorreo = "^[a-zA-Z0-9_+&-]+(?:\\.[a-zA-Z0-9_+&-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";	        
	        Pattern pattern = Pattern.compile(patronCorreo);
	        Matcher matcher = pattern.matcher(correo);
	      if (!matcher.matches()){
	    	  throw new IllegalArgumentException();
	      }
	        
	        
	    }
	 
	 
}