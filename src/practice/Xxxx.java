package practice;

public class Xxxx {

}
class Boy{
	private String name;
	private int age;
	private Pet pet;//成员变量可以使引用类型
	
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
//		在Girl类中，书写main方法
//		 * 创建一个Pet对象，并给名字赋值
//		 * 创建一个Girl对象，并给所有成员变量赋值
//		 * 调用introduce方法
		
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