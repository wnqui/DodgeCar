import java.util.ArrayList;

public class CollisionDetection {

		
		public boolean isCollision(ArrayList<Car> car ,Car mycar) {
			//�����I���ˬd
			for(int i = 0 ; i < car.size() ; i++) {
				Car cars = car.get(i);
				if(mycar.getX() <= cars.getX() && mycar.getX()+mycar.getWidth() <= cars.getX() ){
					//���b�ؼХ��䤣�ۥ�
					return false;
				}else if(mycar.getX() >= cars.getX() && mycar.getX() >= cars.getX() + cars.getWidth() ){
					//���b�ؼХk�䤣�ۥ�
					return false;
				}else if(mycar.getY() >= cars.getY() && mycar.getY() >= cars.getY() + cars.getHeight()){
					//���b�ؼФU�䭱���ۥ�
					return false;
				}else if(mycar.getY() <= cars.getY() && mycar.getY() + mycar.getHeight() <= cars.getY() ) {
					//���b�ؼФW�����ۥ�
					return false;
				}		
			}
			//���ۥ�Ҥ������A�Y�ۥ�C
			System.out.println("���פF");
			return true;
		}
		
		public boolean outLine(Road road ,Car car) {
			//�D���X���ˬd,���l���� �W�L����Y�X��
			double tmpX;
			//���u			
			tmpX =(road.leftdnY - road.leftupY) * car.getCx() + 
					(road.leftupX - road.leftdnX) * car.getCy() + 
					(road.leftdnX * road.leftupY - road.leftupX * road.leftdnY );
			
			if(tmpX < 0) {
				System.out.println("���X");
				return true;
			}
			//�k�u
			tmpX =(road.rightdnY - road.rightupY) * car.getCx() + 
					(road.rightupX - road.rightdnX) * car.getCy() + 
					(road.rightdnX * road.rightupY - road.rightupX * road.rightdnY );
			
			if(tmpX > 0) {
				System.out.println("�k�X");
				return true;
			}

			return false;
		}
		
		
}

