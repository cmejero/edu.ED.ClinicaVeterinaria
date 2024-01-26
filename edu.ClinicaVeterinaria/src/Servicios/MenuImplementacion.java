package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	public int menuYSeleccion( Scanner comunicacionTeclado) {
		int opcionSeleccionada;
		
		System.out.println("###################");
		System.out.println("0. Cerrar Aplicación");
		System.out.println("1. Añadir Paciente");
		System.out.println("###################");
		
		opcionSeleccionada= comunicacionTeclado.nextInt();
		return opcionSeleccionada;
	}
}
