package practicas;

import java.util.Scanner;

public class calculadora {

    /*
    1. sumar
    2. restar
    3. dividir
    4. multiplicar
    5. raiz cuadrada
    6. raiz cubica
    7. elevar al exponente
    8. hallar su porcentaje
    9. salir
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;
        int primer_numero;
        int segundo_numero;
        int resultado;

        System.out.println("Digite la opcion ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Dividir");
        System.out.println("4. Multiplicar");
        System.out.println("5. Raiz Cuadrada");
        System.out.println("6. Raiz Cubica");
        System.out.println("7. Exponente");
        System.out.println("8. Porcentaje");
        System.out.println("9. Salir");
        System.out.println("");
        System.out.print("Digite la opcion ");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("");
                System.out.print("Digite el primer numero ");
                primer_numero = teclado.nextInt();

                System.out.print("Digite el segundo numero ");
                segundo_numero = teclado.nextInt();

                resultado = primer_numero + segundo_numero;
                System.out.println("");

                System.out.println("==============================");
                System.out.println("La suma es: " + resultado);
                System.out.println("==============================");
                break;
            case 2:
                System.out.println("");
                System.out.print("Digite el primer numero ");
                primer_numero = teclado.nextInt();

                System.out.print("Digite el segundo numero ");
                segundo_numero = teclado.nextInt();

                resultado = primer_numero - segundo_numero;
                System.out.println("");

                System.out.println("==============================");
                System.out.println("La resta es: " + resultado);
                System.out.println("==============================");
                break;
            case 3:
                System.out.println("");
                System.out.print("Digite el primer numero ");
                primer_numero = teclado.nextInt();

                System.out.print("Digite el segundo numero ");
                segundo_numero = teclado.nextInt();

                if (primer_numero == 0 || segundo_numero == 0) {
                    System.out.println("==============================");
                    System.out.println("No se puede dividir entre ceros");
                    System.out.println("==============================");
                } else {
                    resultado = primer_numero / segundo_numero;
                    System.out.println("==============================");
                    System.out.println("La division es: " + resultado);
                    System.out.println("==============================");
                }
                break;
            case 4:
                System.out.println("");
                System.out.print("Digite el primer numero ");
                primer_numero = teclado.nextInt();

                System.out.print("Digite el segundo numero ");
                segundo_numero = teclado.nextInt();

                resultado = primer_numero * segundo_numero;
                System.out.println("");

                System.out.println("==============================");
                System.out.println("La multiplicacion es: " + resultado);
                System.out.println("==============================");
                break;
            case 5:
                System.out.println("");
                System.out.print("Digite el numero ");
                primer_numero = teclado.nextInt();

                resultado = (int) Math.sqrt(primer_numero);

                System.out.println("==============================");
                System.out.println("La Raiz Cuadrada es: " + resultado);
                System.out.println("==============================");
                break;
            case 6:
                System.out.println("");
                System.out.print("Digite el numero ");
                primer_numero = teclado.nextInt();

                resultado = (int) Math.cbrt(primer_numero);

                System.out.println("==============================");
                System.out.println("La Raiz Cubica es: " + resultado);
                System.out.println("==============================");
                break;
            case 7:
                System.out.print("Digite la base (primer numero): ");
                primer_numero = teclado.nextInt();

                System.out.print("Digite el exponente ");
                segundo_numero = teclado.nextInt();

                resultado = (int) Math.pow(primer_numero, segundo_numero);

                System.out.println("==============================");
                System.out.println(primer_numero + "elevado al exponente" + segundo_numero + "es " + resultado);
                System.out.println("==============================");
                break;
            case 8:
                System.out.print("Digite el número ");
                primer_numero = teclado.nextInt();
                
                System.out.print("Digite el porcentaje ");
                segundo_numero = teclado.nextInt();
                
                resultado = (segundo_numero / 100) * primer_numero;
                System.out.println("");

                System.out.println("==============================");
                System.out.println("El " + segundo_numero + "% es " + resultado);
                System.out.println("==============================");
                break;
            case 9:
                System.out.println("");
                System.out.println("==============================");
                System.out.println("Usted ha salido de la calculadora");
                System.out.println("==============================");
                break;
            default:
                System.out.println("Opcion no disponible");
        }
    }
}
