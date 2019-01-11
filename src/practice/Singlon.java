package practice;

public class Singlon {
	//private
	private static Singlon s = new Singlon();//设立静态变量
	
	private Singlon(){			//私有化构造函数
		
	}
	
	public static Singlon getSinglon(){		//开放一个共有方法，判断是否已经存在实例，有返回，没有新建一个再返回
		return s;
	} 
	
	public static void main(String[] args){
		
	}
}


//单例