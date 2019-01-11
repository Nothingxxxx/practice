package lesson2;

import java.util.Scanner;

public class Helloword {
	public static void main(String[] args){
		System.out.println("请输入年龄");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		System.out.println("请输入身份证号");
		String id = scan.next();
		System.out.println("你好，你的年龄是"+age+"，你的身份证号是"+id);
	}
	
}	

