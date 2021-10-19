import App.Fastfood;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    Fastfood ff = new Fastfood();



    //meniu sandwich uri
    JButton Sandvisuri;
    JButton Vita;
    JButton Pui;
    JButton Mixt;

    //meniu salate
    JButton Salate;
    JButton Ton;
    JButton Caesar;

    //meniu sucuri
    JButton Sucuri;
    JButton Cola;
    JButton Sprite;
    JButton Fanta;

    JButton Verificare;
    JButton Stergere;
    JButton Finalizare;

    JButton Suma;
    JButton[] StergereProduse;


    //JLabel label;

    MyFrame(){

/*
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel1.setLayout(new BorderLayout());

        panel1.setPreferredSize(new Dimension(300, 500));
        panel2.setPreferredSize(new Dimension(200, 500));
        panel2.setBackground(Color.BLACK);


        label = new JLabel("text");
        label.setVisible(true);
        label.setLocation(0, 0);

        panel2.add(label);


 */

        Sandvisuri = new JButton();
        Sandvisuri.setBounds(50,50,250,40);
        Sandvisuri.addActionListener(this);
        Sandvisuri.setText("Sandvisuri");

        Vita = new JButton();
        Vita.setBounds(50,50,250,40);
        Vita.addActionListener(this);
        Vita.setText("Vita");
        Vita.setVisible(false);
        Vita.setEnabled(false);

        Pui = new JButton();
        Pui.setBounds(50,100,250,40);
        Pui.addActionListener(this);
        Pui.setText("Pui");
        Pui.setVisible(false);
        Pui.setEnabled(false);

        Mixt = new JButton();
        Mixt.setBounds(50,150,250,40);
        Mixt.addActionListener(this);
        Mixt.setText("Mixt");
        Mixt.setVisible(false);
        Mixt.setEnabled(false);


        Salate = new JButton();
        Salate.setBounds(50,100,250,40);
        Salate.addActionListener(this);
        Salate.setText("Salate");

        Ton = new JButton();
        Ton.setBounds(50,50,250,40);
        Ton.addActionListener(this);
        Ton.setText("Ton");
        Ton.setBackground(new Color(0xa65151));
        Ton.setVisible(false);
        Ton.setEnabled(false);

        Caesar = new JButton();
        Caesar.setBounds(50,100,250,40);
        Caesar.addActionListener(this);
        Caesar.setBackground(new Color(0xbfb132));
        Caesar.setText("Caesar");
        Caesar.setVisible(false);
        Caesar.setEnabled(false);


        Sucuri = new JButton();
        Sucuri.setBounds(50,150,250,40);
        Sucuri.addActionListener(this);
        Sucuri.setText("Sucuri");

        Cola = new JButton();
        Cola.setBounds(50,50,250,40);
        Cola.addActionListener(this);
        Cola.setText("Cola");
        Cola.setBackground(new Color(0x383838));
        Cola.setVisible(false);
        Cola.setEnabled(false);

        Sprite = new JButton();
        Sprite.setBounds(50,100,250,40);
        Sprite.addActionListener(this);
        Sprite.setText("Sprite");
        Sprite.setBackground(new Color(0x1d9148));
        Sprite.setVisible(false);
        Sprite.setEnabled(false);

        Fanta = new JButton();
        Fanta.setBounds(50,150,250,40);
        Fanta.addActionListener(this);
        Fanta.setText("Fanta");
        Fanta.setBackground(new Color(0xa86d32));
        Fanta.setVisible(false);
        Fanta.setEnabled(false);


        Verificare = new JButton();
        Verificare.setBounds(50,200,250,40);
        Verificare.addActionListener(this);
        Verificare.setText("Verificare");

        Stergere = new JButton();
        Stergere .setBounds(50,250,250,40);
        Stergere .addActionListener(this);
        Stergere .setText("Stergere");

        Finalizare = new JButton();
        Finalizare.setBounds(50,300,250,40);
        Finalizare.addActionListener(this);
        Finalizare.setText("Finalizare");





        this.setTitle("Fastfood");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(600,600);
        this.setVisible(true);
        this.add(Sandvisuri);
        this.add(Salate);
        this.add(Sucuri);
        this.add(Verificare);
        this.add(Stergere);
        this.add(Finalizare);
        this.add(Vita);
        this.add(Pui);
        this.add(Mixt);
        this.add(Ton);
        this.add(Caesar);
        this.add(Cola);
        this.add(Sprite);
        this.add(Fanta);
        this.add(Suma);
        for (int i = 0; i < 100; i++) {
            this.add(StergereProduse[i]);
        }

        /*
        this.add(panel1, BorderLayout.WEST);
        this.add(panel2,BorderLayout.EAST);
*/

    }

    public void MainMeniu(boolean bool){
            Sandvisuri.setVisible(bool);
            Sandvisuri.setEnabled(bool);
            Salate.setVisible(bool);
            Salate.setEnabled(bool);
            Sucuri.setVisible(bool);
            Sucuri.setEnabled(bool);
            Verificare.setVisible(bool);
            Verificare.setEnabled(bool);
            Stergere.setVisible(bool);
            Stergere.setEnabled(bool);
            Finalizare.setVisible(bool);
            Finalizare.setEnabled(bool);
    }

    public void SandvisMeniu(boolean bool){
        Pui.setVisible(bool);
        Pui.setEnabled(bool);
        Vita.setVisible(bool);
        Vita.setEnabled(bool);
        Mixt.setVisible(bool);
        Mixt.setEnabled(bool);
    }

    public void SalateMeniu(boolean bool){
        Ton.setVisible(bool);
        Ton.setEnabled(bool);
        Caesar.setVisible(bool);
        Caesar.setEnabled(bool);
    }

    public void SucuriMeniu(boolean bool){
        Cola.setVisible(bool);
        Cola.setEnabled(bool);
        Sprite.setVisible(bool);
        Sprite.setEnabled(bool);
        Fanta.setVisible(bool);
        Fanta.setEnabled(bool);
    }

    public void StergereGenButon(int i, String nume_produs){
        StergereProduse[i] = new JButton();
        StergereProduse[i].setBounds(50,20*i,250,20);
        StergereProduse[i].addActionListener(this);
        StergereProduse[i].setText(nume_produs);
        Fanta.setVisible(false);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Sandvisuri){
            System.out.println("Sandvisuri");
            MainMeniu(false);
            SandvisMeniu(true);
        }
        if(e.getSource() == Pui){
            System.out.println("Pui");
            ff.adaugcos(1,1);
            MainMeniu(true);
            SandvisMeniu(false);
        }
        if(e.getSource() == Vita){
            System.out.println("Vita");
            ff.adaugcos(2,1);
            MainMeniu(true);
            SandvisMeniu(false);

        }
        if(e.getSource() == Mixt){
            System.out.println("Mixt");
            ff.adaugcos(3,1);
            MainMeniu(true);
            SandvisMeniu(false);
        }
        if(e.getSource() == Salate){
            System.out.println("Salate");
            MainMeniu(false);
            SalateMeniu(true);
        }
        if(e.getSource() == Ton){
            System.out.println("Ton");
            ff.adaugcos(1,1);
            MainMeniu(true);
            SalateMeniu(false);
        }
        if(e.getSource() == Caesar){
            System.out.println("Caesar");
            ff.adaugcos(2,1);
            MainMeniu(true);
            SalateMeniu(false);
        }
        if(e.getSource() == Sucuri){
            System.out.println("Sucuri");
            MainMeniu(false);
           SucuriMeniu(true);
        }
        if(e.getSource() == Cola){
            System.out.println("Cola");
            ff.adaugcos(1,1);
            MainMeniu(true);
            SucuriMeniu(false);
        }
        if(e.getSource() == Sprite){
            System.out.println("Sprite");
            ff.adaugcos(2,1);
            MainMeniu(true);

        }
        if(e.getSource() == Fanta){
            System.out.println("Fanta");
            ff.adaugcos(3,1);
            MainMeniu(true);

        }
        if(e.getSource() == Verificare){
            System.out.println("Verificare");
            System.out.println(ff.cs.getSold());
            int answer = JOptionPane.showConfirmDialog(null, "Suma este: " + ff.cs.getSold() + "\n Doriti sa continuati?", "Verificare suma", JOptionPane.YES_NO_OPTION);
            if (answer == 1) System.exit(0);



        }
        if(e.getSource() == StergereProduse[0]){

        }
        if(e.getSource() == StergereProduse[1]){

        }
        if(e.getSource() == Stergere){
            System.out.println("Stergere");
            for (int i = 0; i < 1; i++) {
                StergereProduse[i].setVisible(true);
            }
        }
        if(e.getSource() == Finalizare){
            System.out.println("Finalizare");
        }

    }
}
