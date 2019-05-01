import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Car {

	private int x;
	private int y;
	// 車體中車，滑鼠座標用
	private int cx = 300;
	private int cy = 900;
	private int width = 50;
	private int height = 50;
	private int number;
	private int speed;
	// x與y的加速度
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
			// 玩家車
			this.number = number;
			this.x = x;
			this.y = y;
			this.setWidth(30);
			this.setHeight(50);
			this.speed = 20;

			break;
		case 2:
			// 電腦小車
			this.number = number;
			this.x = x;
			this.y = y;
			this.setWidth(30);
			this.setHeight(50);
			this.speed = 8;
			break;
		case 3:
			// 電腦大車
			this.number = number;
			this.x = x;
			this.y = y;
			this.setWidth(50);
			this.setHeight(150);
			this.speed = 5;
			break;
		case 4:
			// 路障一
			this.number = number;
			this.x = x;
			this.y = y;
			this.setWidth(75);
			this.setHeight(30);
			break;
		case 5:
			// 路障二
			this.number = number;
			this.x = x;
			this.y = y;
			this.setWidth(50);
			this.setHeight(50);
			break;
		}

	}

	public void move(int dx, int dy) {
		// 車子移動，玩家車添加 加速貫性。參數dx,dy為移動目的地。

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
			// 玩家車
			g2.setColor(Color.red);
			g2.fillRect(x, y, width, height);
			g2.setColor(Color.black);
			g2.drawRect(x, y, width, height);

			break;
		case 2:
			// 電腦小車
			g2.setColor(Color.blue);
			g2.fillRect(x, y, width, height);
			g2.setColor(Color.black);
			g2.drawRect(x, y, width, height);

			break;
		case 3:
			// 電腦大車
			g2.setColor(Color.yellow);
			g2.fillRect(x, y, width, height);
			g2.setColor(Color.black);
			g2.drawRect(x, y, width, height);

			break;
		case 4:
			// 路障一

			break;
		case 5:
			// 路障二

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
