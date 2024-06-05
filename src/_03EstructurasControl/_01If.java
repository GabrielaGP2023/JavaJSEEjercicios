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
        float nota = 4f;
        if (nota >= 5.0) {
            System.out.println("Aprobado con la nota : " + nota);
        } else {
            System.out.println("Suspendido con la nota " + nota);
        }
        //Definir un número y decir si es par o impar
        int x = 3;
        if(x%2==0){
            System.out.println("El numero es par " + x);
        }else{
            System.out.println("El numero es impar " + x);
        }
    }
}

