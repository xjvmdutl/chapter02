package ch22;

public class TwoDimensionTest {

	public static void main(String[] args) {
		int[][] arr  = {{1,2,3},{1,2,3,4}};
		//int[][] arr  = new int[3][4];//0���� �ʱ�ȭ �ϰ� ũ�⸦ �����ؾ��Ѵ�.
		int i,j;
		for(i=0;i<arr.length;++i) {//��
			for(j=0;j<arr[i].length;++j) {//��(i��° ���� ���̸�ŭ ���ƶ�)
				System.out.print(arr[i][j]+ ",");
			}
			//���� �� ������ �ٹٲ�
			System.out.println("\t"+arr[i].length);
		}
		//��ü �������迭 ���� �Ȱ���
	}

}
