package ejercicio1;

import java.util.Date;

public abstract class Persona {
	
	protected  int cedula;
    protected  String nombre;
    protected  Date fechaNacimiento;
    protected  String lugarDeNacimiento;

    public Persona(int cedula, String nombre, Date fechaNacimiento, String nacionalidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        
    }

	public String mostrarDatosPersonales() {
        return "Nombre: " + nombre + ", Cédula: " + cedula + ", Fecha de Nacimiento: " + fechaNacimiento + "Lugar de Nacimiento: " + lugarDeNacimiento+ "Lugar de Nacimiento: " + lugarDeNacimiento;
    }


	public class LugarDeNacimiento {
	    private String ciudad;
	    private String departamento;
	    private String pais;

	    public LugarDeNacimiento(String ciudad, String departamento, String pais) {
	        this.ciudad = ciudad;
	        this.departamento = departamento;
	        this.pais = pais;
	    }

	    // Getters
	    public String getCiudad() {
	        return ciudad;
	    }

	    public String getDepartamento() {
	        return departamento;
	    }

	    public String getPais() {
	        return pais;
	    }

	    @Override
	    public String toString() {
	        return ciudad + ", " + departamento + ", " + pais;
	    }
	}
}
