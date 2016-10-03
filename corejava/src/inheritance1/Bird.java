package inheritance1;

public class Bird {
	public String birdName;
	public String colour;
	public boolean fly;

	public class Parrot extends Bird {
		public String parrot;
		public String eat;

		public String eat(String text) {
			String eat = text;
			return eat;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b = new Bird();
		Parrot p = b.new Parrot();
		p.birdName = "Parrot";
		p.eat = "Gauva";
		p.colour = "Green";
		System.out.println("name " + p.birdName);
		System.out.println("eat " + p.eat);
		System.out.println("colour " + p.colour);
	}
}
