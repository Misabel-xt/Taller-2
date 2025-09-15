public class PruebaThis {
    private String mensaje = "Uso incorrecto de this y static";

   public static void metodoEstatico() {
        //No se puede usar "this" en un contexto estático
        System.out.println(this.mensaje);
    }
} 
   /* public class PruebaThis {
    private String mensaje = "Uso correcto de This y Static";

    // Método estático correcto
    public static void metodoEstatico() {
        System.out.println("Método estático no puede usar this");
    }

    // Método de instancia correcto
    public void metodoInstancia() {
        System.out.println(this.mensaje); // Aquí sí se puede usar this
    }
}*/
