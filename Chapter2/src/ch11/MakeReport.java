package ch11;

public class MakeReport {
	StringBuffer buffer = new StringBuffer();
	//String Ŭ������ ��� ���ؼ� ���� ����� �޸� ȿ���� �� ���� �ʱ� ������ 
	//���������� ���۸� ������ �ִ� Ŭ�������ٰ� String�� ��� �����ϴٰ� �������� �����ϴ� ����� ���� ȿ�����̴�. 
	//StringBuffer, StringBuilder�� ���� ���� ����.
	
	private String line = "===========================================\n";
	private String title = "�̸�\t �ּ� \t\t ��ȭ��ȣ \n";
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	private void generateBody() {
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
		
		buffer.append("Tomas \t");
		buffer.append("NewYork US \t");
		buffer.append("010-7777-0987\n");
	}
	private void makeFooter() {
		buffer.append(line);
	}
	public String getReport() {//��� �޼ҵ尡 private �Ǿ� �ְ� �� �޼ҵ常 public �̴�
		makeHeader();
		generateBody();
		makeFooter();		
		//�ܺο��� ���� �ִ� �޼ҵ�� getReport�ۿ� ����.
		//��ǻ� ���� 3���� �޼ҵ�� Ŭ���̾�Ʈ���� �� �ʿ䰡 ���� ������ Ŭ���̾�Ʈ�� getReport�� ���� �ȴ�.
		//���α׷��� �Ҷ��� � �޼ҵ带 �������� �������� �����ϰ� �ڵ带 ¥���Ѵ�.
		return buffer.toString();
	}
}
