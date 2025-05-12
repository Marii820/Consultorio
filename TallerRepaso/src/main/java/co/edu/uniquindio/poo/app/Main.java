package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Estudiante;
import co.edu.uniquindio.poo.model.Universidad;
import co.edu.uniquindio.poo.model.Curso;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Universidad universidad = new Universidad("UQ");

        Estudiante estudiante1 = new Estudiante("Luis", "123","Florez", "luisest", "311",23);
        Estudiante estudiante2 = new Estudiante("Claudia", "234","Mancera", "ClauMan", "300",12);
        Estudiante estudiante3= new Estudiante("Santy", "345","Perez", "santyperez", "311",34);

        universidad.registrarEstudiante(estudiante1);
        universidad.registrarEstudiante(estudiante2);
        universidad.registrarEstudiante(estudiante3);

        Curso curso = new Curso("programacion1");
        curso.registrarEstudiante(estudiante1);
        curso.registrarEstudiante(estudiante2);
        curso.registrarEstudiante(estudiante3);


        System.out.println(curso);
    }
}