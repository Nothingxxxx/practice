package practice;

public class Singlon {
	//private
	private static Singlon s = new Singlon();//������̬����
	
	private Singlon(){			//˽�л����캯��
		
	}
	
	public static Singlon getSinglon(){		//����һ�����з������ж��Ƿ��Ѿ�����ʵ�����з��أ�û���½�һ���ٷ���
		return s;
	} 
	
	public static void main(String[] args){
		
	}
}


//����