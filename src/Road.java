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
	
	public void setPos(int dx,int dy) {
		
		leftupX += dx;
		leftupY += dy;
		
		leftdnX += dx;
		leftdnY += dy;
		
		rightupX += dx;
		rightupY += dy;
		
		rightdnX += dx;
		rightdnY += dy;
		
		
	}
	
	public void Line(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setStroke(new BasicStroke(3));
		
		g2.drawLine(leftupX, leftupY, leftdnX, leftdnY);
		g2.drawLine(rightupX, rightupY, rightdnX, rightdnY);
	}


}
