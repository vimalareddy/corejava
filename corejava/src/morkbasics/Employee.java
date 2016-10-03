package morkbasics;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	String name;
	int id;

	public Employee() {
	}

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compare(Employee arg0, Employee arg1) {
		return arg0.getName().compareTo(arg1.getName());
	}

}
