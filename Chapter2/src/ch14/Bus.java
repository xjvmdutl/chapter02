package ch14;

public class Bus {
	int busNumber;//������ȣ
	int passengerCount;//�°���
	int money;//����
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	public void take(int money) {//money=�л��� ������ ��, ��ü ����
		this.money += money;
		passengerCount++;//�°����� ����
	}
	public void showBusInfo() {
		System.out.println(busNumber + "���� �°� ���� "+ passengerCount +"�� �̰�, ������ "+ money + "���Դϴ�.");
	}
}
