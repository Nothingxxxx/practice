package practice;

//类里只能写成员变量和方法；
//成员变量直接定义在类中；
//写在方法中的变量叫局部变量；
//在常规开发中，为了安全，所有的成员变量都应该是private；
//尽量不要在一个.java文件中创建多个class；
/*
 * 按书写位置：局部变量和成员变量
 * 按数据类型：基本数据类型（8）个和引用类型；
 * 成员变量，在每个对象中都有，而且都有自己的值
 * 方法：在被调用的时候会被分配内存空间（在方法区，以字节码形式存在）并且被所有对象共享；
 */

public class Practice{
	
	private String name;    //当成员变量是引用类型时(引用变量)，初始值为null；null分配了内存空间，不过空间中啥也没有；
	private int height = 180;
	private int age;
	private int study;
	
	
	public void playBasketball(){
		System.out.println("打篮球");
	}
	
	public int getStudy(){
		return study;
	}
	public void setStudy(int xstudy){
		study = xstudy;
	}
	
	public void getGirl(Girl x){
		
	}
	
	public int add(int age){//参数
		//int c = a+b;
		//return c;
		System.out.println(age);
		int a = 1;
		if(a == 1){
			int b = 4;
			System.out.println("hahaha");
		}
		return 0;
	}
	
	public String playGame(){
		return "Happy";
	}
	
	public static void main(String[] args){
		Practice b = new Practice();
		System.out.println(b);
		b.setStudy(998);
		
		System.out.println(b.getStudy());
		
		String s = null;
		
		b.add(23);
		System.out.println(b.age);
		
		Girl g = new Girl();
		Girl g1 = new Girl();
		g.setName("lucy");
		g1.setName("xxx");
		System.out.println(g.getName());
		System.out.println(g1.getName());
		
		
		
		
	/*	int  a = 0,b = 1;
		int i = 1;
		while(i<=10){
			a += b;
			b += a;
			i++;
			System.out.println(a);
			System.out.println(b);
		}*/
		
	/*	int j = 0, i = 0;
		for(;j < 5;j++){
			System.out.println("j="+j);
			for(;i<10;i++){
				System.out.println("i="+i);
				if(i == 6)
					break;
			}
			
		}
		System.out.println("i="+i+"over");*/
/*		int i = 1;
		for(i = 1;i<=10;i++){
			
			if(i == 4){
				continue;
			}
			System.out.println(i);
		}*/
		
	}	
}