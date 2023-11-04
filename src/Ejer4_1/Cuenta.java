package Ejer4_1;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones;
    protected int numeroRetiros;
    protected float tasaAnual;
    protected float comisionMensual;

    public Cuenta(float saldoInicial, float tasaAnual) {
        this.saldo = saldoInicial;
        this.tasaAnual = tasaAnual;
        this.numeroConsignaciones = 0;
        this.numeroRetiros = 0;
        this.comisionMensual = 0.0f;
    }

    public void consignar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numeroConsignaciones++;
        } else {
            System.out.println("La cantidad a consignar debe ser mayor que cero.");
        }
    }

    public void retirar(float cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            numeroRetiros++;
        } else {
            System.out.println("No es posible realizar el retiro. Verifique el saldo o la cantidad a retirar.");
        }
    }

    public void calcularInteresMensual() {
        float interesMensual = (saldo * (tasaAnual / 12)) / 100;
        saldo += interesMensual;
    }

    public void extractoMensual() {
        calcularInteresMensual();
        saldo -= comisionMensual;
    }

    public void imprimir() {
        System.out.println("Saldo: $" + saldo);
        System.out.println("Número de consignaciones: " + numeroConsignaciones);
        System.out.println("Número de retiros: " + numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual + "%");
        System.out.println("Comisión mensual: $" + comisionMensual);
    }

}