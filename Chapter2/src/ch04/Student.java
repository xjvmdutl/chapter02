package ch04;

public class Student {
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {//�л� ������ �����ش�.
		System.out.println(studentID + "�й� �л��� �̸��� "+studentName+" �̰�, �ּҴ� "+address+"�Դϴ�.");
	}
	
	public String getStudentName(){//studentName�� �������� �Լ�
		return studentName;
	}
	public void setStudentName(String name) {//studentName�� �����ϴ� �Լ�
		studentName = name; 
	}
	
}
