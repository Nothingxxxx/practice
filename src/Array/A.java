package Array;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		int a[] = new int[20];
		int b[] = new int[20];
		int c[] = new int[20];
		int d[] = new int[20];
		int e[] = new int[20];
		
		int w[] = new int[100];
		System.arraycopy(a, 0, w, 0, 20);
		System.arraycopy(b, 0, w, 20, 20);
		System.arraycopy(c, 0, w, 40, 20);
		System.arraycopy(d, 0, w, 60, 20);
		System.arraycopy(e, 0, w, 80, 20);
		
		Arrays.fill(a, 1);
		int a1 = (int) Math.round(Math.random()*19);
		int a2 = (int) Math.round(Math.random()*19);
		int a3 = (int) Math.round(Math.random()*19);
		int a4 = (int) Math.round(Math.random()*19);
		int a5 = (int) Math.round(Math.random()*19);
		System.out.println(a1+" "+ a2+" "+ a3+" "+ a4+" "+ a5);
		a[a1] = 2;
		a[a2] = 3;
		a[a3] = 4;
		a[a4] = 5;
		a[a5] = 6;
		for(int x = 0;x<a.length;x++){
			
				System.out.print(a[x]+" ");
		}
	}
}
