import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Selector  extends JFrame implements ActionListener {

    Gestor gestor;
    JButton simular;
    JButton normal;
    JButton equipo;
    MenuEquipo me;

    public Selector(){

    }
    public void Selector(Gestor gestor,MenuEquipo me){
        this.gestor = gestor;
        this.me = me;
        Selector1();
    }
    public void Selector1() {
        simular = new JButton("Simular");
        normal = new JButton("Normal");
        equipo = new JButton("Equipos");
        simular.setBounds(200,250,100,30);
        normal.setBounds(350,250,100,30);
        equipo.setBounds(500,250,100,30);
        gestor.add(simular);
        gestor.add(normal);
        gestor.add(equipo);
        simular.addActionListener(this);
        normal.addActionListener(this);
        equipo.addActionListener(this);

    }

    public void mostrar(){
        simular.setVisible(true);
        normal.setVisible(true);
        equipo.setVisible(true);
    }

    public void esconder(){
        simular.setVisible(false);
        normal.setVisible(false);
        equipo.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == simular){
            System.exit(0);
        }else if(e.getSource()==normal){
            System.exit(0);
        }else if(e.getSource()==equipo){
            esconder();
            me.mostrar();
        }

    }
}
