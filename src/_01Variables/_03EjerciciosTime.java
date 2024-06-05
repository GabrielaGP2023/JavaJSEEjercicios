package _01Variables;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _03EjerciciosTime{
    public static void main(String[] args) {
        //
        /*
                1. Ejercicios
        a. //Declarar la fecha de inicio del curso y le sumamos 10 días
        b. //Declarar la fecha de hoy con la zona horaria por defecto
        c. //Declarar la fecha de hoy con la zona horaria de “Australia/Sydney”
        d. //Cual es el día 100 de 2024
        e. //Definir una fecha para navidad y otra para noche vieja y compararlas
        con los métodos isBefore isAfter
        f. Calcular la fecha resultante sumando 35 semanas al 15 de marzo de
        2024.
        g. Calcular los años trabajados en una empresa de un empleado que inició
        a trabajar el 6 de Julio de 2012
        h. Calcular la edad de una persona que nació el 7 de agosto de 2007
        i. Calcular la fecha en que se tiene que iniciar un proyecto si su duración
        es 200 días y se tiene que entregar el 2 de octubre de 2024
        j. Si un proyecto inicia el 15 de marzo y termina el 20 de octubre cuál es
        su periodo.
         */
        //a.
        LocalDate fInicioCurso = LocalDate.of(2024, 04, 02);
        System.out.println("a.");
        System.out.println("Fecha de inicio del curso: " + fInicioCurso);
        System.out.println("Fecha después de 10 días: " + fInicioCurso.plusDays(10));

        //b.
        LocalDate fHoraria = LocalDate.now();
        System.out.println("\nb.");
        System.out.println("Fecha horaria de hoy: " + fHoraria);

        //c.
        ZoneId sydney = ZoneId.of("Australia/Sydney");
        ZonedDateTime fSydney = ZonedDateTime.now(sydney);
        LocalDate fHoySydney = fSydney.toLocalDate();
        System.out.println("\nc.");
        System.out.println("Fecha horaria de hoy en Australia/Sydney: " + fHoySydney);

        //d.
        LocalDate enero01 = LocalDate.of(2024, 01, 01);
        LocalDate fDia100 = enero01.plusDays(100);
        System.out.println("\nd.");
        System.out.println("El dia 100 de 2024 es " + fDia100);

        //e.
        LocalDate fNavidad = LocalDate.of(2024, 12, 25);
        LocalDate fNocheVieja = LocalDate.of(2024, 12, 31);
        System.out.println("\ne.");
        System.out.println("Navidad isBefore Noche vieja: " + fNavidad.isBefore(fNocheVieja));
        System.out.println("Navidad isAfter Noche vieja: " + fNavidad.isAfter(fNocheVieja));

        //f.
        LocalDate fecha = LocalDate.of(2024, 03, 15);
        System.out.println("\nf.");
        System.out.println("La fecha después de 35 sem: " + fecha.plusWeeks(35));

        //g.
        LocalDate fInicioTrabajo = LocalDate.of(2012, 07, 06);
        LocalDate fActual = LocalDate.now();
        Period periodo = Period.between(fInicioTrabajo, fActual);
        int anyosTrabajados = periodo.getYears();
        System.out.println("\ng.");
        System.out.println("Lleva trabajando " + anyosTrabajados + " años en la empresa.");

        //h.
        LocalDate fNacimiento = LocalDate.of(2007, 8, 07);
        LocalDate fHoy = LocalDate.now();
        Period periodoNac = Period.between(fNacimiento, fHoy);
        int edad = periodoNac.getYears();
        System.out.println("\nh.");
        System.out.println("Fecha nacimiento: " + fNacimiento + " | Edad: " + edad);

        //i.
        LocalDate fEntrega = LocalDate.of(2024, 10, 02);
        LocalDate fInicioProy = fEntrega.minusDays(200);
        System.out.println("\ni.");
        System.out.println("Fecha inicio de proyecto: " + fInicioProy);

        //j.
        LocalDate fInitProy = LocalDate.of(2024, 03, 15);
        LocalDate fFinProy = LocalDate.of(2024, 10, 20);
        Period periodoProy = Period.between(fInitProy, fFinProy);
        System.out.println("\nj.");
        System.out.println("El periodo entre la fecha de inicio y de fin del proyecto es: " + periodoProy.getDays() + " días, " + periodoProy.getMonths() + " meses y " + periodoProy.getYears() + " años.");

    }
}
