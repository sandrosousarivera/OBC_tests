package Ejercicio2;

public class CalculadoraIVA {

    public static void main(String[] args){

        System.out.println(CalculaElIVA());

        CalculaElIVA();


    }
    static double CalculaElIVA(){
        double precio = 30;
        final double IVA = 1.21;
        double precioFinal = precio * IVA;
        return precioFinal;

    }
}
