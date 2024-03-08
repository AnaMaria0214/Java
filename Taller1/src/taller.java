import javax.swing.*;
import java.util.jar.JarOutputStream;

public class taller {
    public static void main(String[] args) {
        //Ejercicio 1: Calculadora Básica
//Escribe un programa que pida al usuario dos números y luego muestre el resultado de sumar, restar,
//multiplicar y dividir esos números. Utiliza tipos de datos primitivos para almacenar los números y
//los resultados.

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));

        String option = JOptionPane.showInputDialog(null, """
                ===Calculadora===
                1.Sumar
                2.Restar
                3.Multiplicar
                4.Dividir
                5.Salir
                """);

        switch (option) {
            case "1":
                    JOptionPane.showMessageDialog(null,"La suma de" + num1 + "+"+ num2 +"es:"+(num1+num2));
                break;

            case "2":
                break;

            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
        }
    }
}




