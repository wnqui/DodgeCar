import java.awt.Graphics;

public class Car {

	private int x;
	private int y;
	private int number;
	
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

}
