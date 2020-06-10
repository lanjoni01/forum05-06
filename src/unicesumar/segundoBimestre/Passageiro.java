package unicesumar.segundoBimestre;

import java.util.ArrayList;

public class Passageiro {
	private String nome;
	private int idade;
	private String cpf;
	private ArrayList<Horario> horarios = new ArrayList<>();

	public Passageiro(String nome, int idade, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void adicionarHorario(Horario h) {
		if(this.horarios.contains(h)) {
			return;
		}
		this.horarios.add(h);
		h.adicionarPassageiro(this);
	}
	
	public ArrayList<Horario> getHorarios() {
		return horarios;
	}

}
