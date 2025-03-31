package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public record Paciente (
        int numeroHistoC,
        String nombre,
        int edad,
        String telefono,
        LocalDate fechaUltimaConsulta,
        int cantTratamientosRealizdos){

}
