package practice;

public class Xxxx {

}
class Boy{
	private String name;
	private int age;
	private Pet pet;//��Ա��������ʹ��������
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Pet getPet() {
		return pet;
	}
	
	//	g.setPet(p);
	public void setPet(Pet pet) {//pet = p
		this.pet = pet;
	}
	
	public void introduce(){
		System.out.println("my pet call "+pet.getPetName());
		System.out.println("my name is "+name);
	}
	
	
	public static void main(String[] args) {
//		��Girl���У���дmain����
//		 * ����һ��Pet���󣬲������ָ�ֵ
//		 * ����һ��Girl���󣬲������г�Ա������ֵ
//		 * ����introduce����
		
		Pet p = new Pet();
		p.setPetName("tom");
		
		Boy g = new Boy();
		g.setName("lucy");
		g.setAge(19);
		g.setPet(p);//pet = p
		
		g.introduce();
		
	}
}

/*class Pet{
	private String petName;

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	
}*/