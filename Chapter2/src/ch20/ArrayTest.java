package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		//int[] arr = new int[10];//10��¥�� �迭����
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};//�̷��� ��� ����
		int total = 0;
//		for(int i=0, num=1;i<arr.length;i++) {
//			//System.out.println(arr[i]);//�迭�� new �ϰ� �Ǹ� default�� �ʱ�ȭ�� �ȴ�.
//			arr[i] = num++;//num�� ������ ����
//		}
		
		for(int num : arr) {//���� for�� : ó������ ������ �ټ�ȸ�Ҷ� ���
			total += num;//�ش� num�� �迭 ��Ұ� �ϳ��� ����.
		}
		System.out.println(total);
	}

}
