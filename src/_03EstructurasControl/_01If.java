package _03EstructurasControl;

public class _01If {
    public static void main(String[] args) {
        //hacer una estructura para decir si un número es positivo o negativo
        //1. Declarar la variable
//        int numero = -6;
//        //2. Estructura de control If
//        if(numero>=0){
//            System.out.println("El número es positivo");
//        }else{
//            System.out.println("El número es negativo");
//        }
        //Declarar dos cantidades y decir cual es la mayor de las dos

//        int cantidad1 = 25;
//        int cantidad2 = 25;
//        if(cantidad1 > cantidad2){
//            System.out.println("Cantidad1 es mayor : "+ cantidad1);
//
//        }else if (cantidad1== cantidad2) {
//            System.out.println("Las cantidades son iguales " + cantidad1);
//        } else
//            {
//                System.out.println("Cantidad2 es mayor : "+ cantidad2);
//            }
//        }
        //Sobre una nota decir si aprobado o suspenso
        // 1 - 10
        // 5 Aprobado
//        float nota = 4f;
//        if (nota >= 5.0) {
//            System.out.println("Aprobado con la nota : " + nota);
//        } else {
//            System.out.println("Suspendido con la nota " + nota);
//        }
        //Definir un número y decir si es par o impar
//        int x = 3;
//        if(x%2==0){
//            System.out.println("El numero es par " + x);
//        }else{
//            System.out.println("El numero es impar " + x);
//        }
        //Decir por la edad si se puede votar
        //Decir si la contraseña es correcta debe ser igual a 1234A

//        int edad = 19;
//        boolean inscrito = false;
//        if (edad >= 18 && inscrito) {
//            System.out.println("Eres elegible para votar.");
//        } else {
//            System.out.println("No eres elegible para votar.");
//        }

//        String contrasena = "123";
//        final String  contrasenaCorrecta="1234";
//
//        if (contrasena.equals(contrasenaCorrecta)) {
//            System.out.println("Contraseña correcta.");
//        } else {
//            System.out.println("Contraseña incorrecta.");
//        }
        //Verifica si un número está dentro del rango 10-20 o es igual a 30.
        int numero = 15;
        if(numero >=10 && numero <=20 || numero == 30){
            System.out.println("El numero " + numero + " cumple estar en el rango de 10-20 o es igual a 30");
        } else{
            System.out.println("El numero no cumple con las condiciones");
        }
        //Si la cantidad es mayor a 3 y el producto es "Manzana" dar un 5% de descuento
        int cantidad = 5;
        String nombreProducto = "Manzana";
        if(cantidad>3 && nombreProducto.equals("Manzana")){
            System.out.println("Tiene un descuento del 5%");
        }else {
            System.out.println("No cumple con alguna condicion");
        }
        //Pedir dos números y decir cual es el mayor o si son iguales.
        int numero1=5, numero2=7;
        if(numero1>numero2){
            System.out.println("El numero1 es mayor " + numero1);
        } else if(numero1==numero2){
            System.out.println("Son iguales con valor " + numero1);
        }else{
            System.out.println("El numero2 es mayor " + numero2);
        }

        //Pedir dos números y mostrarlos ordenados de mayor a menor.
        int numeroA=5, numeroB=7;
        if(numeroA>numeroB){
            System.out.println("De mayor a menor " + numeroA + " " +numeroB);
        }
        else{
            System.out.println("De mayor a menor " + numeroB + " " +numeroA);
        }
        //Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene
        int num = 44;
        if(num <10 ){
            System.out.println("El numero tiene una cifra");
        }else if(num < 100){
            System.out.println("El numero tiene dos cifras");
        }else if(num < 1000){
            System.out.println("El numero tiene tres cifras");
        }else {
            System.out.println("El numero tiene cuatro cifras");
        }
        //Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
        int numeroAnalizar = 8032;
        int unidades, decenas, centenas, millares, x;
        x= numeroAnalizar;
        unidades = x % 10;
        x= numeroAnalizar / 10;
        decenas = x % 10;
        x = x /10;
        centenas = x % 10;
        x = x/10;
        millares = x;
        if(millares>0){
            System.out.print("Cifra ->" +unidades+decenas+centenas+millares);
        } else if(centenas>0){
            System.out.println("Cifra ->" +unidades+decenas+centenas);
        } else if (decenas>0){
            System.out.print("Cifra ->" +unidades+decenas);
        }else{
            System.out.println("Cifra ->" +unidades);
        }


    }
}


