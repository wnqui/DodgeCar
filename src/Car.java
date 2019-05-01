import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Car {

	private int x;
	private int y;
	// ���餤���A�ƹ��y�Х�
	private int cx = 300;
	private int cy = 900;
	private int width = 50;
	private int height = 50;
	private int number;
	private int speed;
	// x�Py���[�t��
	private double xa = 0;
	private double ya = 0;

	public int myCar = 1;
	public int aiCar = 2;
	public int truck = 3;
	public int roadBlock = 4;
	public int hole = 5;
	public boolean isOver;

	public Car(int number, int x, int y) {
		switch (number) {
		case 1:
			// ���a��
			this.number = number;
			this.x = x;
			this.y = y;
			this.setWidth(30);
			this.setHeight(50);
			this.speed = 20;

			break;
		case 2:
			// �q���p��
			this.number = number;
			this.x = x;
			this.y = y;
			this.setWidth(30);
			this.setHeight(50);
			this.speed = 8;
			break;
		case 3:
			// �q���j��
			this.number = number;
			this.x = x;
			this.y = y;
			this.setWidth(50);
			this.setHeight(150);
			this.speed = 5;
			break;
		case 4:
			// ���٤@
			this.number = number;
			this.x = x;
			this.y = y;
			this.setWidth(75);
			this.setHeight(30);
			break;
		case 5:
			// ���٤G
			this.number = number;
			this.x = x;
			this.y = y;
			this.setWidth(50);
			this.setHeight(50);
			break;
		}

	}

	public void move(int dx, int dy) {
		// ���l���ʡA���a���K�[ �[�t�e�ʡC�Ѽ�dx,dy�����ʥت��a�C

		if (dx != this.cx && xa < speed) {
			xa++;
		}

		if (dy != this.cy && ya < speed) {
			ya++;
		}

		if (dx > this.cx) {

			this.cx += xa;

			if (dx <= this.cx)
				xa = 0;

		} else {

			this.cx -= xa;

			if (dx >= this.cx)
				xa = 0;

		}

		if (dy > this.cy) {

			this.cy += ya;

			if (dy <= this.cy)
				ya = 0;

		} else {

			this.cy -= ya;

			if (dy >= this.cy)
				ya = 0;

		}

		this.x = cx - width / 2;
		this.y = cy - height / 2;

	}

	public void aiMove(Road road) {
		double m;
		if ((road.leftupX != road.leftdnX) && y >= road.leftupY && y <= road.leftdnY) {

			m = (road.leftdnY - road.leftupY) / (road.leftdnX - road.leftupX);

			this.x += speed / m;

		}

		this.y += speed;

	}

	public void drawCar(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));

		switch (number) {
		case 1:
			// ���a��
			g2.setColor(Color.red);
			g2.fillRect(x, y, width, height);
			g2.setColor(Color.black);
			g2.drawRect(x, y, width, height);

			break;
		case 2:
			// �q���p��
			g2.setColor(Color.blue);
			g2.fillRect(x, y, width, height);
			g2.setColor(Color.black);
			g2.drawRect(x, y, width, height);

			break;
		case 3:
			// �q���j��
			g2.setColor(Color.yellow);
			g2.fillRect(x, y, width, height);
			g2.setColor(Color.black);
			g2.drawRect(x, y, width, height);

			break;
		case 4:
			// ���٤@

			break;
		case 5:
			// ���٤G

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

	public int getSpeed() {
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

	public int getCx() {
		return cx;
	}

	public void setCx(int cx) {
		this.cx = cx;
	}

	public int getCy() {
		return cy;
	}

	public void setCy(int cy) {
		this.cy = cy;
	}

}
