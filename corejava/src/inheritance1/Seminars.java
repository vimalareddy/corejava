package inheritance1;

import java.util.ArrayList;

public class Seminars {
	public String topic;
	public String date;
	public String address;
	public String department;
	public String contact;
	public String phonenumber;
	public ArrayList<Presenter> presenter;

	public Seminars(String topic, String date, String address,
			String department, String contact, String phonenumber,
			ArrayList<Presenter> presenter) {
		super();
		this.topic = topic;
		this.date = date;
		this.address = address;
		this.department = department;
		this.contact = contact;
		this.phonenumber = phonenumber;
		this.presenter = presenter;
	}

	public static void main(String[] args) {

		Presenter p1 = new Presenter("Robert", "123456", "rober@aa",
				"Stanford CA");
		Presenter p2 = new Presenter("Ronald Evans", "4567893",
				"jodyj@stanford.edu", "Stanford CA");
		Presenter p3 = new Presenter("RM", "78998765", "rm@edu", "Stanford CA");

		ArrayList<Presenter> aList = new ArrayList<Presenter>();
		aList.add(p1);
		aList.add(p2);
		aList.add(p3);

		Seminars s = new Seminars(
				"Nuclear Receptors and Diabetes: Feast, Famine and Physiology",
				"Aug 31, 2016 (Wed) | 8:00 AM -9:00 AM",
				"LKSC, Berg Hall LK240 & LK250 : Stanford, CA", " Medicine",
				" jodyj@stanford.edu", "65073698998", aList);

		System.out.println("topic is: " + s.topic);
		System.out.println("dateis: " + s.date);
		System.out.println("address is: " + s.address);
		System.out.println("contact is: " + s.contact);
		System.out.println("phone number is" + s.phonenumber);
		System.out.println("presenters are: ");

		for (int i = 0; i < s.presenter.size(); i++) {
			Presenter p = s.presenter.get(i);
			System.out.println(p.toString());
		}

	}
}

class Presenter {

	public String name;
	public String phonenumber;
	public String contact;
	public String addrss;

	public Presenter(String name, String phonenumber, String contact,
			String addrss) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		this.contact = contact;
		this.addrss = addrss;
	}

	@Override
	public String toString() {
		return "Presenter [name=" + name + ", phonenumber=" + phonenumber
				+ ", contact=" + contact + ", addrss=" + addrss + "]";
	}

}
