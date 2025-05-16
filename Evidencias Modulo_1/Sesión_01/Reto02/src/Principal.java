public class Principal {
    public static void main(String[] args) {
        // Crear un objeto de tipo Producto usando el record
        Entrada entrada = new Entrada("Obra de Teatro", 450);

        // Muestra el toString() generado automáticamente por el record.
        System.out.println(entrada);
    }
}

