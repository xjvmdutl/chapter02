package ch14;

public class Subway {
	int lineNumber;//����ö ��ȣ
	int passengerCount;//�°���
	int money;//����
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showSubwayInfo() {
		System.out.println(lineNumber + "���� �°� ���� "+ passengerCount + "�� �̰�, ������ "+money+"�� �Դϴ�.");
	}
}
