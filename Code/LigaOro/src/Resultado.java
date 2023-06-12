import java.util.List;

public class Resultado {
    private int golesLocal;
    private int golesVisitante;
    private Equipo Local;
    private Equipo Visitante;

    public Resultado(int golesLocal, int golesVisitante, Equipo local, Equipo visitante) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        Local = local;
        Visitante = visitante;
    }

    public void guardaResultado(){
        Local.setGolesAFavor(Local.getGolesAFavor()+golesLocal);
        Local.setGolesEnContra(Local.getGolesEnContra()+golesVisitante);
        Local.setGolaberal();

        Visitante.setGolesAFavor(Visitante.getGolesAFavor()+golesVisitante);
        Visitante.setGolesEnContra(Visitante.getGolesEnContra()+golesLocal);
        Visitante.setGolaberal();


    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public Equipo getLocal() {
        return Local;
    }

    public void setLocal(Equipo local) {
        Local = local;
    }

    public Equipo getVisitante() {
        return Visitante;
    }

    public void setVisitante(Equipo visitante) {
        Visitante = visitante;
    }
}
