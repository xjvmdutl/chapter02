package ch11;

public class MakeReportTest {

	public static void main(String[] args) {
		MakeReport builder = new MakeReport();
		String report=builder.getReport();//getReport�� �޼ҵ带 ������ ������ �޼ҵ�� object�� �޼ҵ��̴�.
		System.out.println(report);

	}

}
