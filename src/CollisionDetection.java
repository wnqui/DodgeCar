import java.util.ArrayList;

public class CollisionDetection {

		
		public boolean isCollision(ArrayList<Car> car ,Car mycar) {
			//�����I���ˬd
			for(int i = 0 ; i < car.size() ; i++) {
				
				if(mycar.getX() <= car.get(i).getX() && mycar.getX()+mycar.getWidth() <= car.get(i).getX() ){
					//���b�ؼХ��䤣�ۥ�
					return false;
				}else if(mycar.getX() >= car.get(i).getX() && mycar.getX() >= car.get(i).getX() + car.get(i).getWidth() ){
					//���b�ؼХk�䤣�ۥ�
					return false;
				}else if(mycar.getY() <= car.get(i).getY() && mycar.getY() <= car.get(i).getY() + car.get(i).getHeight()){
					//���b�ؼФU�䭱���ۥ�
					return false;
				}else if(mycar.getY() >= car.get(i).getY() && mycar.getY() + mycar.getHeight() >= car.get(i).getY() ) {
					//���b�ؼФW�����ۥ�
					return false;
				}		
			}
			//���ۥ�Ҥ������A�Y�ۥ�C
			return true;
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

