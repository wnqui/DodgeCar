import java.awt.Graphics;

public class Car {

	private int x;
	private int y;
	private int number;
	
	public void move(int dx,int dy) {
		//���l���ʡA���a���K�[ �[�t�e�ʡC�Ѽ�dx,dy�����ʥت��a�C
	}
	
	public void drawCar(Graphics g) {
		
		switch(number) {
		case 1:
			//���a��
			
			break;
		case 2:
			//�q���p��
			
			break;
		case 3:
			//�q���j��
			
			break;
		case 4:
			//���٤@
			
			break;
		case 5:
			//���٤G
		
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
