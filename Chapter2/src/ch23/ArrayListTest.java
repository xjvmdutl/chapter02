package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		//ArrayList Ŭ���� API ���
		ArrayList<Book> library = new ArrayList<>();//� ��ü�� �������� �����ؾ��Ѵ�.
		//�ش� API�� ��ġ�� �˷��־�� �Ѵ�(import)
		//API �� ���� �������� �ش� Ŭ������ f1�� ������ ����
		
		library.add(new Book("�¹���1 ","������"));//��ü�� �����ؼ� �־�� �Ѵ�.
		library.add(new Book("�¹���2 ","������"));
		library.add(new Book("�¹���3 ","������"));
		library.add(new Book("�¹���4 ","������"));
		library.add(new Book("�¹���5 ","������"));
		//�ʱ� ����� �������� ������ 10���� �����ϰ� ũ�⸦ ���� �ø���.
		for(int i = 0;i<library.size();++i) {//length�� �ƴϴ�
			library.get(i).showInfo();
		}
	}

}
