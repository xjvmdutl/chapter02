package ch06;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();//�⺻ �����ڰ� ���� �Ǳ� ���� �ƹ��͵� �Ƚᵵ ����
		//�����Ϸ��� ����Ʈ �����ڸ� ����� �ִ� ���� �����ڰ� ������..
		//���� ����� �־�� �Ѵ�.
		studentLee.grade =1;//�̷��Ե� �����ϰ� �����ڷ� ä���൵ �ȴ�.
		System.out.println(studentLee.showStudentInfo());//�ɹ������� �ƹ� �͵� �Ƚᵵ �ڵ����� �ʱ�ȭ �ȴ�.
		Student studentKim = new Student(123456,"kim",3);
		System.out.println(studentKim.showStudentInfo());//�ɹ������� �ƹ� �͵� �Ƚᵵ �ڵ����� �ʱ�ȭ �ȴ�.
		
	}

}
