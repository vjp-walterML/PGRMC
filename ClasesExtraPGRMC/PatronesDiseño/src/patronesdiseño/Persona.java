package patronesdiseño;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String correoElectronico;
    private String numeroTelefono;

    //Constructores
    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.direccion = "";
        this.correoElectronico = "";
        this.numeroTelefono = "";
    }

    public Persona(String nombre, String apellido, int edad, String direccion, String correoElectronico, String numeroTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.numeroTelefono = numeroTelefono;
    }

    //Getter y setter 
    public static class PersonaBuilder {

        private String nombre;
        private String apellido;
        private int edad;
        private String direccion;
        private String correoElectronico;
        private String numeroTelefono;

        public PersonaBuilder buildNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public PersonaBuilder buildApellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public PersonaBuilder buildEdad(int edad) {
            this.edad = edad;
            return this;
        }

        public PersonaBuilder buildDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public PersonaBuilder buildCorreoElectronico(String correoElectronico) {
            this.correoElectronico = correoElectronico;
            return this;
        }

        public PersonaBuilder buildNumeroTelefono(String numeroTelefono) {
            this.numeroTelefono = numeroTelefono;
            return this;
        }

        public Persona build() {
            return new Persona(nombre, apellido, edad, direccion, correoElectronico, numeroTelefono);
        }

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", direccion=" + direccion + ", correoElectronico=" + correoElectronico + ", numeroTelefono=" + numeroTelefono + '}';
    }

}
