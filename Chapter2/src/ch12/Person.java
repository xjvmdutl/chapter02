package ch12;

public class Person {
	String name;
	int age;
	
	public Person() {//����Ʈ ������
		/*
		 * int num = 10; 
		 * name = "test";
		 */
		//�ش� �ڵ� �� �Ұ��� why? ���� �Ǵ°��� ���� ����ǰ� �ؾߵȴ�(this Ű���� �ؿ� ���� �ؾ��Ѵ�)
		
		//�ƹ� ���� ������ �ʱ�ȭ�� �ϰ� ���� ��� ���
		this("no name", 1);//�ؿ� �����ڰ� ����ȴ�.
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void showPerson() {
		System.out.println(name+","+age);
	}
	
	public Person getPerson() {
		return this;
	}
	
	//�׽�Ʈ �ڵ带 ���θ����� �ʰ� Person Ŭ���� �� ����� ����
	public static void main(String[] args) {
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);// Ŭ����fullname.jvm�� asign �� �ּҰ�
		Person person2 = person.getPerson();
		System.out.println(person2);//person �� person2�� ���� = this�� �������� ���� ���ٴ°� ����
	}
}
