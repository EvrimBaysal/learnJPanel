// Import-Anweisungen
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

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
        Gegenstand obj2 = new Gegenstand("C:\\Users\\Alfa\\Downloads\\images\\star.png");
        DragListener drag = new DragListener();
        Point dummy;
        //label.addMouseListener( drag );
        //label.addMouseMotionListener( drag );
        //obj1.setSize(obj1.getbWidth(), obj1.getbHeight()); not working
        obj1.setPreferredSize(new Dimension(obj1.getbWidth(), obj1.getbHeight()));
        obj2.setPreferredSize(new Dimension(obj2.getbWidth(), obj2.getbHeight()));
        
        obj1.addMouseListener(drag);
        obj1.addMouseMotionListener( drag );
        obj2.addMouseListener(drag);
        obj2.addMouseMotionListener( drag );
        dummy = obj1.getLocation();
        obj1.addComponentListener(new MyComponentListener( 10, 10));
        obj2.addComponentListener(new MyComponentListener( 200, 200));
        ImagePanel image1 = new ImagePanel();
        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        image1.setLayout(null);
        //obj1.setLocation(0, 0);
        image1.add(obj1);
        image1.add(obj2);
        
        obj1.setBounds(100, 100, obj1.getbWidth(), obj1.getbHeight());
        obj2.setBounds(0, 0, obj2.getbWidth(), obj2.getbHeight());
        f.add(image1);
        System.out.println(image1.getSize());
        f.setSize(image1.getiWidth(), image1.getiHeight()); 
        //f.setSize(250,250);
        f.setVisible(true);
    }
  
}