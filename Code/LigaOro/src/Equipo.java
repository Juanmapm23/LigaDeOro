import java.util.List;

public class Equipo {
    private String nombre;
    private int puntos;
    private int puesto;
    private List<Jugador> jugadores;
    private int golesEnContra;
    private int golesAFavor;
    private int golaberal;
    private String escudo;

    public Equipo(String nombre,String escudo){
        this.nombre = nombre;
        //puesto;
        this.puntos = 0;
        this.jugadores = null;
        this.golesEnContra = 0;
        this.golesAFavor = 0;
        this.golaberal = 0;
        this.escudo = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolaberal() {
        return golaberal;
    }

    public void setGolaberal() {
        this.golaberal = this.golesAFavor-this.golesEnContra;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }
}
