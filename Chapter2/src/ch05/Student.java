package ch05;

public class Student {
	private int studentID;
	private String studentName;
	private String address;
	
	
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	
	public void showStudentInfo() {
		System.out.println("�й��� "+studentID + "�̰�, �̸��� "+studentName+"�̰� �ּҴ� "+address+"�Դϴ�.");
	}
}
