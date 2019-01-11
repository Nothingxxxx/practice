package practice;


public class Girl {
	
	private int age;
	private String name;
	private Pet pet;;
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public Pet getPet(){
		return pet;
	}
	public void setPet(Pet pet){
		this.pet = pet;
	}
	
	
	
	public void introduce(){
		/*System.out.println("my pet calls "+pet.getPetName());
		System.out.println(" and my name is "+name);*/
	}
	
	public static void main(String[] args) {
		Pet p = new Pet();
		Girl g = new Girl();
		g.setAge(21);
		g.setName("xxx");
		p.setPetName("hhh");
		g.introduce();
		
		System.out.print("my pet calls "+p.getPetName());
		System.out.println(" and my name is "+g.name);
		
	}
	
}
