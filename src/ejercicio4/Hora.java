package ejercicio4;

/*
 * 4. Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo. 
Tenga en cuenta el rango de valores aceptados para cada uno de estos. 
a. Hora: 0 ... 23 
b. Minuto: 0 ... 59 
c. Segundo: 0 ... 59 
● Considere el siguiente comportamiento: 
a. Un método que imprima la hora bajo el siguiente formato hh:mm:ss usando 
zero a la izquierda ejemplo 13:04:22 . 
b. Un método que avance en 1 segundo y devuelva la instancia del objeto. 
c. Un método que retroceda en 1 segundo y devuelva la instancia del objeto. 
d. Instanciar el objeto y probar los métodos creados. 

 */

public class Hora {

	private int hora;
	private int minuto;
	private int segundo;

	public void setHora(int hora) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		} else {
			System.out.println("Formato de hora incorrecto");
		}
	}

	public void setMinuto(int minuto) {
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		} else {
			System.out.println("Formato de minuto incorrecto");
		}
	}

	public void setSegundo(int segundo) {
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		} else {
			System.out.println("Formato de segundo incorrecto");
		}
	}

	public int getSegundo() {
		return segundo;
	}
	
	public Hora(int hora, int minuto, int segundo) {
		super();
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}

	public void mostrarHora() {
		System.out.printf("%02d :", hora);
        System.out.printf(" %02d :", minuto);
        System.out.printf(" %02d", segundo);
	}
	
	public Hora avanzarSegundo(Hora hora) {
		hora.setSegundo(getSegundo() + 1);
		return hora;
	}
	
	public Hora retrocederSegundo(Hora hora) {
		hora.setSegundo(getSegundo() - 1);
		return hora;
	}
	

}
