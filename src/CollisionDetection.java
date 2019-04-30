import java.util.ArrayList;

public class CollisionDetection {

		
		public boolean isCollision(ArrayList<Car> car ,Car mycar) {
			//車輛碰撞檢查
			for(int i = 0 ; i < car.size() ; i++) {
				Car cars = car.get(i);
				if(mycar.getX() <= cars.getX() && mycar.getX()+mycar.getWidth() <= cars.getX() ){
					//車在目標左邊不相交
					return false;
				}else if(mycar.getX() >= cars.getX() && mycar.getX() >= cars.getX() + cars.getWidth() ){
					//車在目標右邊不相交
					return false;
				}else if(mycar.getY() >= cars.getY() && mycar.getY() >= cars.getY() + cars.getHeight()){
					//車在目標下邊面不相交
					return false;
				}else if(mycar.getY() <= cars.getY() && mycar.getY() + mycar.getHeight() <= cars.getY() ) {
					//車在目標上面不相交
					return false;
				}		
			}
			//不相交皆不滿足，即相交。
			System.out.println("車禍了");
			return true;
		}
		
		public boolean outLine(Road road ,Car car) {
			//道路出界檢查,車子中心 超過路邊即出界
			double tmpX;
			//左線			
			tmpX =(road.leftdnY - road.leftupY) * car.getCx() + 
					(road.leftupX - road.leftdnX) * car.getCy() + 
					(road.leftdnX * road.leftupY - road.leftupX * road.leftdnY );
			
			if(tmpX < 0) {
				System.out.println("左出");
				return true;
			}
			//右線
			tmpX =(road.rightdnY - road.rightupY) * car.getCx() + 
					(road.rightupX - road.rightdnX) * car.getCy() + 
					(road.rightdnX * road.rightupY - road.rightupX * road.rightdnY );
			
			if(tmpX > 0) {
				System.out.println("右出");
				return true;
			}

			return false;
		}
		
		
}

