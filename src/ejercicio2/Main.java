package ejercicio2;

public class Main {

	public static void main(String[] args) {

		Employee carlos = new Employee(23456345, "Carlos", "Gutierrez", 25000);
		Employee ana = new Employee(34234123, "Ana", "Sanchez", 27500);
		
		System.out.println(carlos.getDescription());
		System.out.println(ana.getDescription());
		
		carlos.increaseSalary((float) 0.15);
		System.out.println(carlos.annualSalary());
	}

}
