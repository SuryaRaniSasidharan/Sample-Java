package interfacemultipleinheritence;

public class Main implements AnimalEat,AnimalSound {
	

	public static void main(String[] args) {
		
		Main obj=new Main();
		obj.eat();
		obj.sound();
	

	}

	@Override
	public void sound() {
		System.out.println("Animal is eating");
		
	}

	@Override
	public void eat() {
		
		System.out.println("Animal is barking");
	}

}
