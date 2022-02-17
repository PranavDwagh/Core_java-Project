package serializationDeserialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private int salary;
	private String name;
	
	public Employee(int salary, String name) {
		
		this.salary = salary;
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + "]";
	}
	
}