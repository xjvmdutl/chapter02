package ch06;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;

	/*
	 * public Student() {// �����ڿ��� ���� �ʱ�ȭ ���ְ� �������� ��� �ϳ�?
	 * System.out.println("student ����"); }
	 */
	public Student(int studentNumber, String studentName, int grade) {
		studentNumber = studentNumber;//�̷��� ���� ������ �ִ�.
		//why? ������ ã�� ���ü��� ���� ������ ã�� ������ �Ű������� �Ű������� �����Ѵ�.
		//�ɹ������� �Ű������� �����ϰ� ��������?
		this.studentNumber=studentNumber;//�ɹ����� = �Ű�����
		this.studentName=studentName;//�ɹ����� = �Ű�����
		this.grade=grade;//�ɹ����� = �Ű�����
	}
	public Student() {
		
	}
	public String showStudentInfo() {
		//int i;//�ش� ���������� ���µ� �ʱ�ȭ�� ���� �ʱ� ������ ����
		
		return studentName + "�л��� �й��� "+ studentNumber + "�̰�, "+grade +"�г� �Դϴ�.";//+ i;
	}
	
}
