package Servicios;

import java.util.List;
import java.util.Scanner;

import Dtos.EsclavoDto;
import Dtos.PacienteDto;

public interface OperacionInterfaz {
	
	public void agregarNuevoCliente(List<PacienteDto> listaAntigua, Scanner comunicacionTeclado,
			List<EsclavoDto> listaEsclavo);
}
