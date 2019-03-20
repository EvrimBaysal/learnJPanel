// Import-Anweisungen
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.metal.MetalIconFactory;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JPanelBeispiel
{
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            }
        });
    }
    
    private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? "+
        SwingUtilities.isEventDispatchThread());
        Gegenstand obj1 = new Gegenstand("C:\\Users\\Alfa\\Downloads\\images\\star.png");
        DragListener drag = new DragListener();
        //label.addMouseListener( drag );
        //label.addMouseMotionListener( drag );
        obj1.setSize(obj1.getbWidth(), obj1.getbHeight());
        obj1.setPreferredSize(new Dimension(obj1.getbWidth(), obj1.getbHeight()));
        obj1.addMouseListener(drag);
        obj1.addMouseMotionListener( drag );
        ImagePanel image1 = new ImagePanel();
        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        image1.add(obj1);
        f.add(image1);
        System.out.println(image1.getSize());
        f.setSize(image1.getiWidth(), image1.getiHeight()); 
        //f.setSize(250,250);
        f.setVisible(true);
    }
  
}