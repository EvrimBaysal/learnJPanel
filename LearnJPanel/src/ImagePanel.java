import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
    private BufferedImage image;
    private int height;
    private int width;

    public ImagePanel() {
       try {                
          image = ImageIO.read(new File("C:\\Users\\Alfa\\Downloads\\room.jpg"));
       } catch (IOException ex) { 
            // handle exception...
       }
       
       height = image.getHeight();
       width = image.getWidth();
       //System.out.println(image.getHeight());
       //System.out.println(image.getWidth());
       
    }
    
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
    }



	public int getiHeight() { return height; }
	public void setiHeight(int height) { this.height = height; }

	public int getiWidth() { return width; }
	public void setiWidth(int width) { this.width = width; }
}
