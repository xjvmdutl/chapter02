package ch10;

public class BirthDayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirthDay date = new BirthDay();
		date.setYear(2019);//private������ ������ �ʴ´�.
		//date.setMonth(13);
		date.setMonth(12);
		/*
		 * date.month = 100; private�� �ƴҰ�� ������ �̷��� ���� �����Ҽ� �ִ�. 
		 * �ɹ� ������ ������ �������� �ְ� ��ü�� �߸� ���ɼ� �ִ�.
		 * get,set �޼ҵ尡 �����ϸ� �������� �������� ���� ������ �����Ҽ� �ִ�.
		 * */
		date.setDay(30);
		date.showDate();
	}

}
