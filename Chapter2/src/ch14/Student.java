package ch14;

public class Student {
	String studentName;//�̸�
	int money;//��
	public Student(String studentName,int money) {
		this.studentName = studentName;
		this.money = money;
	}
	public void takeBus(Bus bus) {//�л��� ������ ź��
		bus.take(1000);//ctrl + ���콺 ���� Ŭ�� = ��ü �޼ҵ� �̵�
		this.money -= 1000;
	}
	public void takeSubway(Subway subway) {//�л��� ����ö�� ź��
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� "+ money +"�� �Դϴ�.");
	}
}
