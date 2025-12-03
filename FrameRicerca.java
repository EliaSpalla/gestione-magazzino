import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class FrameRicerca extends JFrame implements ActionListener {
    JButton indietro;
    JButton ricerca;
    Magazzino magazzino=new Magazzino();
    JTextField campoPezzo = new JTextField();
    JTextField campoModello = new JTextField();
    JTextField campoMarca = new JTextField();
    JTextField campoCodice = new JTextField();

    public FrameRicerca() {
        indietro=new JButton("Indietro");
        this.add(indietro);
        ricerca=new JButton("Ricerca");
        this.add(ricerca);

        this.setTitle("Frame");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        indietro.setBounds(150, 25, 500, 50);
        indietro.setLayout(null);
        indietro.addActionListener(this);
        indietro.setHorizontalAlignment(SwingConstants.CENTER);

        ricerca.setBounds(150, 350, 500, 50);
        ricerca.setLayout(null);
        ricerca.addActionListener(this);
        ricerca.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel pezzo=new JLabel("Pezzo:");
        pezzo.setBounds(50, 85, 500, 50);
        this.add(pezzo);

        campoPezzo.setBounds(50, 125, 200, 30);
        this.add(campoPezzo);


        JLabel modello=new JLabel("Modello:");
        modello.setBounds(50, 155, 500, 50);
        this.add(modello);

        campoModello.setBounds(50, 195, 200, 30);
        this.add(campoModello);

        JLabel marca=new JLabel("Marca:");
        marca.setBounds(50, 225, 500, 50);
        this.add(marca);

        campoMarca.setBounds(50, 265, 200, 30);
        this.add(campoMarca);

        JLabel codice=new JLabel("Codice:");
        codice.setBounds(550, 85, 500, 50);
        this.add(codice);

        campoCodice.setBounds(550, 125, 200, 30);
        this.add(campoCodice);



        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == indietro){
            setVisible(false);
            new Frame02("database",magazzino);
        }
        if(e.getSource() == ricerca){
            Pezzo appoggioUtente = new Pezzo("","","",-1);
            if(campoCodice.getText().equals("")&&!campoPezzo.getText().equals("")
                    &&!campoModello.getText().equals("")&&!campoMarca.getText().equals("")){

                appoggioUtente.setNome(campoPezzo.getText());
                appoggioUtente.setModello(campoModello.getText());
                appoggioUtente.setMarca(campoMarca.getText());
            }else{
                appoggioUtente.setCodice(Integer.parseInt(campoCodice.getText()));
            }
            magazzino.ricercaIndicePezzo(appoggioUtente);
        }
    }
}
