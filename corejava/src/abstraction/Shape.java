package abstraction;

public abstract class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Rectangle();
		s.draw();
		Shape s1 = new Circle();
		s1.draw();
	}

	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}