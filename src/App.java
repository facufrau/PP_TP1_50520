import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Creamos lista de estudiantes
        List<Estudiante> estudiantes = new ArrayList<>();

        // a-creamos estudiantes
        estudiantes.add(new Estudiante("12345", "Lionel Messi"));
        estudiantes.add(new Estudiante("33221", "Luis Scola"));
        estudiantes.add(new Estudiante("45632", "Luciana Aymar"));
        estudiantes.add(new Estudiante("19876|", "Paula Pareto"));
        estudiantes.add(new Estudiante("47651", "Emanuel Ginobili"));

        // b-creamos eventos 2 talleres y una charla
        EventoUniversitario evento1 = new EventoUniversitario(1500.0, false, "Evento de Linux y Software Libre");
        EventoUniversitario evento2 = new EventoUniversitario(123.123, true, "Olimpiadas de ciencia");
        EventoUniversitario evento3 = new EventoUniversitario(3333.0, false, "Jornadas de Educacion");
        EventoUniversitario evento4 = new EventoUniversitario(2300.0, true, "Congreso de Estudiantes");


        // c-Creamos y asignamos sala al evento creado
        Sala sala17 = new Sala(3, "Aula 17-18 2do piso");
        evento1.asignarSala(sala17);

        // d-Creamos en cada evento actividades
        evento1.crearActividad(1, "Que es Linux?", 30, "charla");
        evento1.crearActividad(2, "Instalando Linux en Cloud", 23, "taller");
        evento1.crearActividad(3, "Usando la consola y programación en bash", 45, "taller");

        // e-Inscribimos estudiantes en cada actividad
        // En charla
        evento1.getActividades().get(0).inscribir(estudiantes.get(0));
        evento1.getActividades().get(0).inscribir(estudiantes.get(2));
        evento1.getActividades().get(0).inscribir(estudiantes.get(4));

        // En taller1
        evento1.getActividades().get(1).inscribir(estudiantes.get(1));
        evento1.getActividades().get(1).inscribir(estudiantes.get(3));
        evento1.getActividades().get(1).inscribir(estudiantes.get(2));

        // En taller2
        evento1.getActividades().get(2).inscribir(estudiantes.get(1));
        evento1.getActividades().get(2).inscribir(estudiantes.get(3));
        evento1.getActividades().get(2).inscribir(estudiantes.get(4));

        // f,g-Mostramos datos de evento y actividades
        evento1.mostrarDatos();
        EventoUniversitario.mostrarEventosTotales();
    }
}