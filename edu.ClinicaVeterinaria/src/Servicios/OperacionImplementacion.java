package Servicios;

import java.util.List;
import java.util.Scanner;

import Dtos.EsclavoDto;
import Dtos.PacienteDto;

public class OperacionImplementacion implements OperacionInterfaz {

	public void agregarNuevoCliente(List<PacienteDto> listaAntigua, Scanner comunicacionTeclado,
			List<EsclavoDto> listaEsclavo) {

		listaAntigua.add(crearNuevoCliente(comunicacionTeclado, listaEsclavo));

	}

	private PacienteDto crearNuevoCliente(List<PacienteDto> listaAntigua, Scanner comunicacionTeclado,
			List<EsclavoDto> listaEsclavo) {

		System.out.println("Introduzca un id del paciente");
		long idPaciente = comunicacionTeclado.nextLong();

		System.out.println("Introduzca el nombre del paciente");
		String nombrePaciente = comunicacionTeclado.next();

		System.out.println("Introduzca la edad del paciente");
		int edadPaciente = comunicacionTeclado.nextInt();

		System.out.println("Introduzca fecha de nacimiento del paciente");
		String fechaNacPaciente = comunicacionTeclado.next();

		System.out.println("Introduzca el género del paciente");
		String generoPaciente = comunicacionTeclado.next();

		System.out.println("Introduzca especie del paciente");
		String especiePaciente = comunicacionTeclado.next();

		System.out.println("Introduzca el id del esclavo");
		long esclavoPaciente = comunicacionTeclado.nextLong();

		for (int i = 0; i < listaEsclavo.size(); i++) {

			if (listaEsclavo.get(i).getIdEsclavo() == esclavoPaciente) {

				System.out.println("El esclavo existe");
			}

			else {
				System.out.println("############################################");
				System.out.println("El esclavo no existe, crear un nuevo usuario");
				System.out.println("############################################");

				

					 esclavoPaciente = crearNuevoEsclavo(comunicacionTeclado);

					return new PacienteDto(idPaciente, nombrePaciente, edadPaciente, fechaNacPaciente, generoPaciente,
							especiePaciente, esclavoPaciente);

				}
			}
		}

	

	private EsclavoDto crearNuevoEsclavo(Scanner comunicacionTeclado) {

		System.out.println("Introduce id del esclavo");
		long idEsclavo = comunicacionTeclado.nextLong();

		System.out.println("Introduzca nombre del esclavo");
		String nombreEsclavo = comunicacionTeclado.next();

		System.out.println("Introduzca apellidos del esclavo");
		String apellidosEsclavo = comunicacionTeclado.next();

		System.out.println("Introduzca DNI del paciente");
		String dniEsclavo = comunicacionTeclado.next();

		System.out.println("Introduzca el Telefono del esclavo");
		String telefonoEsclavo = comunicacionTeclado.next();

		return new EsclavoDto(nombreEsclavo, apellidosEsclavo, dniEsclavo, telefonoEsclavo, idEsclavo);

	}
}
