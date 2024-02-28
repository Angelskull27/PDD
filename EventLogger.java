public class EventLogger {
    // Instancia única de la clase
    private static EventLogger instancia;

    // Archivo de registro para almacenar eventos+
    private String logFile;

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private EventLogger() {
        // Inicialización del archivo de registro (puede incluir la ruta del archivo)
        this.logFile = "event_log.txt";
    }

    // Método para obtener la única instancia de la clase
    public static synchronized EventLogger getInstancia() {
        // Verificar si la instancia ya ha sido creada
        if (instancia == null) {
            // Si no existe, crear una nueva instancia de forma segura para hilos (synchronized)
            instancia = new EventLogger();
        }
        // Devolver la instancia existente o recién creada
        return instancia;
    }

    // Método para registrar un evento en el archivo de registro
    public void registrarEvento(String evento) {
        // Lógica para registrar el evento en el archivo de registro
        System.out.println("Registrando evento: " + evento);
        // (Código para escribir en el archivo logFile)
    }

    // Otros métodos y atributos de la clase (opcional)
}