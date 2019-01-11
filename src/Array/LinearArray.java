package Array;

import java.util.Arrays;

public class LinearArray {
	public static void main(String[] args) {
		int a[] = new int[]{1,9,9,8,1,1,1,3};
		
		int b[] = Arrays.copyOf(a, 6);
		for(int x:b)
			System.out.print(x+" ");
		System.out.println();
		
		System.out.println("-------------");
		
		int c[] = Arrays.copyOfRange(a, 2, 7);
		//to - the final index of the range to be copied, exclusive(������)
		//��ԭ�����±�2��ʼ���Ƶ��±�7��������7
		for(int x:c)
			System.out.print(x+" ");
		System.out.println();
		
		System.out.println("***************");
		
		
		Arrays.fill(a,6);		//������䣺������aȫ�����Ϊ6
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		Arrays.fill(a,1,5,9);	//������䣺������a�±�1���±�5���Ϊ9
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		
		System.out.println("-+-++-+-+--+-+-+-+-+");
		
		
		int d[] = new int[8];
		System.arraycopy(a,2,d,3,4);
		//��a�������±�Ϊ2��Ԫ�ؿ�ʼ, ���Ƶ�����d�У���d���±�Ϊ3��λ�ÿ�ʼ, ���Ƶ�Ԫ�ظ���Ϊ4����d������Ԫ����0����
		for(int x:d)
			System.out.print(x+" ");
		System.out.println();
		
		System.out.println("------------");
		
		
		Arrays.sort(a);
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		
		
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 9));
		//�Ƚ�����a����Ȼ�����9������a�е�λ�õ��±�
		

	}	
}
