import java.time.LocalDate;
import java.util.List;

public class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    private static final int CUPO_MINIMO;

    private List<Inscripcion> inscripciones;

    static {
        CUPO_MINIMO = 15;
        System.out.println("Se inicializó la variable CUPO MINIMO a " + CUPO_MINIMO);
    }

    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        if (cupoMaximo > 0 && cupoMaximo >= CUPO_MINIMO) {
            this.cupoMaximo = cupoMaximo;
        } else {
            this.cupoMaximo = CUPO_MINIMO;
        }
    }

    public Inscripcion inscribir(Estudiante estudiante){
        Inscripcion inscripcion = new Inscripcion(LocalDate.now(), "Registrada", this, estudiante);
        inscripciones.add(inscripcion);

        return inscripcion;
    }
}

