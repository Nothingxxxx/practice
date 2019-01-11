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


//1.类加载；
//2.为静态变量分配内存空间，在方法区的静态区中；
//3.为静态方法分配内存空间；
//4.执行static语句块；
//5.执行main方法；
//6.在堆中为对象分配空间；
//7.显示初始化；
//8.调用构造方法；
//9.引用变量指向对象；
