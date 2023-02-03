package com.bootcamp;

public class App 
{
    public static void main( String[] args )
    {
        suma(2,4,6);
        Coche miCoche = new Coche();
        miCoche.constructorDePuertas();
        System.out.print(miCoche.numeroPuertas);

    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}

public class Coche
{
    int numeroPuertas=0;

    public int constructorDePuertas(){
        this.numeroPuertas++;
    }

}
