package ejercicio1;

import java.util.List;

public class Universidad extends EntidadEducativa {

    private String nombreRector;
    private String ciudadSede;
    private List<Universidad> universidades;

   
    public Universidad(String nombreEntidad, int telefono, int nit, String email, String nombreRector, String ciudadSede) {
        super(nombreEntidad, telefono, nit, email);
        this.nombreRector = nombreRector;
        this.ciudadSede = ciudadSede;
    }

    // Getters y Setters
    public String getNombreRector() {
        return nombreRector;
    }

    public void setNombreRector(String nombreRector) {
        this.nombreRector = nombreRector;
    }

    public String getCiudadSede() {
        return ciudadSede;
    }

    public void setCiudadSede(String ciudadSede) {
        this.ciudadSede = ciudadSede;
    }

    public List<Universidad> getUniversidades() {
        return universidades;
    }

    public void setUniversidades(List<Universidad> universidades) {
        this.universidades = universidades;
    }

    @Override
    public String toString() {
        return super.toString() + 
               ", Nombre del Rector: " + nombreRector +
               ", Ciudad de Sede: " + ciudadSede;
    }
}