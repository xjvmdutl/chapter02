package ch08;

public class Person {
	private int height;
	private int weight;
	private String name;
	private int age;
	public String personInfo() {
		return "Ű�� "+height+"�̰�, �����԰� "+weight+"ų���� ������ �ֽ��ϴ�. �̸��� "+ name+"�̰� ���̴� "+age+"�� �Դϴ�.";
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
