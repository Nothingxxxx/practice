package practice;

public class Person {
	
	private static int no;
	
	static{
		System.out.println("hahaha");//1
		no = 2;
		test();
	}
	public Person(){
		System.out.println("Xxxxx");//3
	}
	public static void test(){
		System.out.println("haah");//2
	}
	public static void main(String[] args) {
		Person x = new Person();
	}
}


//1.����أ�
//2.Ϊ��̬���������ڴ�ռ䣬�ڷ������ľ�̬���У�
//3.Ϊ��̬���������ڴ�ռ䣻
//4.ִ��static���飻
//5.ִ��main������
//6.�ڶ���Ϊ�������ռ䣻
//7.��ʾ��ʼ����
//8.���ù��췽����
//9.���ñ���ָ�����
