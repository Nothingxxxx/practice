package lesson8;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("a");
		Student s2 = new Student();
		s2.setName("b");
		Student s3 = new Student();
		s3.setName("c");
		
		Student[] sl = new Student[3];
		sl[0] = s1;
		sl[1] = s2;
		sl[2] = s3;
//����sl�д�ŵ�����������s1��s2��s3�����Ƕ����Ƕ�����ڴ��ַ�����ñ�����
		
		s1.setName("d");
		System.out.println(sl[0].getName());
		
		
		
//�������飺
		int a[] = {1,9,9,8,1,2,1,0};
		
		Arrays.binarySearch(a, 4);
		
		
		Arrays.sort(a);
		for(int d : a)
		System.out.print(d);
//��������ԣ�length		
		System.out.println(a.length);
//����1��		
		for(int x = 0;x<a.length;x++){		
			System.out.println(a[x]);
		}
		System.out.println("-------------");
//����2��		
		for(int w : a){
			System.out.println(w);
		}
		System.out.println("-------------");
		
		int[] F = new int[20];
		F[0] = 0;
		F[1] = 1;
		System.out.println(F[0]);
		System.out.println(F[1]);
		for(int n = 2;n<F.length;n++){
			F[n] = F[n-1]+F[n-2];
		//	System.out.println(F[n]);
		}
		
		for(int x : F){
			System.out.println(x);
		}
		
		
		
		
	}

}
