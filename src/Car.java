import java.awt.Graphics;

public class Car {

	private int x;
	private int y;
	private int width =50;
	private int height =50;
	private int number;
	private int speed;
	
	public int myCar =1;
	public int aiCar =2;
	public int truck =3;
	public int roadBlock =4;
	public int hole =5;
	
	public Car(int number,int x ,int y) {
		switch(number) {
		case 1:
			//玩家車
			this.number = number;
			this.x = x;
			this.y = y;
			this.setWidth(50);
			this.setHeight(70);
			this.speed = 5;
			
			break;
		case 2:
			//電腦小車
			this.number = number;
			this.x = x;
			this.y = y;
			this.setWidth(50);
			this.setHeight(70);
			this.speed = 5;
			break;
		case 3:
			//電腦大車
			this.number = number;
			this.x = x;
			this.y = y;
			this.setWidth(55);
			this.setHeight(150);
			this.speed = 3;
			break;
		case 4:
			//路障一
			this.number = number;
			this.x = x;
			this.y = y;
			this.setWidth(75);
			this.setHeight(30);
			break;
		case 5:
			//路障二
			this.number = number;
			this.x = x;
			this.y = y;
			this.setWidth(50);
			this.setHeight(50);
			break;
		}
		
		
	}
	
	public void move(int dx,int dy) {
		//車子移動，玩家車添加 加速貫性。參數dx,dy為移動目的地。
		
	}
	
	public void drawCar(Graphics g) {
		
		switch(number) {
		case 1:
			//玩家車
			
			break;
		case 2:
			//電腦小車
			
			break;
		case 3:
			//電腦大車
			
			break;
		case 4:
			//路障一
			
			break;
		case 5:
			//路障二
		
			break;
		}
		
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int  getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}


	

}
