import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Gegenstand extends JButton{
	private BufferedImage image;
    private int height;
    private int width;
	
	public Gegenstand(String path) {
	       try {                
	           image = ImageIO.read(new File(path));
	        } catch (IOException ex) { 
	             // handle exception...
	        }
	       
	       height = image.getHeight();
	       width = image.getWidth();
	}
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
    }
    
    
    
	@Override
	public void setSize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		super.setSize(arg0, arg1);
	}

	public int getbHeight() { return height; }
	public void setbHeight(int height) { this.height = height; }

	public int getbWidth() { return width; }
	public void setbWidth(int width) { this.width = width; }
}
