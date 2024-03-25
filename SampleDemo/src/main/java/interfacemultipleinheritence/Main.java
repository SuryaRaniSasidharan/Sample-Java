package interfacemultipleinheritence;

public class Main implements AnimalEat,AnimalSound {
	
	@Override
	public void sound() {
		System.out.println("Animal is eating");
		
	}

	@Override
	public void eat() {
		
		System.out.println("Animal is barking");
	}
	public static void main(String[] args) {
		
		Main obj=new Main();
		obj.eat();
		obj.sound();
	

	}

	

}
