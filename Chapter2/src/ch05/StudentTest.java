package ch05;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(); 
		studentLee.setStudentID(12345);
		studentLee.setStudentName("Lee");
		studentLee.setAddress("���� ������");
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.setStudentID(54321);
		studentKim.setStudentName("Kim");
		studentKim.setAddress("��⵵ ������");
		studentKim.showStudentInfo();
		
		
		System.out.println(studentKim);//��Ű��.Ŭ������@�ּҰ�(������)
		System.out.println(studentLee);//�ּҰ��� ���� �ڸ��� ����ִ��ּҸ� ���Ѵ�(jvm�� �ӽ÷� �� �ּҰ�)
	}

}
