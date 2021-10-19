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

    JButton delPui;
    JButton delVita;
    JButton delMixt;
    JButton delTon;
    JButton delCaeser;
    JButton delCola;
    JButton delSprite;
    JButton delFanta;



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


        delPui = new JButton();
        delPui.setBounds(50,20,250,40);
        delPui.addActionListener(this);
        delPui.setText("Scoateti Pui");
        delPui.setVisible(false);
        delPui.setEnabled(false);

        delVita = new JButton();
        delVita.setBounds(50,70,250,40);
        delVita.addActionListener(this);
        delVita.setText("Scoateti Vita");
        delVita.setVisible(false);
        delVita.setEnabled(false);

        delMixt= new JButton();
        delMixt.setBounds(50,120,250,40);
        delMixt.addActionListener(this);
        delMixt.setText("Scoateti Mixt");
        delMixt.setVisible(false);
        delMixt.setEnabled(false);

        delTon= new JButton();
        delTon.setBounds(50,170,250,40);
        delTon.addActionListener(this);
        delTon.setText("Scoateti Ton");
        delTon.setVisible(false);
        delTon.setEnabled(false);

        delCaeser= new JButton();
        delCaeser.setBounds(50,220,250,40);
        delCaeser.addActionListener(this);
        delCaeser.setText("Scoateti Caesar");
        delCaeser.setVisible(false);
        delCaeser.setEnabled(false);

        delCola= new JButton();
        delCola.setBounds(50,270,250,40);
        delCola.addActionListener(this);
        delCola.setText("Scoateti Cola");
        delCola.setVisible(false);
        delCola.setEnabled(false);

        delSprite= new JButton();
        delSprite.setBounds(50,320,250,40);
        delSprite.addActionListener(this);
        delSprite.setText("Scoateti Sprite");
        delSprite.setVisible(false);
        delSprite.setEnabled(false);

        delFanta= new JButton();
        delFanta.setBounds(50,370,250,40);
        delFanta.addActionListener(this);
        delFanta.setText("Scoateti Fanta");
        delFanta.setVisible(false);
        delFanta.setEnabled(false);




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
        this.add(delCaeser);
        this.add(delMixt);
        this.add(delPui);
        this.add(delSprite);
        this.add(delCola);
        this.add(delFanta);
        this.add(delTon);
        this.add(delVita);

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


    public void delMeniu(boolean bool){
        delFanta.setVisible(bool);
        delFanta.setEnabled(bool);
        delCola.setVisible(bool);
        delCola.setEnabled(bool);
        delSprite.setVisible(bool);
        delSprite.setEnabled(bool);
        delVita.setVisible(bool);
        delVita.setEnabled(bool);
        delPui.setVisible(bool);
        delPui.setEnabled(bool);
        delMixt.setVisible(bool);
        delMixt.setEnabled(bool);
        delTon.setVisible(bool);
        delTon.setEnabled(bool);
        delCaeser.setVisible(bool);
        delCaeser.setEnabled(bool);

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
        if(e.getSource() == Stergere){
            System.out.println("Stergere");
            MainMeniu(false);
            delMeniu(true);
        }
        if(e.getSource() == delPui){
            ff.cs.DeleteElemcos(ff.alegereprodus(1), 1,1);
            MainMeniu(true);
            delMeniu(false);
        }
        if(e.getSource() == delVita){
            ff.cs.DeleteElemcos(ff.alegereprodus(2), 1,2);
            MainMeniu(true);
            delMeniu(false);
        }
        if(e.getSource() == delMixt){
            ff.cs.DeleteElemcos(ff.alegereprodus(3), 1,3);
            MainMeniu(true);
            delMeniu(false);
        }
        if(e.getSource() == delTon){
            ff.cs.DeleteElemcos(ff.alegereprodus(4), 1,4);
            MainMeniu(true);
            delMeniu(false);
        }
        if(e.getSource() == delCaeser){
            ff.cs.DeleteElemcos(ff.alegereprodus(5), 1,5);
            MainMeniu(true);
            delMeniu(false);
        }
        if(e.getSource() == delCola){
            ff.cs.DeleteElemcos(ff.alegereprodus(6), 1,6);
            MainMeniu(true);
            delMeniu(false);
        }
        if(e.getSource() == delSprite){
            ff.cs.DeleteElemcos(ff.alegereprodus(7), 1,7);
            MainMeniu(true);
            delMeniu(false);
        }
        if(e.getSource() == delFanta){
            ff.cs.DeleteElemcos(ff.alegereprodus(8), 1,8);
            MainMeniu(true);
            delMeniu(false);
        }

        if(e.getSource() == Finalizare){
            System.out.println("Finalizare");
            int answer = JOptionPane.showConfirmDialog(null, "Suma este: " + ff.cs.getSold() + "\n Doriti sa finalizati comanda?", "Finalizare comanda", JOptionPane.YES_NO_OPTION);
            if (answer == 0) System.exit(0);
        }


    }
}
