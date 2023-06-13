import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Gestor extends JFrame {

    List<Equipo> equipos = new ArrayList<>();
    JLabel escudo;
    public Gestor() {
        setLayout(null);
        Selector selector = new Selector();
        MenuEquipo me = new MenuEquipo();
        CreaEquipo ce = new CreaEquipo();
        selector.Selector(this,me);
        me.MenuEquipo(this,selector,ce);
        ce.CreaEquipo(this,me);


    }


    public static void main(String[] args) {
        Gestor gestor = new Gestor();
        gestor.setBounds(0,0,900,700);
        gestor.setResizable(false);
        gestor.setLocationRelativeTo(null);
        gestor.setVisible(true);

    }


}



