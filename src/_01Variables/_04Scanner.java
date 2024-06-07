package _01Variables;

import java.util.Scanner;

public class _04Scanner {
    public static void main(String[] args) {
        int numero;
        Scanner datoEntrada = new Scanner(System.in);
        System.out.println("Escriba un número ");
        numero = datoEntrada.nextInt();
        System.out.println("Valor de numero " + numero);
        datoEntrada.nextLine();
        String frase;
        System.out.println("Escriba una frase");
        frase = datoEntrada.nextLine();
        System.out.println(frase);



    }
}
