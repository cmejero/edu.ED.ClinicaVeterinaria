package Controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.PacienteDto;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperacionImplementacion;
import Servicios.OperacionInterfaz;

public class Inicio {

	public static void main(String[] args) {

		MenuInterfaz mi = new MenuImplementacion();
		OperacionInterfaz oi = new OperacionImplementacion();

		PacienteDto paciente1 = new PacienteDto();

		System.out.println(paciente1.toString());
		paciente1.setNombrePaciente("Regino");
		System.out.println(paciente1.getNombrePaciente());

		List<PacienteDto> listaPaciente = new ArrayList<PacienteDto>();
		ArrayList<PacienteDto> arrayListPaciente = new ArrayList<PacienteDto>();
		PacienteDto[] arrayPaciente = new PacienteDto[100];

		Scanner sc = new Scanner(System.in);

		int opcionSeleccionada;
		boolean cerrarMenu = false;

		while (!cerrarMenu) {
			opcionSeleccionada = mi.menuYSeleccion(sc);

			switch (opcionSeleccionada) {

			case 0:
				System.out.println("Has seleccionado cerrar aplicación");
				cerrarMenu = true;
				break;

			case 1:
				System.out.println("Has seleccionado añadir cliente");
				
				
				break;

			default:
				System.out.println("La opción seleccionada no corresponde con ninguna");
				break;

			}

		}

	}

}
