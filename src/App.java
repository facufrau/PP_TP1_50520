public class App {
    public static void main(String[] args) {
        EventoUniversitario Evento1 = new EventoUniversitario(123.44, false, "Java 123");
        Evento1.mostrarEventosTotales();
        Evento1.mostrarDatos();

        EventoUniversitario Evento2 = new EventoUniversitario(33.8, false, "Mi Evento Univ");
        Evento2.mostrarEventosTotales();
        Evento2.mostrarDatos();

        EventoUniversitario EventoCopia1 = new EventoUniversitario(Evento1);
        EventoCopia1.mostrarEventosTotales();
        EventoCopia1.mostrarDatos();
    }
}