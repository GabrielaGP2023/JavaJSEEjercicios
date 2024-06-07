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
//        int sumaPositivos=0, sumaNegativos=0, contadorPositivos=0, contadorNegativos=0,contadorCeros=0, num;
//        for(int i = 1; i<=10; i++){
//            System.out.println("Escriba un número");
//            num= entrada.nextInt();
//            if(num>0){
//                sumaPositivos+=num;
//                contadorPositivos++;
//            }else if(num< 0){
//                sumaNegativos+=num;
//                contadorNegativos++;
//            } else {
//                contadorCeros++;
//            }
//        }
//        System.out.println("El promedio de números positivos es " + (contadorPositivos!=0?sumaPositivos/contadorPositivos:0));
//        System.out.println("El promedio de números negativos es " + (contadorNegativos!=0?sumaNegativos/contadorNegativos:0));
//        System.out.println("Contador de ceros " + contadorCeros);

        //5. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
//        double sumaSueldo = 0, sueldo;
//        int contador = 0;
//        for(int i=1 ; i<=10; i++){
//            System.out.println("Escriba un sueldo ");
//            sueldo = entrada.nextDouble();
//            sumaSueldo+=sueldo;
//            if(sueldo>1000){
//                contador++;
//            }
//            //contador= sueldo>1000.0?++contador:contador;
//
//        }
//        System.out.println("Suma de sueldo " + sumaSueldo + " Sueldos mayores a 1000 " + contador);

        //6. Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
//        int cantidadNumeros=0;
//        System.out.println("Escriba la cantidad de numeros a evaluar");
//        cantidadNumeros=entrada.nextInt();
//        double sueldo, sueldoMaximo = Double.MIN_VALUE;
//        System.out.println("Valor minimo de Double - " + Double.MIN_VALUE);
//        for(int i=0;i<cantidadNumeros;i++){
//            System.out.println("Escriba un sueldo");
//            sueldo = entrada.nextDouble();
//            if(sueldo>sueldoMaximo){
//                sueldoMaximo=sueldo;
//            }
//        }
//        System.out.println("Sueldo máximo -> " + sueldoMaximo);


        // 1.Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
        // negativo.
        double num,cuadrado;
        // num guardará el número que leamos
        // y cuadrado guardará el cuadrado de num
        System.out.print("Introduzca número: ");
        num=entrada.nextInt();
        while(num>=0){ // repetimos el proceso mientras el número leído no sea negativo
            cuadrado=Math.pow(num,2);;
            System.out.println(num+ "² es igual a "+ cuadrado);
            System.out.print("Introduzca otro número: ");
            num=entrada.nextInt(); // volvemos a leer num
        }
        //2. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
//        int num, contador;// num guardará los números introducidos
//        // y contador se incrementará para llevar la cuenta de los números introducidos
//        contador = 0; // al comienzo el número de números introducidos es 0
//        System.out.print("Introduzca un número: ");
//        num = entrada.nextInt();
//        while (num > 0) // mientras num sea positiva
//        {
//            contador++; // contador toma el valor que tuviera en este momento más uno
//            System.out.print("Introduzca otro número: ");
//            num = entrada.nextInt();
//        }
//        System.out.println("Se han introducido: " + contador + " números");// sin tener en cuenta el último número negativo.

        //3. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
        //números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
        //cuando el usuario acierta.
//        int n, num, contador=0;
//        // num guarda los números introducidos
//        System.out.print("Introduce N: ");
//        n =entrada.nextInt();
//
//        while(true) // mientras no coincidan ambos números
//        {
//            System.out.print("Introduce número: ");
//            num=entrada.nextInt();
//            contador++;
//            if(num>n)
//                System.out.println("menor");
//            else if (num<n){
//                System.out.println("mayor");}
//            if(num==n){
//                break;
//            }
//
//        }
        // al salir del mientras tenemos la certeza que num es igual a n
//        System.out.println("acertaste... en intentos " + contador);
        //4. Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.

//        int num,suma;
//        suma=0;
//        do
//        {
//            System.out.print("Introduzca un número: ");
//            num= entrada.nextInt();
//            suma=suma+num;
//        }
//        while(num!=0);
//        System.out.println("La suma de todos los números es: "+suma);

        //5. Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y
        //la cantidad de ceros.
        //6. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
        //7. Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
        //8. Hacer un programa que solicite dos números Y nos diga cuantos multiplos de 5 hay entre ambos numeros Si alguno de los números es negativo, se vuelve a pedir
        //8. Comprobar primo
        //9. Hacer un programa que solicite la introducción de un PIN Si es correcto, le muestra un mensaje y el programa termina Si es incorrecto, le informa de ello al usuario
        // y le solicita De nuevo el pin. Si falla tres veces en la introducción del pin Le muestra mensaje de error, y el programa termina
        //
    }
}
