package ch19;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();//�̱��� �������� ����
        Car mySonata = factory.createCar();//�� �޼ҵ�� ����
        Car yourSonata = factory.createCar(); 
        System.out.println(mySonata);
        System.out.println(yourSonata);
        System.out.println(mySonata.getCarNum()); //10001 ��� 
		System.out.println(yourSonata.getCarNum()); //10002 ��� 
	}

}
