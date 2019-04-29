import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Road {
	
	int leftupX;
	int leftupY;
	int leftdnX;
	int leftdnY;
	
	int rightupX;
	int rightupY;
	int rightdnX;
	int rightdnY;
	
	public Road(int x,int y,int dx,int dy,int width) {
		//¥ª¤W xy  ¥ª¤U dx dy
		leftupX = x;
		leftupY = y;
		
		leftdnX = dx;
		leftdnY = dy;
		
		rightupX = x+width;
		rightupY = dy;
		
		rightdnX = dx +width;
		rightdnY = dy;
	}
	
	public void setPos(int dy) {
			
		leftupY += dy;
			
		leftdnY += dy;
		
		rightupY += dy;
	
		rightdnY += dy;
				
	}
	
	public void Line(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setStroke(new BasicStroke(3));
		
		g2.drawLine(leftupX, leftupY, leftdnX, leftdnY);
		g2.drawLine(rightupX, rightupY, rightdnX, rightdnY);
	}


}
