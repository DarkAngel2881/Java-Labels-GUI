import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args) throws Exception 
    {
        //creazione pagina
        JFrame main_frame = new JFrame("HEHE");
        main_frame.setLayout(null);
       
        //creazione pannelli
        JPanel first = new JPanel(null);
        JPanel second = new JPanel(null);
        JPanel third = new JPanel(null);
        JPanel fourth = new JPanel(null);
        main_frame.setLayout(null);
        
        //definizione font
        Font sans = new Font("Comic Sans MS", Font.BOLD, 20);
        Font arial = new Font("Arial", Font.BOLD, 12);
        Font tnr = new Font("Times New Roman", Font.BOLD, 19);
        
        //colore dei pannelli
        first.setBackground(Color.blue);
        second.setBackground(Color.green);
        third.setBackground(Color.yellow);
        fourth.setBackground(Color.red);
        
        //dimensioni di scheda e pannelli
        main_frame.setSize(800, 600);
        first.setBounds(100, 100, 600, 400);
        second.setBounds(175, 75, 250, 80);
        third.setBounds(100, 265, 400, 100);
        fourth.setBounds(80, 50, 240, 30);

        //definizione etichette
        JLabel text1 = new JLabel("Ciao");
        JLabel text2 = new JLabel("Ciao più piccolo");
        JLabel text3 = new JLabel("Buongiornissimo caffè");

        //formattazione scritta1
        text1.setBounds(0, 15, 100, 30);
        text1.setForeground(Color.red);
        text1.setFont(sans);

        //formattazione scritta2
        text2.setBounds(5, 5, 100, 10);
        text2.setForeground(Color.black);
        text2.setFont(arial);

        //formattazione scritta3
        text3.setBounds(25, 5, 200, 25);
        text3.setForeground(Color.black);
        text3.setFont(tnr);

        //disposizione pannelli e etichette nel frame e rispettivi pannelli
        main_frame.add(first);
        first.add(second);
        first.add(third);
        second.add(text1);
        third.add(fourth);
        third.add(text2);
        fourth.add(text3);
        
        //frame visibile
        main_frame.setVisible(true);
        
    }
}
