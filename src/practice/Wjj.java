package practice;

public class Wjj {
	private static Wjj w = new Wjj();		//设立静态变量
	
	private Wjj(){							//私有化构造函数
		
	}
	
	public static Wjj getw(){				//开放一个共有方法，判断是否已经存在实例，有返回，没有新建一个再返回
		return w;
	}

}
