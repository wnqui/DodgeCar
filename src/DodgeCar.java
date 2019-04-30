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
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class DodgeCar implements ActionListener ,KeyListener ,MouseListener,MouseMotionListener{
	
	//常數
	public static final int WITDH = 600;
	public static final int HEIGHT = 800;	
	//物件
	static JFrame JF;
	static DodgeCar DC;
	static myJPanel MP;
	public CollisionDetection CD = new CollisionDetection();
	public Screen screen = new Screen();
	
	Car mycar = new Car(1,300,900);
	ArrayList<Road> roads =new ArrayList<Road>();
	ArrayList<Car> cars = new ArrayList<Car>();
	
	//控制
	int mouseX;
	int mouseY;

	public DodgeCar(){
		
		JF = new JFrame("Dodge Car Game");
		JF.setResizable(false);
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JF.setBounds(100, 100, WITDH, HEIGHT);
		JF.setAlwaysOnTop(true);
		JF.setVisible(true);
		MP = new myJPanel();
		JF.add(MP);
		JF.addKeyListener(this);
		JF.addMouseListener(this);
		JF.addMouseMotionListener(this);
		Timer T = new Timer(20,this);
		T.start();
		
		roads.add(new Road(200,0,200,HEIGHT,280));
		roads.add(new Road(300,-HEIGHT,200,0,280));
		
		cars.add(new Car(2,(roads.get(0).leftupX +roads.get(0).rightupX)/2,0));

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if(roads.get(0).leftupY > HEIGHT -1 ) {
			Road nR = roads.get(1);
			if( (int)(Math.random()*10+1) > 5 ) {
				//生成直路
				roads.add(new Road(nR.leftupX,nR.leftupY-HEIGHT,nR.leftupX,nR.leftupY,280));
			}else {
				//生成斜路
				if(nR.leftupX > 250) {
					roads.add(new Road(200,nR.leftupY-HEIGHT,nR.leftupX,nR.leftupY,280));
				}else {
					roads.add(new Road(300,nR.leftupY-HEIGHT,nR.leftupX,nR.leftupY,280));
				}
				
			}
			
			
			roads.remove(0);
		}
		
		if(!mycar.isOver) {
			
			mycar.move(mouseX, mouseY);
			
			for(int i = 0 ; i < roads.size() ; i++) {
				Road road = roads.get(i);
				
				if(mycar.getY() <= road.leftdnY && mycar.getY() >= road.leftupY ) {
					//本車邊界判定
					mycar.isOver = CD.outLine(road, mycar);
					
				}
				
				road.setPos(10);
				
				for(int j =0 ; j < cars.size() ; j++) {
					Car c = cars.get(j);
					//其他車移動			
					c.aiMove(road, 10 );
					
					
					if(c.getY() > HEIGHT) {
						cars.remove(c);
						int r =(int) Math.random()*100+100 ;
						cars.add(new Car(2,roads.get(1).leftdnX + r,0));
						
					}
								
					
				}
			}
		}
		
		
			
		
		if(CD.isCollision(cars, mycar)) mycar.isOver = true;
		
		
		MP.repaint();
	}
	public void repaint(Graphics g) {
		//白底
		Graphics2D g2 = (Graphics2D)g;
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.white);	
		g2.fillRect(0, 0, WITDH, HEIGHT);
		
		for(int i =0 ; i< roads.size() ; i++) {		
			roads.get(i).drawRoad(g);
		}
		
		mycar.drawCar(g);

		for(int i =0 ; i < cars.size() ; i++) {
			cars.get(i).drawCar(g);
		}
		
	}
	public static void main(String[] args) {
		DC = new DodgeCar();
		
	}




	@Override
	public void keyPressed(KeyEvent e) {
		//按鍵控制
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		//點擊控制
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		//移動控制車子
		mouseX = e.getX()-3;
		mouseY = e.getY()-32;
		
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
