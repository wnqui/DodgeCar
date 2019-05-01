import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Screen {
	
	public void Start(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setStroke(new BasicStroke(3));
		
	}
	
	public void GameOver(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		
	}

}
