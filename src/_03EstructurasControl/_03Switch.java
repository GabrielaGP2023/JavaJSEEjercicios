package _03EstructurasControl;

public class _03Switch {
    public static void main(String[] args) {
        //1.Declarar una variable de tipo char con valores C,D,S,V
        //si el valor es C - casado, d divorciado, s soltero, v viudo
        char estadoCivil = 'C';
        String resultado = "";
        resultado = switch(estadoCivil){
            case 'c','C' -> "Casado";
            case 'd','D' -> "Divorciado";
            case 's','S'-> "Soltero";
            case 'v','V' -> "Viudo";
            default -> "Estado civil  no valida";
        };
        System.out.println(resultado);
        //2. Dado un número de mes, número de dias de ese mes
        int mes = 2;
        String dias="";
        dias = switch (mes){
            case 2 -> "El mes tiene 28 días";
            case 4,6,9,11 -> "El mes tiene 30 dias";
            default -> "El mes tiene 31 dias";
        };
        System.out.println(dias);



    }
}
