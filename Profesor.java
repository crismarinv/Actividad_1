package ejercicio1;

import java.util.List;
import java.util.Date;

public class Profesor extends Persona {
    private String profesion;
    private String nacionalidad;
    private float sueldo;
    private List<Profesor> profesores;

    public Profesor(int cedula, String nombre, Date fechaNacimiento, String lugarDeNacimiento, String profesion, String nacionalidad, float sueldo) {
        super(cedula, nombre, fechaNacimiento, lugarDeNacimiento);
        this.profesion = profesion;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        
    }
 // Método para agregar un profesor
    public void agregar(Profesor profesor) {
        profesores.add(profesor);
    }

 // Método para eliminar un profesor por nombre o cedula
    public boolean eliminarProfesor(String nombreProfesor, int cedulaProfesor) {
        for (Profesor profesor : profesores) {
            if (profesor.getNombre().equals(nombreProfesor) || profesor.getCedula() == cedulaProfesor) {
                profesores.remove(profesor);
                return true; // Se eliminó correctamente
            }
        }
        return false; // No se encontró el profesor
    
    }
    // Método para buscar profesor por nombre
    public Profesor buscarProfesor(String nombreProfesor) {
        for (Profesor profesor : profesores) {
            if (profesor.getNombre().equals(nombreProfesor)) {
                return profesor;
            }
        }
        return null;
    
    }
    // Método para buscar profesor por cedula
    private Profesor buscarProfesorPorCedula(int cedula) {
        for (Profesor profesor : profesores) {
            if (profesor.getCedula() == cedula) {
                return profesor;
            }
        }
        return null;
    }

    // Método para consultar profesor por nombre
    public String consultar(String nombreProfesor) {
        Profesor profesor = buscarProfesor(nombreProfesor);
        if (profesor != null) {
            return "Profesor: " + profesor.getNombre() + 
            		"\nCedula: " + profesor.getCedula() +
                    "\nProfesion: " + profesor.getProfesion() + 
                    "\nNacionalidad: " + profesor.getNacionalidad();
                  
        } else {
            return "El profesor " + nombreProfesor + " no se encontró.";
        }
    }

    // Método para consultar profesor por cedula
    public String consultar(int cedulaProfesor) {
        Profesor profesor = buscarProfesorPorCedula(cedulaProfesor);
        if (profesor != null) {
            return "Profesor: " + profesor.getNombre() + 
                   "\nCedula: " + profesor.getCedula()+
                   "\nProfesion: " + profesor.getProfesion() + 
                   "\nNacionalidad: " + profesor.getNacionalidad();
                  
        } else {
            return "El profesor con cedula " + cedulaProfesor + " no se encontró.";
        }
    }

 // Método para modificar un profesor por nombre o cedula
    public boolean modificarProfesor(String nombreProfesor, int cedulaProfesor, String nuevoNombre, int nuevaCedula, float nuevoSueldo, String nuevaNacionalidad) {
        for (Profesor profesor : profesores) {
            if (profesor.getNombre().equals(nombreProfesor) || profesor.getCedula() == cedulaProfesor) {
                // Modificar los atributos del profesor encontrado
                profesor.setNombre(nuevoNombre);
                profesor.setCedula(nuevaCedula);
                profesor.setNacionalidad(nuevaNacionalidad);
                profesor.setSueldo(nuevoSueldo);
             
                return true; // Modificación exitosa
            }
        }
        return false; // No se encontró el profesor
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    
}
   
