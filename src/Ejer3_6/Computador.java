package Ejer3_6;

public class Computador {
    String marca,caracteristicasProcesador,sisteOpera;
    double precio;
    int cantidadMemoria;

    public Computador(String marca,int cantidadMemoria,String caracteristicasProcesador,String sisteOpera,double precio){
        this.marca= marca;
        this.cantidadMemoria=cantidadMemoria;
        this.caracteristicasProcesador=caracteristicasProcesador;
        this.sisteOpera=sisteOpera;
        this.precio=precio;
    }
}
