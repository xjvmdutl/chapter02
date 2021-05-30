package ch24;

import java.util.ArrayList;

public class Student {
	private int studentNum;
	private String studentName;
	private ArrayList<Subject> subList;
	
	public Student(int studentNum,String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
		subList = new ArrayList<>();
	}
	public void addSubject(String subjectName,int subjectScore) {
		subList.add(new Subject(subjectName,subjectScore));
	}
	public void showStudentInfo() {
		int totalScore = 0;
		for(int i=0;i<subList.size();++i) {
			System.out.println("�л� "+ studentName + "�� "+subList.get(i).getSubjectName() + " ���� ������ "+ subList.get(i).getSubjectScore()+"�Դϴ�.");
			totalScore += subList.get(i).getSubjectScore();
		}
		System.out.println("�л� "+ studentName + "�� ������ "+totalScore + " �Դϴ�.");
	}
}
