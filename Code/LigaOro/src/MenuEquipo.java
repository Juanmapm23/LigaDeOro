import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuEquipo extends JFrame implements ActionListener {

    Gestor gestor;
    JButton volver;
    JButton creaEquipo;
    Selector selector;
    CreaEquipo ce;
    JLabel equipo1,equipo2,equipo3,equipo4,equipo5,equipo6;
    JLabel escudo1,escudo2, escudo3, escudo4, escudo5, escudo6;
    public MenuEquipo(){

    }
    public void MenuEquipo(Gestor gestor, Selector selector,CreaEquipo ce) {
        this.gestor = gestor;
        this.selector = selector;
        this.ce = ce;
        crear();
    }

    public void crear() {
        //boton volver
        volver = new JButton("Volver");
        volver.setBounds(50, 550, 80, 70);
        gestor.add(volver);
        volver.addActionListener(this);
        volver.setVisible(false);

        //boton crear equipo
        creaEquipo = new JButton("Crear Equipo");
        creaEquipo.setBounds(650, 550, 120, 70);
        gestor.add(creaEquipo);
        creaEquipo.addActionListener(this);
        creaEquipo.setVisible(false);
    }
    public void muestraEquipo(){
        if(gestor.equipos.size()>0){
            equipo1 = new JLabel(gestor.equipos.get(0).getNombre());
            equipo1.setBounds(125,155,100,100);
            gestor.add(equipo1);

            ImageIcon escudoim1 = new ImageIcon(gestor.equipos.get(0).getEscudo());
            escudo1 = new JLabel(escudoim1);
            escudo1.setBounds(112,250,100,100);
            gestor.add(escudo1);

        }
        if(gestor.equipos.size()>1){
            equipo2 = new JLabel(gestor.equipos.get(1).getNombre());
            equipo2.setBounds(250,155,100,100);
            gestor.add(equipo2);

            ImageIcon escudoim2 = new ImageIcon(gestor.equipos.get(1).getEscudo());
            escudo2 = new JLabel(escudoim2);
            escudo2.setBounds(237,250,100,100);
            gestor.add(escudo2);
        }
        if(gestor.equipos.size()>2){
            equipo3 = new JLabel(gestor.equipos.get(2).getNombre());
            equipo3.setBounds(375,155,100,100);
            gestor.add(equipo3);

            ImageIcon escudoim3 = new ImageIcon(gestor.equipos.get(2).getEscudo());
            escudo3 = new JLabel(escudoim3);
            escudo3.setBounds(362,250,100,100);
            gestor.add(escudo3);
        }
        if(gestor.equipos.size()>3){
            equipo4 = new JLabel(gestor.equipos.get(3).getNombre());
            equipo4.setBounds(500,155,100,100);
            gestor.add(equipo4);

            ImageIcon escudoim4 = new ImageIcon(gestor.equipos.get(3).getEscudo());
            escudo1 = new JLabel(escudoim4);
            escudo4.setBounds(487,250,100,100);
            gestor.add(escudo4);
        }
        if(gestor.equipos.size()>4){
            equipo5 = new JLabel(gestor.equipos.get(4).getNombre());
            equipo5.setBounds(625,155,100,100);
            gestor.add(equipo5);

            ImageIcon escudoim5 = new ImageIcon(gestor.equipos.get(4).getEscudo());
            escudo5 = new JLabel(escudoim5);
            escudo5.setBounds(612,250,100,100);
            gestor.add(escudo5);
        }
        if(gestor.equipos.size()>5){
            equipo6 = new JLabel(gestor.equipos.get(5).getNombre());
            equipo6.setBounds(750,155,50,100);
            gestor.add(equipo6);

            ImageIcon escudoim6 = new ImageIcon(gestor.equipos.get(5).getEscudo());
            escudo6 = new JLabel(escudoim6);
            escudo6.setBounds(737,250,100,100);
            gestor.add(escudo6);
        }


    }

    public void mostrar(){
        volver.setVisible(true);
        creaEquipo.setVisible(true);
        muestraEquipos();
    }

    public void esconder(){
        volver.setVisible(false);
        creaEquipo.setVisible(false);
        esconderEquipos();
    }
    public void esconderEquipos(){
        switch (gestor.equipos.size()){
            case 0: break;
            case 1:
                equipo1.setVisible(false);
                escudo1.setVisible(false);
                break;
            case 2:
                equipo1.setVisible(false);
                escudo1.setVisible(false);
                equipo2.setVisible(false);
                escudo2.setVisible(false);
                break;
            case 3:
                equipo1.setVisible(false);
                escudo1.setVisible(false);
                equipo2.setVisible(false);
                escudo2.setVisible(false);
                equipo3.setVisible(false);
                escudo3.setVisible(false);
                break;
            case 4:
                equipo1.setVisible(false);
                escudo1.setVisible(false);
                equipo2.setVisible(false);
                escudo2.setVisible(false);
                equipo3.setVisible(false);
                escudo3.setVisible(false);
                equipo4.setVisible(false);
                escudo4.setVisible(false);

                break;
            case 5:
                equipo1.setVisible(false);
                escudo1.setVisible(false);
                equipo2.setVisible(false);
                escudo2.setVisible(false);
                equipo3.setVisible(false);
                escudo3.setVisible(false);
                equipo4.setVisible(false);
                escudo4.setVisible(false);
                equipo5.setVisible(false);
                escudo5.setVisible(false);

                break;
            case 6:
                equipo1.setVisible(false);
                escudo1.setVisible(false);
                equipo2.setVisible(false);
                escudo2.setVisible(false);
                equipo3.setVisible(false);
                escudo3.setVisible(false);
                equipo4.setVisible(false);
                escudo4.setVisible(false);
                equipo5.setVisible(false);
                escudo5.setVisible(false);
                equipo6.setVisible(false);
                escudo6.setVisible(false);
                break;
        }
    }
    public void muestraEquipos(){
        switch (gestor.equipos.size()){
            case 0: break;
            case 1:
                equipo1.setVisible(true);
                escudo1.setVisible(true);
                break;
            case 2:
                equipo1.setVisible(true);
                escudo1.setVisible(true);
                equipo2.setVisible(true);
                escudo2.setVisible(true);
                break;
            case 3:
                equipo1.setVisible(true);
                escudo1.setVisible(true);
                equipo2.setVisible(true);
                escudo2.setVisible(true);
                equipo3.setVisible(true);
                escudo3.setVisible(true);
                break;
            case 4:
                equipo1.setVisible(true);
                escudo1.setVisible(true);
                equipo2.setVisible(true);
                escudo2.setVisible(true);
                equipo3.setVisible(true);
                escudo3.setVisible(true);
                equipo4.setVisible(true);
                escudo4.setVisible(true);

                break;
            case 5:
                equipo1.setVisible(true);
                escudo1.setVisible(true);
                equipo2.setVisible(true);
                escudo2.setVisible(true);
                equipo3.setVisible(true);
                escudo3.setVisible(true);
                equipo4.setVisible(true);
                escudo4.setVisible(true);
                equipo5.setVisible(true);
                escudo5.setVisible(true);

                break;
            case 6:
                equipo1.setVisible(true);
                escudo1.setVisible(true);
                equipo2.setVisible(true);
                escudo2.setVisible(true);
                equipo3.setVisible(true);
                escudo3.setVisible(true);
                equipo4.setVisible(true);
                escudo4.setVisible(true);
                equipo5.setVisible(true);
                escudo5.setVisible(true);
                equipo6.setVisible(true);
                escudo6.setVisible(true);
                break;
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == volver) {
            esconder();
            selector.mostrar();
        } else if (e.getSource() == creaEquipo) {
            ce.mostrar();
            esconder();
        }
    }
}
