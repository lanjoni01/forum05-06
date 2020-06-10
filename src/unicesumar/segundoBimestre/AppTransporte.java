package unicesumar.segundoBimestre;

public class AppTransporte {

	public static void main(String[] args) {

		Transporte onibus = new Transporte("Onibus", "MARCOPOLO");

		Horario saida = new Horario("09:00 horas", "25/10/2000", onibus);

		Destino saoPaulo = new Destino("S�o Paulo", "1200 km", saida);

		Passageiro joao = new Passageiro("Jo�o", 36, "99999999-6");
		Passageiro maria = new Passageiro("Maria", 49, "99998963-6");
		Passageiro emanuel = new Passageiro("Emanuel", 25, "89632574-6");

		saida.adicionarPassageiro(joao);
		saida.adicionarPassageiro(maria);
		saida.adicionarPassageiro(emanuel);

		System.out.println("Horario: " + saida.getData() + "     " + "Data: " + saida.getData());
		System.out.println(" ");
		System.out.println("-TRANSPORTE");
		System.out.println("--------------------");
		System.out.println("Tipo: " + saida.getTransporte().getTipo());
		System.out.println("Modelo: " + saida.getTransporte().getModelo());
		System.out.println(" ");
		System.out.println("-DESTINO");
		System.out.println("-------------------");
		System.out.println("Destino: " + saida.getDestino().getRegiao());
		System.out.println("Dist�ncia: " + saida.getDestino().getKilometros());
		System.out.println(" ");
		System.out.println("-PASSAGEIROS");
		System.out.println("--------------------");
		
		listarPassageiros(saida);
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("Horario da Passagem do Jo�o: "+joao.getHorarios().get(0).getData()+"   "+joao.getHorarios().get(0).getHora());
		System.out.println("Destino do Jo�o: "+joao.getHorarios().get(0).getDestino().getRegiao());
	}
	
	public static void listarPassageiros(Horario h ) {
		System.out.println("Quantidade de Passageiros: "+h.getPassageiros().size());
		System.out.println("  ");
		
		for(Passageiro p : h.getPassageiros()) {
			System.out.println("Nome: "+p.getNome());
			System.out.println("Idade: "+p.getIdade());
			System.out.println("CPF: "+p.getCpf());
			System.out.println("--------------------");
		}
	}

}
