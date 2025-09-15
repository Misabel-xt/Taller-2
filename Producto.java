
public class Producto {
    //Ejercicio 1: Clase Producto con Constructor y Métodos de Acceso
//1. Define una clase Producto con los atributos nombre y precio.
//2. Crea un constructor que reciba los parámetros nombre y precio y utiliza this para diferenciarlos de los atributos.
//3. Define un método mostrarProducto que imprima los detalles del producto.
    
    //Atributos de la clase
    private String nombre;
    private int precio; 
    
    //Constructor parametrizado
    public Producto(String nombre, int precio){
        this.nombre = nombre;
        //reutilizamos la validación del metodo set
        setprecio(precio);
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public void setnombre(String nombre){
        this.nombre = nombre; 
    }
    
    public int getprecio(){
        return precio;
    }
    
    //set con validación, que luego fue reutilizado en el constructor
    public void setprecio(int precio){
        if (precio >= 0){
            this.precio = precio;
        }else{
            System.out.println("Error, el precio no puede contener valores negativos");
        }
    }
    
    public void mostrarProducto(){
        System.out.println("El nombre del producto es: "
        + nombre + "\n" + "El precio del producto es: " + precio);
    }
    
}