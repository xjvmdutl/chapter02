package ch08;

public class Order {
	private String orderNum;
	private String phoneNum;
	private String orderAddress;//�ּ�
	private String orderDate;//�ֹ� ��¥
	private int orderTime;//�ֹ� �ð�
	private int orderPrice;//�ֹ� ����
	private String menuNum;//�޴� ��ȣ
	public Order(String orderNum,String phoneNum,String orderAddress,String orderDate, int orderTime,int orderPrice,String menuNum) {
		this.orderNum=orderNum;
		this.phoneNum=phoneNum;
		this.orderAddress=orderAddress;
		this.orderDate=orderDate;
		this.orderTime=orderTime;
		this.orderPrice=orderPrice;
		this.menuNum=menuNum;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(int orderTime) {
		this.orderTime = orderTime;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getMenuNum() {
		return menuNum;
	}
	public void setMenuNum(String menuNum) {
		this.menuNum = menuNum;
	}
	public String orderInfo() {
		return "�ֹ� ���� ��ȣ : " + orderNum + " \n"
				+ "�ֹ� �ڵ��� ��ȣ : " + phoneNum + "\n"
				+ "�ֹ� �� �ּ� : " + orderAddress + "\n"
				+ "�ֹ� ��¥ : " + orderDate + "\n"
				+ "�ֹ� �ð� : " + orderTime + "\n"
				+ "�ֹ� ���� : " + orderPrice + "\n"
				+ "�޴� ��ȣ : " + menuNum;
	}
	
	
	
}
