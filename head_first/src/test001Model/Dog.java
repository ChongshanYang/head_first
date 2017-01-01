package test001Model;

public class Dog {
	private String breed;
	
	public Dog(String breed){
		this.breed = breed;
		System.out.println("breed2 is"+ breed);
	}
	
	public String getBreed(){
		return breed;
	}
}
