package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EntidadEducativa {

    private String nombreEntidad;
    private int telefono;
    private int nit;
    private String email;

  
    private static List<EntidadEducativa> entidades = new ArrayList<>();


    public EntidadEducativa(String nombreEntidad, int telefono, int nit, String email) {
        this.nombreEntidad = nombreEntidad;
        this.telefono = telefono;
        this.nit = nit;
        this.email = email;
    }

  

    // Registrar una nueva entidad
    public static void registrarEntidad(String nombreEntidad, int telefono, int nit, String email) {
        EntidadEducativa entidad = new EntidadEducativa(nombreEntidad, telefono, nit, email);
        entidades.add(entidad);
    }

    // Consultar todas las entidades existentes
    public static List<EntidadEducativa> consultarEntidades() {
        return new ArrayList<>(entidades);
    }

    // Consultar entidades por NIT
    public static EntidadEducativa consultarPorNit(int nit) {
        for (EntidadEducativa entidad : entidades) {
            if (entidad.getNit() == nit) {
                return entidad;
            }
        }
        return null;
    }

    // Consultar entidades por nombre
    public static List<EntidadEducativa> consultarPorNombre(String nombreEntidad) {
        return entidades.stream()
                        .filter(e -> e.getNombreEntidad().equalsIgnoreCase(nombreEntidad))
                        .collect(Collectors.toList());
    }

    // Modificar una entidad existente
    public static boolean modificarEntidad(int nit, String nuevoNombre, int nuevoTelefono, String nuevoEmail) {
        for (EntidadEducativa entidad : entidades) {
            if (entidad.getNit() == nit) {
                entidad.setNombreEntidad(nuevoNombre);
                entidad.setTelefono(nuevoTelefono);
                entidad.setEmail(nuevoEmail);
                return true;
            }
        }
        return false;
    }

    // Eliminar una entidad existente
    public static boolean eliminarEntidad(int nit) {
        for (EntidadEducativa entidad : entidades) {
            if (entidad.getNit() == nit) {
                entidades.remove(entidad);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Nombre de la Entidad: " + nombreEntidad +
               ", Teléfono: " + telefono +
               ", NIT: " + nit +
               ", Email: " + email;
    }
    // Getters y Setters
    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}