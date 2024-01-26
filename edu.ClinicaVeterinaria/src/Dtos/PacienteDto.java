package Dtos;

public class PacienteDto {
	
	long idPaciente;
	String nombrePaciente= "aaaaa";
	int edadPaciente= 11111;
	String fchNacimiento= "9999 12 31";
	String sexoBiologicoPaciente= "aaaaa";
	String especiePaciente= "aaaaa";
	long idEsclavo;
	
	
	
	//CONSTRUCTORES

	public PacienteDto() {
		super();
	}
	
	public PacienteDto(long idPaciente, String nombrePaciente, int edadPaciente, String fchNacimiento,
			String sexoBiologicoPaciente, String especiePaciente, long idEsclavo) {
		super();
		this.idPaciente = idPaciente;
		this.nombrePaciente = nombrePaciente;
		this.edadPaciente = edadPaciente;
		this.fchNacimiento = fchNacimiento;
		this.sexoBiologicoPaciente = sexoBiologicoPaciente;
		this.especiePaciente = especiePaciente;
		this.idEsclavo = idEsclavo;
	}
	
	
	
	//GETTERS & SETTERS
	
	public long getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	public int getEdadPaciente() {
		return edadPaciente;
	}
	public void setEdadPaciente(int edadPaciente) {
		this.edadPaciente = edadPaciente;
	}
	public String getFchNacimiento() {
		return fchNacimiento;
	}
	public void setFchNacimiento(String fchNacimiento) {
		this.fchNacimiento = fchNacimiento;
	}
	public String getSexoBiologicoPaciente() {
		return sexoBiologicoPaciente;
	}
	public void setSexoBiologicoPaciente(String sexoBiologicoPaciente) {
		this.sexoBiologicoPaciente = sexoBiologicoPaciente;
	}
	public String getEspeciePaciente() {
		return especiePaciente;
	}
	public void setEspeciePaciente(String especiePaciente) {
		this.especiePaciente = especiePaciente;
	}
	public long getIdEsclavo() {
		return idEsclavo;
	}
	public void setIdEsclavo(long idEsclavo) {
		this.idEsclavo = idEsclavo;
	}

	
	//TOSTRING
	@Override
	public String toString() {
		return "PacienteDto [idPaciente=" + idPaciente + ", nombrePaciente=" + nombrePaciente + ", edadPaciente="
				+ edadPaciente + ", fchNacimiento=" + fchNacimiento + ", sexoBiologicoPaciente=" + sexoBiologicoPaciente
				+ ", especiePaciente=" + especiePaciente + ", idEsclavo=" + idEsclavo + "]";
	}
	
	
	
	
	
}
