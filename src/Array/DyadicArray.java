package Array;

public class DyadicArray {
	public static void main(String[] args) {
		
		int a[][] = new int[][]{{1,9,9,8},{1,1},{1,3}};
		for(int i = 0;i<a.length;i++){
			for(int j = 0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.println();
	}

}
