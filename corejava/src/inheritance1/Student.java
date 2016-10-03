package inheritance1;

public class Student {
	public String studentName;
	public int id;
	public Address address;

	public Student(String studentName, int id, Address address) {
		super();
		this.studentName = studentName;
		this.id = id;
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static void main(String[] args) {
		Address a = new Address(98125, "seattle", 124);
		Student s = new Student("Pavani", 12345, a);
		System.out.println("Name is: " + s.getStudentName());
		System.out.println("Id: " + s.getId());
		System.out.println("Zipcode: " + s.getAddress().getZipcode());
		System.out.println("City: " + s.getAddress().getCity());
		System.out.println("HouseNumber: " + s.getAddress().getHouseNumber());

	}

}

class Address {
	int zipcode;
	String city;
	int houseNumber;

	public Address(int zipcode, String city, int houseNumber) {
		super();
		this.zipcode = zipcode;
		this.city = city;
		this.houseNumber = houseNumber;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

}
