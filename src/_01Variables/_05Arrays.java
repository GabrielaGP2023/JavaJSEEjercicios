package _01Variables;

import java.util.Random;
import java.util.Scanner;

public class _05Arrays {
    public static void main(String[] args) {
        //Realizar un programa que solicite una a una la introducción de seis notas (double)
        //Que seran guardadas en un array, y tras ello el programa dara los siguientes datos
        //Nota media, nota mas alta , aprobados (cada nota que sea un aprobado)
        //

        //Dado una serie de precios de  10 coches, se le pedira al cliente cual
        //es su presupuesto y el programa indicara a cuantos coches puede optar

//        float[] coches = new float[10];
//        float  presupuesto = 0;
//        int nCoches = 0;
//        Scanner datosEntrada = new Scanner(System.in);
//        Random aleatorio = new Random();
//        for(int i = 0; i< 10; i++)
//        {
//            coches[i] = aleatorio.nextFloat(5000, 24000);
//
//        }
//        System.out.println("Indiqueme el presupuesto que tiene para comprar un coche y le dire el numero de coches que puede comprar:");
//        presupuesto = datosEntrada.nextFloat();
//        for(int i = 0; i< 10; i++)
//        {
//            if(coches[i] <= presupuesto)
//            {
//                nCoches++;
//            }
//        }
//        System.out.println("puede comprar " + nCoches + " de nuestro catalogo");
//
//        //Ejemplo de tirar el dado y que salga un numero random de 1 al 6
//        //Lanzaremos el dado 10000 y después mostraremos los porcentajes de cada número
//
//        Random numeroAleatorio = new Random();
//        int[] dado = new int[6];
//        int numRandom = 0;
//        for (int a = 0; a < 100; a++) {
//            numRandom = numeroAleatorio.nextInt(6);
//            dado[numRandom]++;
//        }
//        int comprobacion= 0;
//        for (int b = 0; b < 6; b++) {
//            System.out.println(b + " " + dado[b] + " %");
//            comprobacion+=dado[b];
//        }
//        System.out.println("Comprobacion -> "+ comprobacion);

        //Solicitar un número por el teclado
        //Decir si es un número primo
//        Scanner entradaDatos = new Scanner(System.in);
//        int numEsPrimo;
//        System.out.println("Escriba un número");
//        numEsPrimo = entradaDatos.nextInt();
//        boolean siEsPrimo = true;
//        for (int a = 2; a < numEsPrimo; a++) {
//            if (numEsPrimo % a == 0) {
//                siEsPrimo = false;
//                break;
//            }
//        }
//        if (siEsPrimo) {
//            System.out.println("El numero " + numEsPrimo + " es primo");
//        } else {
//            System.out.println("El numero " + numEsPrimo + " no es primo");
//        }
//
        Scanner entradaDatos = new Scanner(System.in);
//        String frase;
//        int contador = 0;
//        System.out.println("introduce una frase: ");
//        frase = datosEntrada.nextLine();
//        for (int i = 0; i < frase.length(); i++) {
//            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
//                contador++;
//            }
//        }
//        System.out.println("La frase tiene " + contador + " Vocales");
//
//        //Mostrar en la consola los números de 200 al 100
//        for (int i = 200; i >= 100; i--) {
//            System.out.println(i);
//        }

        //Mostrar si un alumno tiene derecho a examen
        //Que tenga el 75% de las asistencias
        //Que tenga la documentacion
        //Solicitar el numero de horas del curso
        //Solicitar las asistencias
        //Solicitar las faltas
        //Solicitar si tiene la documentación
        //En la consola tiene que mostrarse puede presentar el examen o no

//        int horasCurso;
//        String documentacion;
//
//        // Solicitar el número total de horas del curso
//        System.out.print("Introduce el número total de horas del curso: ");
//        int horasTotales = entradaDatos.nextInt();
//
//        // Solicitar el número de asistencias del alumno
//        System.out.print("Introduce el número de asistencias del alumno: ");
//        int asistencias = entradaDatos.nextInt();
//
//        // Solicitar el número de faltas del alumno
//        System.out.print("Introduce el número de faltas del alumno: ");
//        int faltas = entradaDatos.nextInt();
//
//        // Solicitar si el alumno tiene la documentación
//        System.out.print("¿El alumno tiene toda la documentación? (si/no): ");
//        String tieneDocumentacion = entradaDatos.next();
//
//        // Calcular el porcentaje de asistencias
//        double porcentajeAsistencias = (double) asistencias / (asistencias + faltas) * 100;
//
//        // Determinar si el alumno puede presentar el examen
//        if (porcentajeAsistencias >= 75 && tieneDocumentacion.equalsIgnoreCase("si")) {
//            System.out.println("El alumno puede presentar el examen.");
//        } else {
//            System.out.println("El alumno no puede presentar el examen.");
//
//        }

        //Declarar un array de String definiendo que tenga varios artículos
        //Pedir por la consola un nombre de artículo
        //Contestar en la consola si existe en el array o no.
        //Hacerlo con un foreach.

        String[] productos={"zapatos de charol","camisetas","Polos de fresa"};
        System.out.println("Ingresa el producto que quieres mirar");
        String productoElegido=entradaDatos.nextLine();
        boolean hayproducto=false;
        for(String elemento:productos)
        {
            if (productoElegido.equals(elemento))
            {
                hayproducto=true;
            }
        }
        if (hayproducto)
        {
            System.out.println("Tenemos el producto que eligió");
        }
        else
        {
            System.out.println("No tenego el producto que eligió");
        }


    }
}