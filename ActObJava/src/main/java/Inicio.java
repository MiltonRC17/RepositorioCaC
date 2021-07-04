

import java.util.Scanner;

public class Inicio {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
            System.out.println("Ingrese su Nombre");
            String nombre = scanner.nextLine();            
            System.out.println("Ingrese su Apellido");
            String apellido = scanner.nextLine();           
            System.out.println("Ingrese su Edad");
            String edad = scanner.nextLine();            
            System.out.println("Ingrese su Hobbie");
            String hobbie = scanner.nextLine();            
            System.out.println("Ingrese su Editor de Código preferido");
            String editor = scanner.nextLine();           
            System.out.println("Ingrese su Sistema Operativo");
            String so = scanner.nextLine();           
            System.out.println("Los siguientes datos fueron ingresados correctamente: \n"
                    + "Nombre: " + nombre + "\n"
                    + "Apellido: " + apellido + "\n"
                    + "Edad: " + edad + "\n"
                    + "Hobbie: " + hobbie + "\n"
                    + "Editor Preferido: " + editor + "\n"
                    + "Sistema Operativo: " + so + "\n");  
            System.out.println("Muchas Gracias.");
    }         
}
