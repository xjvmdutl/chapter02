package ch04;

public class StudentTest {

	public static void main(String[] args) {
		//Ŭ���� ���� ��� : ������Ÿ�� ������ = new ������Ÿ��
		Student studentLee = new Student();// ũ�Ⱑ ������ ���� x 
										   // new �� �л� �Ѹ��� �����Ѵ� = �ν��Ͻ�
										   // class �ϳ��� �������� �������� �ν��Ͻ��� ���� �����ϴ�
		//studentLee = �������� , �����Ǵ� ���� �޸� ��ġ�� ����Ų��
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "���� ������";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName="Kim";
		studentKim.address="��⵵ ������";
		studentKim.showStudentInfo();
		
		
	}

}
