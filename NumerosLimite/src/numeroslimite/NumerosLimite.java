package numeroslimite;

import java.util.Scanner;

public class NumerosLimite {
    public static void main(String[] args) {
       //Tenemos un limite hasta el que tenmos que contar
       //Ingresar ese limite
       
        System.out.println("Ingrese el limite hasta el que quiere contar");
        Scanner teclado = new Scanner (System.in);
        int limite = teclado.nextInt();
        
        int cont = 0;
        
        while(cont <= limite){
        System.out.println(cont);
        cont = cont +2;
        }
    }
    
}
