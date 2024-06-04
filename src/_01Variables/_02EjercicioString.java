package _01Variables;

public class _02EjercicioString {
    public static void main(String[] args) {
        /*
        Crear la cadena de texto: “Nunca mates una mosca sobre la cabeza de un tigre.”
        • Mostrar la cadena toda en mayúsculas
        • Mostrar la cadena en minúsculas
        • Mostrar solo la palabra Nunca
        • Mostrar solo la palabra mosca
        • Mostrar la palabra cabeza
        • Mostrar la posición de la letra primera m
        • Devolver la longitud de la cadena
         */
        String tigre = "Nunca mates una mosca sobre la cabeza de un tigre.";
        System.out.println(tigre.toUpperCase());
        System.out.println(tigre.toLowerCase());
        System.out.println(tigre.substring(0, "Nunca".length()));
        int posicion = tigre.indexOf("mosca");
        System.out.println(tigre.substring(posicion, posicion + "mosca".length()));
        System.out.println(tigre.substring(31, 37));
        System.out.println(tigre.indexOf("m"));
        System.out.println(tigre.length());

    }
}

