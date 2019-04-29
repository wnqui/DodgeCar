import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DodgeCar implements ActionListener ,KeyListener ,MouseListener,MouseMotionListener{
	
	//�`��
	public static final int WITDH = 600;
	public static final int HEIGHT = 800;	
	//����
	static JFrame JF;
	static DodgeCar DC;
	static myJPanel MP;
	public CollisionDetection CD = new CollisionDetection();
	public Screen screen = new Screen();
	//����

	public DodgeCar(){
		
		JF = new JFrame("Dodge Car Game");
		JF.setResizable(false);
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JF.setBounds(100, 100, WITDH, HEIGHT);
		JF.setAlwaysOnTop(true);
		JF.setVisible(true);
		MP = new myJPanel();
		JF.add(MP);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		
		MP.repaint();
	}
	public void repaint(Graphics g) {
		//�թ�
		Graphics2D g2 = (Graphics2D)g;
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.white);	
		g2.fillRect(0, 0, WITDH, HEIGHT);
		
		
	}
	public static void main(String[] args) {
		DC = new DodgeCar();
	}




	@Override
	public void keyPressed(KeyEvent arg0) {
		//���䱱��
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		//�I������
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		//���ʱ���l
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {}
	@Override
	public void keyTyped(KeyEvent arg0) {}
	@Override
	public void mouseClicked(MouseEvent arg0) {}
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mouseReleased(MouseEvent arg0) {}
	@Override
	public void mouseDragged(MouseEvent arg0) {}

	
//end
}

class myJPanel extends JPanel{	
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		DodgeCar.DC.repaint(g);
	}
	
}
