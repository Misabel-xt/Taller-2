
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Producto P1 = new Producto("Aromatel", 11000);
        P1.mostrarProducto(); 
        
        //Creación de objeto Scanner para ingresar datos 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = teclado.nextLine();
        //Salto de linea
        teclado.nextLine();
        
        System.out.println("Ingrese la edad del estudiante: ");
        int edad= teclado.nextInt();
        
        //Los dato que fueron ingresados tomaran los valores 
        //que le corresponden a nombre y a edad.
        Estudiante E1 = new Estudiante(nombre, edad);
        
        //Si lo hacemos con el constructor por defecto, sin
        //importar los valores que le demos, nos soltará los 
        //habiamos predefinido al momen de usar this().
        //Estudiante E1 = new Estudiante();
        E1.mostrarValores();
        
        teclado.close();
    }
    
}