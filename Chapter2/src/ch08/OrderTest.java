package ch08;

public class OrderTest {

	public static void main(String[] args) {
		Order orderOne = new Order("20201102003", "01023450001", "����� ������ ���ﵿ", "20201102", 130258, 35000, "0003");
		System.out.println(orderOne.orderInfo());
		
	}

}
