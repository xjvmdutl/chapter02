package ch20;

public class DoubleArrayTest {

	public static void main(String[] args) {
		double[] dArr = new double[5];
		int count = 0;//�ڵ鸵 ����
		dArr[0] = 1.1; 
		count++;
		dArr[1] = 2.1;
		count++;
		dArr[2] = 3.1;
		count++;//��Ҹ� ���� �ҋ����� �����ش�
		double mtotal = 1; 
		for(int i = 0; i< count; i++) {
			mtotal *= dArr[i];
		} 
		System.out.println(mtotal);//�ش� ���� 0 ���� �ȴ�.
		//�迭 ũ�⸦ ���� �� �Ⱦ��� �� ��� ��� ���� �� ���ϱ� ������ 0�� ���´�
		
		
	}

}
