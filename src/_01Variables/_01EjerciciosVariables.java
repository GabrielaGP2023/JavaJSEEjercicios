package _01Variables;

public class _01EjerciciosVariables {

            public static void main(String[] args) {
                // Ejemplo 1: Cálculo de edad
                int anioNacimiento = 1990;
                int anioActual = 2024;
                int edad = anioActual - anioNacimiento;
                System.out.println("Edad: " + edad);

                // Ejemplo 2: Conversión de temperatura (Celsius a Fahrenheit)
                float celsius = 25.0f;
                float fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Temperatura en Fahrenheit: " + fahrenheit);

                // Ejemplo 3: Cálculo de área de un círculo
                double radio = 7.5;
                double area = Math.PI * radio * radio;
                System.out.println("Área del círculo: " + area);

                // Ejemplo 4: Conversión de minutos a horas y minutos
                int totalMinutos = 135;
                int horas = totalMinutos / 60;
                int minutos = totalMinutos % 60;
                System.out.println(totalMinutos + " minutos son " + horas + " horas y " + minutos + " minutos");

                // Ejemplo 5: Cálculo del interés compuesto
                double principal = 1000.0;
                double tasa = 5.0 / 100; // 5% tasa de interés
                int anios = 10;
                double interesCompuesto = principal * Math.pow((1 + tasa), anios);
                System.out.println("Interés compuesto después de " + anios + " años: " + interesCompuesto);

                // Ejemplo 6: Cálculo de promedio de calificaciones
                int nota1 = 85;
                int nota2 = 90;
                int nota3 = 78;
                double promedio = (nota1 + nota2 + nota3) / 3.0;
                System.out.println("Promedio de calificaciones: " + promedio);

                // Ejemplo 7: Operaciones con cadenas y caracteres
                String saludo = "Hola";
                char primerCaracter = saludo.charAt(0);
                int longitud = saludo.length();
                System.out.println("Primer carácter de '" + saludo + "': " + primerCaracter);
                System.out.println("Longitud de '" + saludo + "': " + longitud);

                // Ejemplo 8: Conversión de peso (kilogramos a libras)
                double kilos = 70.0;
                double libras = kilos * 2.20462;
                System.out.println(kilos + " kilogramos son " + libras + " libras");

                // Ejemplo 9: Cálculo de pago mensual de un préstamo
                double montoPrestamo = 15000.0;
                double tasaAnual = 3.5 / 100; // 3.5% tasa anual
                int periodoPrestamo = 5; // en años
                double tasaMensual = tasaAnual / 12;
                int numeroPagos = periodoPrestamo * 12;
                double pagoMensual = (montoPrestamo * tasaMensual) / (1 - Math.pow(1 + tasaMensual, -numeroPagos));
                System.out.println("Pago mensual del préstamo: " + pagoMensual);

                // Ejemplo 10: Conversión de millas a kilómetros
                double millas = 60.0;
                double kilometros = millas * 1.60934;
                System.out.println(millas + " millas son " + kilometros + " kilómetros");
            }
        }


