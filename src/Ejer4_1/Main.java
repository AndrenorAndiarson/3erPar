package Ejer4_1;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000, 5);
        cuenta.consignar(500);
        cuenta.retirar(200);
        cuenta.calcularComisionMensual();
        cuenta.mostrarInformacion();
    }
}
