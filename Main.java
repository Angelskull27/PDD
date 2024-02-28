public class Main{
    public static void main(String[] args) {
        // Obtener la instancia del Registro de Eventos
        EventLogger logger = EventLogger.getInstancia();

        // Registrar algunos eventos
        logger.registrarEvento("Inicio de la aplicación");
        logger.registrarEvento("Usuario inició sesión");
        logger.registrarEvento("Se creó un nuevo evento");

        // Intentar crear una nueva instancia (no se debería permitir)
        // EventLogger otroLogger = new EventLogger(); // Esto generaría un error

        // Obtener la misma instancia del Registro de Eventos nuevamente
        EventLogger otroLogger = EventLogger.getInstancia();

        // Verificar que ambas variables apuntan a la misma instancia
        System.out.println("¿logger es igual a otroLogger?: " + (logger == otroLogger));
    }

}