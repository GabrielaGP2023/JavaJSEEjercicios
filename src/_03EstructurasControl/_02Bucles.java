package _03EstructurasControl;

import java.util.Scanner;

public class _02Bucles {
    public static void main(String[] args) {

        //1. Pedir un número N, y mostrar todos los números del 1 al N.
        Scanner entrada = new Scanner(System.in);
//        System.out.println("Escriba un número ");
//        int numero = entrada.nextInt();
//        for (int i=1 ; i<=numero; i++){
//            System.out.println(i);
//        }
        //2. Escribir todos los números del 100 al 0 de 7 en 7.
//        for(int i=100; i>=0; i-=7){
//            System.out.println(i);
//        }
        //3. Diseñar un programa que muestre el producto de los 10 primeros números impares.
//        int producto = 1;
//        for(int i=1,numero=1; i<=10;i++,numero+=2){
//            producto*=numero;
//            System.out.println("Producto -> "+ producto + " interacion -> " + i + " numero "+ numero);
//        }
        //4. Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y
        //la cantidad de ceros.
//        int sumaPositivos=0, sumaNegativos=0, contadorPositivos=0, contadorNegativos=0, num;
//        for(int i = 1; i<=10; i++){
//            System.out.println("Escriba un número");
//            num= entrada.nextInt();
//            if(num>=0){
//                sumaPositivos+=num;
//                contadorPositivos++;
//            }else {
//                sumaNegativos+=num;
//                contadorNegativos++;
//            }
//        }
//        System.out.println("El promedio de números positivos es " + (contadorPositivos!=0?sumaPositivos/contadorPositivos:0));
//        System.out.println("El promedio de números negativos es " + (contadorNegativos!=0?sumaNegativos/contadorNegativos:0));
        //5. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
//        double sumaSueldo = 0, sueldo;
//        int contador = 0;
//        for(int i=1 ; i<=10; i++){
//            System.out.println("Escriba un sueldo ");
//            sueldo = entrada.nextDouble();
//            sumaSueldo+=sueldo;
//            contador= sueldo>1000.0?++contador:contador;
//
//        }
//        System.out.println("Suma de sueldo " + sumaSueldo + " Sueldos mayores a 1000 " + contador);

        //6. Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
        int cantidadNumeros=0;
        System.out.println("Escriba la cantidad de numeros a evaluar");
        cantidadNumeros=entrada.nextInt();
        double sueldo, sueldoMaximo = Double.MIN_VALUE;
        for(int i=0;i<cantidadNumeros;i++){
            System.out.println("Escriba un sueldo");
            sueldo = entrada.nextDouble();
            if(sueldo>sueldoMaximo){
                sueldoMaximo=sueldo;
            }
        }
        System.out.println("Sueldo máximo -> " + sueldoMaximo);


       // 1.Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
       // negativo.
        //2. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
        //3. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
        //números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
        //cuando el usuario acierta.
        //4. Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.

        //8. Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y
        //la cantidad de ceros.
        //9. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
        //10. Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
    }
}
