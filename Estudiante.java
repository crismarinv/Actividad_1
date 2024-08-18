package ejercicio1;


import java.util.Date;
import java.util.List;

public class Estudiante extends Persona {
    private String colegioGraduado;
    private Date fechaIngreso;
    private List<Estudiante> estudiantes;

    public Estudiante(int cedula, String nombre, Date fechaNacimiento, String lugarDeNacimiento, String colegioGraduado,
                      Date fechaIngreso) {
        super(cedula, nombre, fechaNacimiento, lugarDeNacimiento);
        this.colegioGraduado = colegioGraduado;
        this.fechaIngreso = fechaIngreso;
        
    }

 // Método para agregar un estudiante
    public void agregar(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

 // Método para eliminar un estudiante por nombre o cedula
    public boolean eliminarEstudiante(String nombreEstudiante, int cedulaEstudiante) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equals(nombreEstudiante) || estudiante.getCedula() == cedulaEstudiante) {
                estudiantes.remove(estudiante);
                return true; // Se eliminó correctamente
            }
        }
        return false; // No se encontró el estudiante
    
    }
    // Método para buscar estudiante por nombre
    public Estudiante buscarEstudiante(String nombreEstudiante) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equals(nombreEstudiante)) {
                return estudiante;
            }
        }
        return null;
    
    }
    // Método para buscar estudiante por cedula
    private Estudiante buscarEstudiantePorCedula(int cedula) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula() == cedula) {
                return estudiante;
            }
        }
        return null;
    }

    // Método para consultar estudiante por nombre
    public String consultar(String nombreEstudiante) {
        Estudiante estudiante = buscarEstudiante(nombreEstudiante);
        if (estudiante != null) {
            return "Estudiante: " + estudiante.getNombre() + 
            		"\nCedula: " + estudiante.getCedula() +
                    "\nColegio Graduado: " + estudiante.getColegioGraduado() + 
                    "\nFecha de Ingreso: " + estudiante.getFechaIngreso();
                  
        } else {
            return "El estudiante " + nombreEstudiante + " no se encontró.";
        }
    }

    // Método para consultar estudiante por cedula
    public String consultar(int cedulaEstudiante) {
        Estudiante estudiante = buscarEstudiantePorCedula(cedulaEstudiante);
        if (estudiante != null) {
            return "Estudiante: " + estudiante.getNombre() + 
                   "\nCedula: " + estudiante.getCedula()+
                   "\nColegio Graduado: " + estudiante.getColegioGraduado() + 
                   "\nFecha de Ingreso: " + estudiante.getFechaIngreso();
        } else {
            return "El estudiante con cedula " + cedulaEstudiante + " no se encontró.";
        }
    }

 // Método para modificar un estudiante por nombre o cedula
    public boolean modificarEstudiante(String nombreEstudiante, int cedulaEstudiante, String nuevoNombre, int nuevaCedula, String nuevoColegioGraduado, Date nuevaFechaIngreso) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equals(nombreEstudiante) || estudiante.getCedula() == cedulaEstudiante) {
                // Modificar los atributos del estudiante encontrado
                estudiante.setNombre(nuevoNombre);
                estudiante.setCedula(nuevaCedula);
                estudiante.setColegioGraduado(nuevoColegioGraduado);
                estudiante.setFechaIngreso(nuevaFechaIngreso);
             
                return true; // Modificación exitosa
            }
        }
        return false; // No se encontró el estudiante
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
    public String getColegioGraduado() {
        return colegioGraduado;
    }

    public void setColegioGraduado(String colegioGraduado) {
        this.colegioGraduado = colegioGraduado;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    

    
}
   