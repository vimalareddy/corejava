package morkbasics;

import java.util.Arrays;

public class EmployeeObjects {

	public static void main(String[] args) {
		Employee e = new Employee("raghu ", 1);
		Employee e1 = new Employee("vimala", 3);
		Employee e2 = new Employee("swapna", 2);

		Employee[] employeeArray = new Employee[3];
		employeeArray[0] = e;
		employeeArray[1] = e1;
		employeeArray[2] = e2;

		Arrays.sort(employeeArray, new Employee());

		for (Employee a : employeeArray)
			// printing the sorted list of ages
			System.out.println(a.getName() + "  : " + a.getId());

	}

}
