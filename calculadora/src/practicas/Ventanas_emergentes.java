package practicas;

import javax.swing.JOptionPane;

public class Ventanas_emergentes {

    public static void main(String[] args) {

        //Creamos las variables
        String cadena;
        char caracter;
        int numero_entero;
        double numero_decimal;
        float numero_flotante;

        //Aplicamos las ventanas emergentes
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        caracter = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        numero_entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero_decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
        numero_flotante = Float.parseFloat(JOptionPane.showInputDialog("digite un flotante: "));

        JOptionPane.showMessageDialog(null, "la cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "el caracter es: " + caracter);
        JOptionPane.showMessageDialog(null,"el numero entero es: " + numero_entero);
        JOptionPane.showMessageDialog(null,"el numero decimal es: " + numero_decimal);
        JOptionPane.showMessageDialog(null,"el numero flotante es: " + numero_flotante);
    }
}
