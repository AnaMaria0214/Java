import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Libro objLibro = new Libro( "100 años de soledad",
                "Gabriel Garcia Marquez","01-05-1967",false);

        System.out.println(objLibro.getTitulo());

        objLibro.setTitulo("El rastro de tu sangre en la nieve");
        System.out.println(objLibro.getPublicacion());
        System.out.println(objLibro.toString());

        Empleado nuevoEmpleado = new Empleado("Ana María","Ing junior",1.600001,140297);
        System.out.println(nuevoEmpleado);

        Empleado nuevoEmpleado1 = new Empleado();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de el empleado");
        nuevoEmpleado1.setNombre(sc.next());
        System.out.println(nuevoEmpleado1.getNombre());


        nuevoEmpleado.aunmentoSalarial();

    }

}