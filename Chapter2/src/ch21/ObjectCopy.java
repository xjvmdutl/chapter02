package ch21;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];//������ �迭
		library[0] = new Book("�¹���1","������");
		library[1] = new Book("�¹���2","������");
		library[2] = new Book("�¹���3","������");
		library[3] = new Book("�¹���4","������");
		library[4] = new Book("�¹���5","������");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		//(�����,0����,��𿡴ٰ�,0����,5����) 
		
//		System.out.println("=======library======");
//		for(Book book : library) {
//			System.out.println(book);
//			book.showInfo();
//		}
//		
//		System.out.println("=======copy library======");
//		for(Book book : copyLibrary) {
//			System.out.println(book);//����� ������ �ּҵ� ����.
//			book.showInfo();
//		}
		library[0].setAuthor("�ڿ���");
		library[0].setTitle("����");
		System.out.println("=======library======");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("=======copy library======");
		for(Book book : copyLibrary) {
			System.out.println(book);//ī���� �ͱ��� ���� �ٲ����.
			book.showInfo();
		}
		
		//�ΰ��� �迭 ��� ���� �ּ��� ���������� ����Ű�� �ֱ� ������ �ι迭 ��� ������ ��ģ��.
		
	}

}
