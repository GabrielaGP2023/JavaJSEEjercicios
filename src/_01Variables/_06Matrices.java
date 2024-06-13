package _01Variables;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _06Matrices {
    public static void main(String[] args) {
        //Declarar una matriz de 5x5
        int[][] panel = new int[5][5];
        int contador=1, fila=0, columna=0,premio = 0;
        Random aleatorio = new Random();
        //Poner 7 premios en el panel con un numero
        while (contador<=7){
            fila = aleatorio.nextInt(5);
            columna = aleatorio.nextInt(5);
            premio = aleatorio.nextInt(100)+1;
            if (panel[fila][columna]==0){//Verificar que una celda puede tener un premio
                panel[fila][columna]= premio;
                contador++;
            }
        }
        System.out.println(Arrays.deepToString(panel));
        String respuesta = "";
        Scanner consola = new Scanner(System.in);
        //Hacer un bucle dos números de fila - columna  (validar que estén entre 1-5)
        do{
            do{
                System.out.println("Escriba la fila->");
                fila = consola.nextInt();
            }while (fila<0 || fila >5);
            do{
                System.out.println("Escriba la columna->");
                columna = consola.nextInt();
            }while (columna<=0 || columna >=5);
            if(panel[fila-1][columna-1]==0){
                System.out.println("Lo sentimos no ha tenido premio");
            }else{
                System.out.println("Su premio es de " + panel[fila-1][columna-1]);
            }
            System.out.println("Quiere continuar jugando --> ");
            respuesta = consola.next();
        }while(respuesta.equalsIgnoreCase("s"));
        //Romper el bucle cuando se pregunte si continuar y respondan NO

    }
}
