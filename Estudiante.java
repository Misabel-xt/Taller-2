//Ejercicio 2: Llamada a Constructores con this()
//1. Define una clase Estudiante con los atributos nombre y edad.
//2. Crea un constructor por defecto que llame a un constructor con dos parámetros utilizando this().
//3. Define un método que imprima los detalles del estudiante.
public class Estudiante {
    //Atributos
    private String nombre;
    private int edad;
    
    //Constructor por defecto que inicializa 
    //con uno de la misma clase
    public Estudiante(){
        this("Sin nombre", 0);
    }
    
    //Constructor parametrizado
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        //reutilización del metodo set con validación.
        setedad(edad);
    }
    
    // getters y setters para acceder y ver los atributos
    //de la clase.
    public String getnombre(){
        return nombre;
    }
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getedad(){
        return edad;
    }
    
    public void setedad(int edad){
        if (edad > 0){
            this.edad = edad;
        }else{
            System.out.println("Edad invalida");
        }
    }
    public void mostrarValores(){
        System.out.println("El nombre del estudiante es: " + getnombre()
        + "\n La edad del estudante es: " + getedad());
    }
    
}