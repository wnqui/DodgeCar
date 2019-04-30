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
				}else if(mycar.getY() >= car.get(i).getY() && mycar.getY() >= car.get(i).getY() + car.get(i).getHeight()){
					//���b�ؼФU�䭱���ۥ�
					return false;
				}else if(mycar.getY() <= car.get(i).getY() && mycar.getY() + mycar.getHeight() <= car.get(i).getY() ) {
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

