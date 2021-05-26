package ch18;

public class Company {
	//ȸ���� ��ü�� �����ؾ� �Ѵ�.
	//�����Ϸ��� default�����ڸ� ����� ������ �ܺο��� company�� ������ ����� �ִ�
	private static Company instance = new Company();//������ ��ü�� �ȴ�.
	//�ܺο��� �����ڸ� new �Ҽ� ������ private�� ����
	//�����Ϸ��� �����ڸ� ����� ���� �ʴ´�.
	private Company() {
		
	}
	//������ ��ü�� �ܺο��� ���Բ� �ؾ��Ѵ�.
	public static Company getInstance() {//�ܺο��� Ŭ���� �̸����� ���� �����ϰ� static ����
		if(instance == null) {
			instance = new Company();//����� �ڵ�
		}
		return instance;
	}
	
}
