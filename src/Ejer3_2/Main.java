package Ejer3_2;

public class Main {
    public static void main(String[] args) {
        Cadena cadena1 = new Cadena();
        int longitud = cadena1.cadenaInicial.length();
        System.out.println("La longitud del String es = "+longitud);
        String cadenaSinEspacios = cadena1.cadenaInicial.trim();
        System.out.println("El String sin espacios en blanco = "+cadenaSinEspacios);
        String cadenaMayuscula = cadenaSinEspacios.toUpperCase();
        System.out.println("El String en mayuscula = "+cadenaMayuscula);
        String cadenaConcatenada = cadenaMayuscula.concat("12345");
        System.out.println("El String concatenado = "+ cadenaConcatenada);
        String cadenaExtraida = cadenaConcatenada.substring(24,31);
        System.out.println("El String extraido = "+ cadenaExtraida);
        String cadenaRemplazada = cadenaExtraida.replace("O","X");
        System.out.println("El String remplazado= "+ cadenaRemplazada);
        boolean comparacion= cadenaRemplazada.equals("Programacion");
        System.out.println("Los String son iguales = "+ comparacion);

    }
}
