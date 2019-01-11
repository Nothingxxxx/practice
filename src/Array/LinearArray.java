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
		//to - the final index of the range to be copied, exclusive(不包括)
		//从原数组下标2开始复制到下标7，不包括7
		for(int x:c)
			System.out.print(x+" ");
		System.out.println();
		
		System.out.println("***************");
		
		
		Arrays.fill(a,6);		//数组填充：将数组a全部填充为6
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		Arrays.fill(a,1,5,9);	//数组填充：将数组a下标1到下标5填充为9
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		
		System.out.println("-+-++-+-+--+-+-+-+-+");
		
		
		int d[] = new int[8];
		System.arraycopy(a,2,d,3,4);
		//将a数组里下标为2的元素开始, 复制到数组d中，从d中下标为3的位置开始, 复制的元素个数为4个，d中其他元素用0补齐
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
		//先将数组a排序，然后输出9在数组a中的位置的下标
		

	}	
}
