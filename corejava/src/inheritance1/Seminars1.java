package inheritance1;

import java.util.ArrayList;

class Address1 {

	public String address;
	public String contact;
	public String phonenumber;

	public Address1(String address, String contact, String phonenumber) {
		super();
		this.address = address;
		this.contact = contact;
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + ", contact=" + contact
				+ ", phonenumber=" + phonenumber + "]";
	}

}

public class Seminars1 extends Address1 {
	public String topic;
	public String date;
	public String department;
	public ArrayList<Presenter1> presenter;

	public Seminars1(String address, String contact, String phonenumber,
			String topic, String date, String department,
			ArrayList<Presenter1> presenter) {
		super(address, contact, phonenumber);
		this.topic = topic;
		this.date = date;
		this.department = department;
		this.presenter = presenter;
	}

	public static void main(String[] args) {

		Presenter1 p1 = new Presenter1("Robert", "123456", "rober@aa",
				"Stanford CA");
		Presenter1 p2 = new Presenter1("Ronald Evans", "4567893",
				"jodyj@stanford.edu", "Stanford CA");
		Presenter1 p3 = new Presenter1("RM", "78998765", "rm@edu",
				"Stanford CA");

		ArrayList<Presenter1> aList = new ArrayList<Presenter1>();
		aList.add(p1);
		aList.add(p2);
		aList.add(p3);

		Seminars1 s = new Seminars1(

		"LKSC, Berg Hall LK240 & LK250 : Stanford, CA", " jodyj@stanford.edu",
				"65073698998",
				"Nuclear Receptors and Diabetes: Feast, Famine and Physiology",
				"Aug 31, 2016 (Wed) | 8:00 AM -9:00 AM", " Medicine", aList);

		System.out.println(s.toString());
		System.out.println("==============================");

	}

	@Override
	public String toString() {
		return "Seminars1 [topic=" + topic + ", date=" + date + ", department="
				+ department + ", presenter=" + presenter + ", address="
				+ address + ", contact=" + contact + ", phonenumber="
				+ phonenumber + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}

class Presenter1 extends Address1 {

	public String name;

	public Presenter1(String address, String contact, String phonenumber,
			String name) {
		super(address, contact, phonenumber);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Presenter1 [name=" + name + ", address=" + address
				+ ", contact=" + contact + ", phonenumber=" + phonenumber + "]";
	}

}
