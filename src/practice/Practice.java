package practice;

//����ֻ��д��Ա�����ͷ�����
//��Ա����ֱ�Ӷ��������У�
//д�ڷ����еı����оֲ�������
//�ڳ��濪���У�Ϊ�˰�ȫ�����еĳ�Ա������Ӧ����private��
//������Ҫ��һ��.java�ļ��д������class��
/*
 * ����дλ�ã��ֲ������ͳ�Ա����
 * ���������ͣ������������ͣ�8�������������ͣ�
 * ��Ա��������ÿ�������ж��У����Ҷ����Լ���ֵ
 * �������ڱ����õ�ʱ��ᱻ�����ڴ�ռ䣨�ڷ����������ֽ�����ʽ���ڣ����ұ����ж�����
 */

public class Practice{
	
	private String name;    //����Ա��������������ʱ(���ñ���)����ʼֵΪnull��null�������ڴ�ռ䣬�����ռ���ɶҲû�У�
	private int height = 180;
	private int age;
	private int study;
	
	
	public void playBasketball(){
		System.out.println("������");
	}
	
	public int getStudy(){
		return study;
	}
	public void setStudy(int xstudy){
		study = xstudy;
	}
	
	public void getGirl(Girl x){
		
	}
	
	public int add(int age){//����
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