package lesson4;

public class HAHA {
	 public static void main(String arg[]){
		 int j = 0,i = 0;
		 outer :for (; j < 5; j++){
			 System.out.println();
			 System.out.println("j=" + j);
			 for (; i < 10; i++){
			 System.out.println("i=" + i);
			 if (i == 6)
			 	break outer;
		 }
		 }
		 System.out.println("i=" + i + "over!");
		  }

}
//�ڴ����������ɫ�ĵط�˫�����ֶϵ㣬�ڳ������Ҽ�-debug as