public class Main {
    public static void main(String[] args) {
        Lector lector = new Lector("Ana", "Calle 1", 123456, "ana@mail.com");
        LibroImpreso libro = new LibroImpreso("Java Basico", "Perez", 2020, 300, "123-456");
        RecursoDigital digital = new RecursoDigital("POO en video", "Gomez", 2022, "MP4", 450.5);

        lector.mostrarInformacion();

        libro.mostrarInformacion();
        System.out.println("Tipo: " + libro.obtenerTipo());
        libro.abrirLibro();

        digital.mostrarInformacion();
        System.out.println("Tipo: " + digital.obtenerTipo());
        digital.descargar();

        lector.reservar(libro);
        lector.entregar(digital);
    }
} // se agregan pocos parametros a modo de prueba de ejecucion del programa