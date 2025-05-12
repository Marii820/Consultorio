package co.edu.uniquindio.poo.model;

public class Estudiante {
        private String nombre;
        private String id;
        private String apellido;
        private String email;
        private String telefono;
        private int edad;

        public Estudiante (String nombre, String id, String apellido, String email, String telefono, int edad) {
            this.nombre = nombre;
            this.id = id;
            this.apellido = apellido;
            this.email = email;
            this.telefono = telefono;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        @Override
        public String toString() {
            return "Estudiante{" +
                    "nombre='" + nombre + '\'' +
                    ", id='" + id + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", email='" + email + '\'' +
                    ", telefono='" + telefono + '\'' +
                    ", edad=" + edad +
                    '}';
        }

}
