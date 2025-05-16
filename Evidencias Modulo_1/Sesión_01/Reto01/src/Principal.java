public class Principal {
    public static void main(String[] args) {
        // Crear un nuevo objeto de tipo Paciente
        Paciente paciente1 = new Paciente();

        // Asignar valores a los atributos
        paciente1.nombre = "Lena Marie";
        paciente1.edad = 25;
        paciente1.expediente = "EXP202409";

        // Llamar al método saludar() del objeto
        paciente1.saludar();
    }
}


