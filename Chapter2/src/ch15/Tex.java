package ch15;

public class Tex {
	String companyName;
	int money;
	public Tex(String companyName) {
		this.companyName = companyName;
	}
	public void take(int money) {
		this.money += money;
	}
	public void showTexInfo() {
		System.out.println(companyName + "�ý� ������ "+money+"�� �Դϴ�.");
	}
}
