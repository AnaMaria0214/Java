import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {

        /*// contador simple> escribe un programa que utilice un bucle for para imprimir cada numero en consola//
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }*/

        /*// suma de numeros: utiliza un bucle while para sumar los numeros del 1 al 100 e imprimir el resultado//
        int contador = 0;
        int sumaTotal = 0;
        while (contador <=100){
            sumaTotal += contador;
            contador++;
        }
        System.out.println(sumaTotal);*/

        /*//tablas de multiplicar
        for (int i= 1; i<=10; i++){
            System.out.println("Tabla del ");
        }*/


        //sistema operativo

            String option ;
            int saldo = 0;

                    do{
                        option= JOptionPane.showInputDialog(null,"\n\n MENÚ DE OPCIONES \n\n" +
                                "1. Ver saldo\n"+
                                "2. depositar dinero\n"+
                                "3. Retirar dinero\n"+
                                "4. Salir\n"
                        );
                        switch (option){
                            case "1":
                                JOptionPane.showMessageDialog(null, "tu saldo actual es: $"+ saldo );
                                break;
                            case "2":
                                String precioString = JOptionPane.showInputDialog(null,"Ingresa el valor a depositar");

                                try{
                                    double precio = Double.parseDouble(precioString);
                                    saldo += precio;
                                    JOptionPane.showMessageDialog(null,"Dinero ingresado correctamente ,Tu saldo actual es: $"+ saldo);

                                } catch (Exception e){
                                    JOptionPane.showMessageDialog(null,"Los caracteres ingresados no son validos");
                                }
                                break;
                            case "3":
                                try {

                                    double valorRetiro = Double.parseDouble(JOptionPane.ShowInputDialog(null, "Ingresa el valor a retirar:"));
                                    if (valorRetiro <= saldo) {
                                        saldo -= valorRetiro;
                                        JOptionPane.showMessageDialog(null, "Retiro exitoso,Tu saldo actual es: $" + saldo);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Los caracteres ingresados no son validos");
                                    }
                                } catch (Exception e){
                                    JOptionPane.showMessageDialog(null,"Los caracteres ingresados no son validos");
                                }
                        }
                    }while (option.equals("4"));

        }
    }
