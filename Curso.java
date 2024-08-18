package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int codigo;
    private String nombre;
    private int numCreditos;
    private int numSalon;
    private String nombreEdificio;
    private List<Curso> cursos;
  

    public Curso(int codigo, String nombre, int numCreditos, int numSalon, String nombreEdificio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numCreditos = numCreditos;
        this.numSalon = numSalon;
        this.nombreEdificio = nombreEdificio;
       
    }
    
	
    public Curso(String nombre, int numCreditos, int numSalon, String nombreEdificio) {
        this.nombre = nombre;
        this.numCreditos = numCreditos;
        this.numSalon = numSalon;
        this.cursos = new ArrayList<>();
    }
    // Método para agregar un curso
    public void agregar(Curso curso) {
        cursos.add(curso);
    }
    
 // Método para eliminar un curso por nombre o código
    public boolean eliminarCurso(String nombreCurso, int codigoCurso) {
        for (Curso curso : cursos) {
            if (curso.getNombre().equals(nombreCurso) || curso.getCodigo() == codigoCurso) {
                cursos.remove(curso);
                return true; // Se eliminó correctamente
            }
        }
        return false; // No se encontró el curso
    }
    
    
    // Método para buscar curso por nombre
    public Curso buscarCurso(String nombreCurso) {
        for (Curso curso : cursos) {
            if (curso.getNombre().equals(nombreCurso)) {
                return curso;
            }
        }
        return null;
    
    }
    // Método para buscar curso por código
    private Curso buscarCursoPorCodigo(int codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo() == codigo) {
                return curso;
            }
        }
        return null;
    }

    // Método para consultar curso por nombre
    public String consultar(String nombreCurso) {
        Curso curso = buscarCurso(nombreCurso);
        if (curso != null) {
            return "Curso: " + curso.getNombre() + 
                   "\nCréditos: " + curso.getNumCreditos() + 
                   "\nSalon numero: " + curso.getNumSalon() + 
                   "\nEdificio: " + curso.getNombreEdificio();
        } else {
            return "El curso " + nombreCurso + " no se encontró.";
        }
    }

    // Método para consultar curso por código
    public String consultar(int codigoCurso) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        if (curso != null) {
            return "Curso: " + curso.getNombre() + 
                   "\nCréditos: " + curso.getNumCreditos() + 
                   "\nSalón número: " + curso.getNumSalon() + 
                   "\nEdificio: " + curso.getNombreEdificio();
        } else {
            return "El curso con código " + codigoCurso + " no se encontró.";
        }
    }

 // Método para modificar un curso por nombre o código
    public boolean modificarCurso(String nombreCurso, int codigoCurso, String nuevoNombre, int nuevoCodigo, int nuevosCreditos, int nuevoSalon, String nuevoEdificio) {
        for (Curso curso : cursos) {
            if (curso.getNombre().equals(nombreCurso) || curso.getCodigo() == codigoCurso) {
                // Modificar los atributos del curso encontrado
                curso.setNombre(nuevoNombre);
                curso.setCodigo(nuevoCodigo);
                curso.setNumCreditos(nuevosCreditos);
                curso.setNumSalon(nuevoSalon);
                curso.setNombreEdificio(nuevoEdificio);
                return true; // Modificación exitosa
            }
        }
        return false; // No se encontró el curso
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }

    public int getNumSalon() {
        return numSalon;
    }

    public void setNumSalon(int numSalon) {
        this.numSalon = numSalon;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }
    }


