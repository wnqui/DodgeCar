import java.util.ArrayList;

public class CollisionDetection {

		
		public void catCD(ArrayList car) {
			//�����I���ˬd
		}
		public boolean outLine(Road road ,Car car) {
			//�D���X���ˬd
			double tmpX;
			//���u
			tmpX = (road.leftupX - road.leftdnX) / (road.leftupY - road.leftdnY) * (car.getY() - road.leftdnY) +road.leftdnX;
			
			if(tmpX	> car.getX()) {
				return true;
			}
			//�k�u
			tmpX = (road.rightupX - road.rightdnX) / (road.rightupY - road.rightdnY) * (car.getY() - road.rightdnY) +road.rightdnX;
			
			if(tmpX	< car.getX()) {
				return true;
			}
			
			return false;
		}

}

