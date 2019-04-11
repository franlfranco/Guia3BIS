package ejercicio4;

public class Main {

	public static void main(String[] args) {

		Hora hora = new Hora(10,5,3);
		hora.mostrarHora();
		
		hora.avanzarSegundo(hora);
		System.out.println();
		hora.mostrarHora();
		
		hora.retrocederSegundo(hora);
		System.out.println();
		hora.mostrarHora();
		
	}

}
