package ejercicio2;

public class Employee {
	
	private int dni;
	private String name;
	private String surname;
	private double salary;
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int dni, String name, String surname, double salary) {
		super();
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}

	public float annualSalary() {
		return (float) (salary * 12);
	} 
	
	public void increaseSalary(float percentage) {
		this.salary *= 1 + percentage; 
	}
	
	public String getDescription() {
		return "Employee [dni=" + dni + ", name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
	}

}
