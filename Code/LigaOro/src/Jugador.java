public class Jugador {

    private int id;
    private String nombre;
    private int partidosJugados;
    private int goles;
    private int asistencias;
    private int tarjetas;
    private int pom;
    private Equipo equipo;



    public Jugador(String nombre, int id,Equipo equipo){
        this.id = id;
        this.nombre = nombre;
        this.partidosJugados = 0;
        this.goles = 0;
        this.asistencias = 0;
        this.tarjetas = 0;
        this.pom = 0;
        this.equipo = equipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(int tarjetas) {
        this.tarjetas = tarjetas;
    }

    public int getPom() {
        return pom;
    }

    public void setPom(int pom) {
        this.pom = pom;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
