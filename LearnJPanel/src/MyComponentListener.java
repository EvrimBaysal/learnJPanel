import java.awt.Component;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JTextArea;

public class MyComponentListener implements ComponentListener {

	//private int startX;
	//private int startY;
	private int zielX;
	private int zielY;
	
	public MyComponentListener(int zx, int zy) {
//		startX = sx;
//		startY = sy;
		zielX = zx;
		zielY = zy;
	}
	
	
	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		Component c = (Component) e.getSource();
		Point newLoc = c.getLocation();
		
		if((newLoc.x <= zielX + 10) && (newLoc.x >= zielX - 10) && (newLoc.y <= zielY + 10) && (newLoc.y>= zielY - 10)) {
			System.out.println("startX = " + newLoc.x + " startY = " + newLoc.y + " zielX = " + zielX + " zielY = " + zielY);
		}
		// TODO Auto-generated method stub
       // Component c = (Component) evt.getSource();
       // Point newLoc = c.getLocation();
        
//		if((startX <= zielX + 10) && (startX >= zielX - 10) && (startY <= zielY + 10) && (startY >= zielY - 10)) {
//			System.out.println("startX = " + startX + " startY = " + startY + " zielX = " + zielX + " zielY = " + zielY);
//			//System.out.println("Moved");
//		}
		//System.out.println("Moved");
	}

	@Override
	public void componentResized(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	


}
