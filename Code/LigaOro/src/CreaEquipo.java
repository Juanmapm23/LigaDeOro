import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreaEquipo extends JFrame implements ActionListener{
    Gestor gestor;
    JButton volver;
    JButton creaEquipo;
    MenuEquipo me;

    JLabel nombre,escudo;
    JTextField introduceNombre,introduceEscudo;
    public CreaEquipo(){

    }

    public void CreaEquipo(Gestor gestor, MenuEquipo me){
        this.gestor = gestor;
        this.me = me;
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


        nombre = new JLabel("Nombre:");
        nombre.setBounds(250, 200, 100, 30);
        gestor.add(nombre);
        nombre.setVisible(false);

        introduceNombre = new JFormattedTextField();
        introduceNombre.setBounds(350, 200, 250, 30);
        gestor.add(introduceNombre);
        introduceNombre.setVisible(false);

        escudo = new JLabel("Escudo:");
        escudo.setBounds(250, 300, 100, 30);
        gestor.add(escudo);
        escudo.setVisible(false);

        introduceEscudo = new JFormattedTextField();
        introduceEscudo.setBounds(350, 300, 250, 30);
        gestor.add(introduceEscudo);
        introduceEscudo.setVisible(false);

    }


    public void mostrar(){
        volver.setVisible(true);
        creaEquipo.setVisible(true);
        nombre.setVisible(true);
        introduceNombre.setVisible(true);
        escudo.setVisible(true);
        introduceEscudo.setVisible(true);

    }
    public void esconder(){
        volver.setVisible(false);
        creaEquipo.setVisible(false);
        nombre.setVisible(false);
        introduceNombre.setVisible(false);
        escudo.setVisible(false);
        introduceEscudo.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == volver) {
            esconder();
            me.mostrar();
            introduceNombre.setText("");
            introduceEscudo.setText("");
        } else if (e.getSource() == creaEquipo) {
            if(gestor.equipos.size() == 6){
                Aviso aviso = new Aviso(0);
            }else {
                Equipo equipo = new Equipo(introduceNombre.getText(), introduceEscudo.getText(), gestor.equipos.size() + 1);
                introduceNombre.setText("");
                introduceEscudo.setText("");
                gestor.equipos.add(equipo);
                me.muestraEquipo();
                esconder();
                me.mostrar();
            }
        }
    }
}
