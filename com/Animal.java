package inheriance.com;

public class Animal {

	public void eat() {
		System.out.println("i am eat");
	}
}

class Dog extends Animal {

	public void eat() {
		System.out.println("i am eating");
	}

	public static void main(String[] args) {

		Animal a = new Animal();
		a.eat();

		Dog d = new Dog();
		d.eat();
		a.eat();
	}
}
