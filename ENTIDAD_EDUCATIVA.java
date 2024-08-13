
import ;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class ENTIDAD_EDUCATIVA {

    /**
     * Default constructor
     */
    public ENTIDAD_EDUCATIVA() {
    }

    /**
     * 
     */
    public string Nombre_entidad;

    /**
     * 
     */
    public string Direccion_entidad;

    /**
     * 
     */
    public int Telefono_entidad;

    /**
     * 
     */
    public int Nit_entidad;

    /**
     * 
     */
    public string email_entidad;

    /**
     * 
     */
    public void registrar() {
        // TODO implement here
    }

    /**
     * 
     */
    public void consultar() {
        // TODO implement here
    }

    /**
     * 
     */
    public void modificar() {
        // TODO implement here
    }

    /**
     * 
     */
    public void eliminar() {
        // TODO implement here
    }

    /**
     * 
     */
    public class UNIVERSIDAD extends ENTIDAD_EDUCATIVA {

        /**
         * Default constructor
         */
        public UNIVERSIDAD() {
        }

        /**
         * 
         */
        public string Nombre_rector;

        /**
         * 
         */
        public string Ciudad_sede;

        /**
         * 
         */
        public class FACULTAD {

            /**
             * Default constructor
             */
            public FACULTAD() {
            }

            /**
             * 
             */
            public string Nombre_facultad;

            /**
             * 
             */
            public int Codigo;

            /**
             * 
             */
            public void agregar() {
                // TODO implement here
            }

            /**
             * 
             */
            public void consultar() {
                // TODO implement here
            }

            /**
             * 
             */
            public class CARRERA {

                /**
                 * Default constructor
                 */
                public CARRERA() {
                }

                /**
                 * 
                 */
                public string Nombre;

                /**
                 * 
                 */
                public int Creditos_totales;

                /**
                 * 
                 */
                public int Numero_semestres;

                /**
                 * 
                 */
                public Nivel_carrera Nivel_carrera;

                /**
                 * 
                 */
                public void agregar() {
                    // TODO implement here
                }

                /**
                 * 
                 */
                public void consultar() {
                    // TODO implement here
                }

                /**
                 * 
                 */
                public void modificar() {
                    // TODO implement here
                }

            }

            /**
             * 
             */
            public class CURSO {

                /**
                 * Default constructor
                 */
                public CURSO() {
                }

                /**
                 * 
                 */
                public int Codigo;

                /**
                 * 
                 */
                public string Nombre_curso;

                /**
                 * 
                 */
                public int Creditos_curso;

                /**
                 * 
                 */
                public int Numero_salon;

                /**
                 * 
                 */
                public string Nombre_edificio;

                /**
                 * 
                 */
                public void agregar() {
                    // TODO implement here
                }

                /**
                 * 
                 */
                public void consultar() {
                    // TODO implement here
                }

                /**
                 * 
                 */
                public void modificar() {
                    // TODO implement here
                }

                /**
                 * 
                 */
                public void eliminar() {
                    // TODO implement here
                }

            }

            /**
             * 
             */
            public class PERSONA extends ENTIDAD_EDUCATIVA.UNIVERSIDAD.FACULTAD {

                /**
                 * Default constructor
                 */
                public PERSONA() {
                }

                /**
                 * 
                 */
                public int Cedula;

                /**
                 * 
                 */
                public string Nombre_persona;

                /**
                 * 
                 */
                public Date Fecha_nacimiento;

                /**
                 * 
                 */
                public string Lugar_nacimiento_ciudad;

                /**
                 * 
                 */
                public string Lugar_nacimiento_departamento;

                /**
                 * 
                 */
                public string Lugar_nacimiento_pais;

                /**
                 * 
                 */
                public class PROFESOR extends ENTIDAD_EDUCATIVA.UNIVERSIDAD.FACULTAD.PERSONA {

                    /**
                     * Default constructor
                     */
                    public PROFESOR() {
                    }

                    /**
                     * 
                     */
                    public string Profesion_profesor;

                    /**
                     * 
                     */
                    public string Nacionalidad_profesor;

                    /**
                     * 
                     */
                    public int Sueldo_profesor;

                    /**
                     * 
                     */
                    public void agregar() {
                        // TODO implement here
                    }

                    /**
                     * 
                     */
                    public void consultar() {
                        // TODO implement here
                    }

                    /**
                     * 
                     */
                    public void modificar() {
                        // TODO implement here
                    }

                }

                /**
                 * 
                 */
                public class ESTUDIANTE extends ENTIDAD_EDUCATIVA.UNIVERSIDAD.FACULTAD.PERSONA {

                    /**
                     * Default constructor
                     */
                    public ESTUDIANTE() {
                    }

                    /**
                     * 
                     */
                    public string Colegio_graduado;

                    /**
                     * 
                     */
                    public Date Fecha_Ingreso;

                    /**
                     * 
                     */
                    public void agregar() {
                        // TODO implement here
                    }

                    /**
                     * 
                     */
                    public void consultar() {
                        // TODO implement here
                    }

                    /**
                     * 
                     */
                    public void modificar() {
                        // TODO implement here
                    }

                }

            }

        }

    }

}