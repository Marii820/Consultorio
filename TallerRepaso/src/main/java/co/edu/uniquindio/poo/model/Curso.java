package co.edu.uniquindio.poo.model;
import java.util.ArrayList;


public class Curso {
    private String nombre;
    private ArrayList<Estudiante> listaEstudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        listaEstudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }

    public void registrarEstudiante(Estudiante estudiante) {
        if (estudiante == null) {
            throw new IllegalArgumentException("El estudiante no puede ser nulo.");
        }

        for (Estudiante estudianteAux : listaEstudiantes) {
            if (estudianteAux.getId().equals(estudiante.getId())) {
                throw new IllegalStateException("Ya existe un estudiante con ese ID.");
            }
        }

        listaEstudiantes.add(estudiante);
    }

}
