package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;


public class MyFirstFrame extends JFrame {
    
    public MyFirstFrame(){
        setTitle("Dennis Ramara");
        setSize(400, 400);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLUE);
        setVisible(true);
    }
}
