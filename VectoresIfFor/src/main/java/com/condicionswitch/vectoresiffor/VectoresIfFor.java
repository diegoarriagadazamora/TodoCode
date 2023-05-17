package com.condicionswitch.vectoresiffor;

import java.util.Scanner;

public class VectoresIfFor {

    public static void main(String[] args) {
        int vector[] = new int[15];
        Scanner teclado = new Scanner(System.in);

        //Cargar nuestro Vector
        for (int i = 0; i < 15; i++) {
            System.out.println("Porfavor ingrese un numero para el vector");
            vector[i] = teclado.nextInt();
        }
        //Recorrer y contar cuantos numero 3 hay
        int cont = 0;
        for(int i=0; i<15; i++){
            if(vector[i]==3){
                cont = cont +1;
            }
        }
        System.out.println("La cantidad de numeros 3 que hay en el vector es: " + cont);
    }
}
