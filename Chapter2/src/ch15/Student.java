package ch15;

public class Student {
	String studentName;//�̸�
	int money;//��
	public Student(String studentName,int money) {
		this.studentName = studentName;
		this.money = money;
	}
	public void takeTex(Tex tex, int money) {
		this.money -= money;
		tex.take(money);
	}
	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� "+ money +"�� �Դϴ�.");
	}
}
