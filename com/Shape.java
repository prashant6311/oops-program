package polymorphism.com;

public class Shape {

	public void draw() {
		System.out.println("1drawing--");
	}
}

// method overriding
class Tringle extends Shape {

	public void draw() {
		System.out.println("2drawing--");
	}

	public static void main(String[] args) {

		Shape s = new Shape();
		s.draw();
		System.out.println("-------------");
		Tringle t = new Tringle();
		t.draw();
	}
}