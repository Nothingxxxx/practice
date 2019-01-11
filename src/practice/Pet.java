package practice;

public class Pet {
	private String petName;
	
	public String getPetName(){
		return petName;
	}
	
	public void setPetName(String petName){
		this.petName = petName;
	}
	
	public static void main(String[] args) {
		Pet p = new Pet();
		p.setPetName("hhh");
		System.out.println(p.petName);
	}
}
