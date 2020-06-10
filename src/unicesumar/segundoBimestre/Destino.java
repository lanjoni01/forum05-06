package unicesumar.segundoBimestre;

public class Destino {
	private String regiao;
	private String kilometros;
	private Horario horario;
	
	public Destino (String regiao, String kilometros, Horario horario) {
		this.regiao = regiao;
		this.kilometros = kilometros;
		this.horario = horario;
		this.horario.setDestino(this);
	}

	public String getRegiao() {
		return regiao;
	}

	public String getKilometros() {
		return kilometros;
	}
	public Horario getHorario() {
		return horario;
	}

}
