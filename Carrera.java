package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private String nombre;
    private int numCreditos;
    private int numSemestres;
    private List<Carrera> carreras;
    public NivelCarrera nivel;
    
 
        public enum NivelCarrera {
            PREGRADO,
            POSTGRADO;
        }

    public Carrera(String nombre, int numCreditos, int numSemestres, NivelCarrera nivel) {
        this.nombre = nombre;
        this.numCreditos = numCreditos;
        this.numSemestres = numSemestres;
        this.nivel = nivel;
        this.carreras = new ArrayList<>();
    }

    public void agregar(Carrera carrera) {
        carreras.add(carrera);
    }

    public Carrera buscarCarrera(String nombreCarrera) {
        for (Carrera carrera : carreras) {
            if (carrera.getNombre().equals(nombreCarrera)) {
                return carrera;
            }
        }
        return null;
    }
    

    public String consultar(String nombreCarrera) {
        Carrera carrera = buscarCarrera(nombreCarrera);
        if (carrera != null) {
            return "Carrera: " + carrera.getNombre() + 
                   "\nCréditos: " + carrera.getNumCreditos() + 
                   "\nSemestres: " + carrera.getNumSemestres() + 
                   "\nNivel: " + carrera.getNivel();
        } else {
            return "La carrera " + nombreCarrera + " no se encontró en la facultad.";
        }
    }
    // Método para modificar una carrera 
    public boolean modificarCarrera(String nombreCarrera, String nuevoNombre, int nuevosNumCreditos, int nuevoNumSemestres) {
        for (Carrera carrera : carreras) {
            if (carrera.getNombre().equals(nombreCarrera)) {
                // Modificar los atributos del carrera encontrado
                carrera.setNombre(nuevoNombre);               
                carrera.setNumCreditos(nuevosNumCreditos);
                carrera.setNumSemestres(nuevoNumSemestres);           
                return true; // Modificación exitosa
            }
        }
        return false; // No se encontró el carrera
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }

    private int getNumCreditos() {
        return numCreditos;
    }

    public void setNumSemestres(int numSemestres) {
        this.numSemestres = numSemestres;
    }
    public int getNumSemestres() {
        return numSemestres;
    }
    public void setNivel(NivelCarrera nivel) {
        this.nivel = nivel;
    }
    public NivelCarrera getNivel() {
        return nivel;
    }
   
}

