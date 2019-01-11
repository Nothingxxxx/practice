package lesson7;

public class Student{
	
	private int no;
	private String name;
	
	
	
	public void introduce(){
		System.out.println("xxxx");
	}
	
//在方法中，出现this，谁调用这个方法，this就是谁；
	
	public Student(int no,String name){			//有参构造
		this();
		this.no = no;
		this.name = name;
		System.out.println(this.no);
	}
	
	public Student(){							//无参构造
		
	//	System.out.println("constructor2");
	}
	
	public void Test(){
		
	}
	
	public int Test(int x,String w){			
		return 0;
	}									//重载函数
	
	public int Test(String w,int x){
		return 0;
	}
	
	
	public static void main(String[] args) {
		Student x = new Student(1113,"xxx");
		Student w = new Student(1210,"wjj");
		System.out.println(x.no);
		System.out.println(x.name);
		w.Test();
	}
}

