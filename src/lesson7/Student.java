package lesson7;

public class Student{
	
	private int no;
	private String name;
	
	
	
	public void introduce(){
		System.out.println("xxxx");
	}
	
//�ڷ����У�����this��˭�������������this����˭��
	
	public Student(int no,String name){			//�вι���
		this();
		this.no = no;
		this.name = name;
		System.out.println(this.no);
	}
	
	public Student(){							//�޲ι���
		
	//	System.out.println("constructor2");
	}
	
	public void Test(){
		
	}
	
	public int Test(int x,String w){			
		return 0;
	}									//���غ���
	
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

