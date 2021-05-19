package ch10;

public class BirthDay {
	private int day; //private ���� ������ : �ܺο��� ������ �Ұ���//get,set�޼ҵ� �ۼ��ؾ��Ѵ�.
	private int month;
	private int year;
	//private �� �����ϹǷμ� �������� ������ �������� �ִ�.
	private boolean isValid; // default : false
	
	public int getDay() {
		//�����̳� , �ش���� ���� ��Ȯ�ϰ� ������ �ִ�.
		return day;
	}
	public void setDay(int day) {//getter, setter �޼ҵ� ���� �ٸ��� �ᵵ ������ ��Ģ������ �̷��� ���
		this.day = day;
	}
	//���콺 ������ -> source -> generate getter and setter �� ���� �ڵ����� ����� �ټ� �ִ�.
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {//���� 1 ~ 12�� ���� ���� �ؾ��ϹǷ� �ٸ����� ������ �����ϸ� x
		if(month < 1 || month >12) {//1~12���� �ƴϸ�
			isValid = false;
		}else {//��ȿ�� ��¥�� �Ǿ��ٰ� isvalid�� true�� �ؾߵȴ�
			isValid = true;
			this.month = month;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void showDate() {
		if(isValid) {//���� �ϴ� ��¥�̴�
			System.out.println(year + "�� "+month+"�� "+day+"�� �Դϴ�.");
		}else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
	}
	public boolean getIsValid() {//isValid �������� Ŭ���� ���η������� ���� �����ϱ� ������ set�޼ҵ�� �����ʿ䰡 ����.
		return isValid;//���� ����

	}
}
