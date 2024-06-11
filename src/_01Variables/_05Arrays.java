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

        float[] coches = new float[10];
        float  presupuesto = 0;
        int nCoches = 0;
        Scanner datosEntrada = new Scanner(System.in);
        Random aleatorio = new Random();
        for(int i = 0; i< 10; i++)
        {
            coches[i] = aleatorio.nextFloat(5000, 24000);

        }
        System.out.println("Indiqueme el presupuesto que tiene para comprar un coche y le dire el numero de coches que puede comprar:");
        presupuesto = datosEntrada.nextFloat();
        for(int i = 0; i< 10; i++)
        {
            if(coches[i] <= presupuesto)
            {
                nCoches++;
            }
        }
        System.out.println("puede comprar " + nCoches + " de nuestro catalogo");

        //Ejemplo de tirar el dado y que salga un numero random de 1 al 6
        //Lanzaremos el dado 10000 y después mostraremos los porcentajes de cada número

        Random numeroAleatorio = new Random();
        int[] dado = new int[6];
        int numRandom = 0;
        for (int a = 0; a < 100; a++) {
            numRandom = numeroAleatorio.nextInt(6);
            dado[numRandom]++;
        }
        int comprobacion= 0;
        for (int b = 0; b < 6; b++) {
            System.out.println(b + " " + dado[b] + " %");
            comprobacion+=dado[b];
        }
        System.out.println("Comprobacion -> "+ comprobacion);

        //Solicitar un número por el teclado
        //Decir si es un número primo
    }
}
