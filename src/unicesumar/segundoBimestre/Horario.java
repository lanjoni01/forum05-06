package unicesumar.segundoBimestre;

import java.util.ArrayList;

public class Horario {
	private String hora;
	private String data;
	private Transporte transporte;
	private Destino destino;
	private ArrayList<Passageiro> passageiros = new ArrayList<>();

	public Horario(String hora, String data, Transporte transporte) {
		this.hora = hora;
		this.data = data;
		this.transporte = transporte;

	}

	public String getHora() {
		return hora;
	}

	public String getData() {
		return data;
	}

	public Transporte getTransporte() {
		return transporte;
	}

	public Destino getDestino() {
		return destino;
	}

	public void adicionarPassageiro(Passageiro p) {
		if (this.passageiros.contains(p)) {
			return;
		}
		this.passageiros.add(p);
		p.adicionarHorario(this);
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	public ArrayList<Passageiro> getPassageiros() {
		return passageiros;
	}

}
