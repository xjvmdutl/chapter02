package ch21;

public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];//������ �迭
		library[0] = new Book("�¹���1","������");
		library[1] = new Book("�¹���2","������");
		library[2] = new Book("�¹���3","������");
		library[3] = new Book("�¹���4","������");
		library[4] = new Book("�¹���5","������");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		for(int i=0;i<library.length;++i) {//�迭�� ���鼭 ���� ���� �־��־�� �Ѵ�.
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		library[0].setAuthor("�ڿ���");
		library[0].setTitle("����");
		System.out.println("=======library======");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("=======copy library======");
		for(Book book : copyLibrary) {
			System.out.println(book);//�ּҰ� �ٸ��� ������ ���� ������� �ʴ´�.
			book.showInfo();
		}
		//�ι迭�� ���� ��ü�� ����ų �ʿ䰡 ������� ���� ���� , �ƴҰ�� ���� ����
	}
}
