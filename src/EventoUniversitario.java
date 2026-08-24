public class EventoUniversitario {
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;
    private Sala sala;

    public EventoUniversitario(double costoBase, boolean gratuito, String titulo) {
        cantidadEventos++;
        setCostoBase(costoBase);
        setGratuito(gratuito);
        this.id = String.valueOf(cantidadEventos);
        setTitulo(titulo);
    }

    public EventoUniversitario(EventoUniversitario otro) {
        cantidadEventos++;
        setCostoBase(otro.costoBase);
        setGratuito(otro.gratuito);
        this.id = String.valueOf(cantidadEventos);
        setTitulo(otro.titulo);
    }


    // Get-Set Titulo
    public void setTitulo(String nombre) {
        if (nombre != null && !nombre.isBlank()){
            this.titulo = nombre;
        }
    }

    public String getTitulo() {
        return this.titulo;
    }

    // Get-Set Costo Base
    public void setCostoBase(double costoBase) {
        if (costoBase >= 0) {
            this.costoBase = costoBase;
        }
    }

    public double getCostoBase() {
        return this.costoBase;
    }

    // Get-Set gratuito
    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public boolean getGratuito() {
        return gratuito;
    }

    // Mostrar Datos
    public void mostrarDatos() {
        System.out.println("______________________________________________________________________________________________");
        System.out.println("ID="+ this.id);
        System.out.println("Título=" + this.titulo);
        System.out.println("Es gratuito=" + this.gratuito);
        System.out.println("Costo Base=" + String.format("%.2f", this.costoBase));
        System.out.println("Costo Estimado=" + String.format("%.2f", calcularCostoestimado()));
        String salaNombre = this.sala.getNombre();
        if (!salaNombre.isBlank() && salaNombre != null){
            System.out.println("Sala Asignada= " + salaNombre);
        }
        System.out.println("______________________________________________________________________________________________");

    }

    public void mostrarEventosTotales() {
        System.out.println("**********************\nEventos Totales: "+ getCantidadEventos() + "\n**********************");
    }

    // Get Cantidad de eventos
    public static int getCantidadEventos() {
        return cantidadEventos;
    }

    // Calcular costo estimado
    public double calcularCostoestimado() {
        return costoBase * 1.21;
    }

    // Metodo crear Actividad
    public void crearActividad(int idnum, String titulo, int cupo) {
    }

    // Metodo asignar sala
     public void asignarSala(Sala sala) {
        this.sala = sala;
    }

    static {
        cantidadEventos = 0;
        System.out.println("Cantidad de eventos inicializado a: " + cantidadEventos);
    }

}
