import java.util.ArrayList;

public class CollisionDetection {

		
		public void catCD(ArrayList car) {
			//車輛碰撞檢查
		}
		public boolean outLine(Road road ,Car car) {
			//道路出界檢查
			double tmpX;
			//左線
			tmpX = (road.leftupX - road.leftdnX) / (road.leftupY - road.leftdnY) * (car.getY() - road.leftdnY) +road.leftdnX;
			
			if(tmpX	> car.getX()) {
				return true;
			}
			//右線
			tmpX = (road.rightupX - road.rightdnX) / (road.rightupY - road.rightdnY) * (car.getY() - road.rightdnY) +road.rightdnX;
			
			if(tmpX	< car.getX()) {
				return true;
			}
			
			return false;
		}

}

