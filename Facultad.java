package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Facultad {

	private String nombre;
    private int codigo;
    private List<Facultad> facultades;

    public Facultad(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.facultades = new ArrayList<>();
        
    }
    
    public void agregarFacultad(Facultad facultad) {
        facultades.add(facultad);
    }


    public List<Facultad> listarFacultades() {
        return facultades;
    }
    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }
              
}