package com.condicionswitch.calculoimc;

import java.util.Scanner;

public class CalculoImc {

    public static void main(String[] args) {
        
        double peso, estatura, imc;
        
        System.out.println("Ingrese por favor su peso en Kgs");
        Scanner teclado = new Scanner (System.in);
        peso = teclado.nextInt();
        
        System.out.println("Ingrese por favor su estatura en metros");
        Scanner teclado2 = new Scanner (System.in);
        estatura = teclado2.nextInt();
        
        imc = peso/(estatura*estatura);
        
        System.out.println("su indice de masa corporal es; " + imc);
    }
}