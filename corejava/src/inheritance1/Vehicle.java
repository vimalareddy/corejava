package inheritance1;

public class Vehicle {
	public String CompanyName;
	public String Model;
	public String colour;
	public boolean Automatic;
	public int speed;
	public String make;

	public Vehicle() {

	}

	public Vehicle(String companyName, String model, String colour,
			boolean automatic, int speed, String make) {
		super();
		CompanyName = companyName;
		Model = model;
		this.colour = colour;
		Automatic = automatic;
		this.speed = speed;
		this.make = make;
	}

	public String getCompanyName() {

		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;

	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getColor() {
		return colour;
	}

	public void setColor(String color) {
		colour = colour;
	}

	public boolean isAutomatic() {
		System.out.println("True");
		return Automatic;
	}

	public void setAutomatic(boolean automatic) {
		Automatic = automatic;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public class Car extends Vehicle {
		public String size;
		public int number;

		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("honda", "accord", "black", true, 200, "2016");

		System.out.println("company: " + v.CompanyName);
		System.out.println("model: " + v.Model);

		System.out.println("speed: " + v.speed);
		System.out.println("color:  " + v.colour);
		System.out.println("automatic: " + v.Automatic);

	}
}
