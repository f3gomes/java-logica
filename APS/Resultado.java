import java.util.ArrayList;
import java.util.List;

public class Resultado {
	private int totalPontos = 0;
	private List<String> listaDeRespostas = new ArrayList<>();

	public List<String> getRespostas() {
		return this.listaDeRespostas;
	}

	public int getTotalDePontos() {
		return this.totalPontos;
	}

	public void setRespostas(String resposta) {
		if(resposta.matches("^[a-dA-D]$")) {
			listaDeRespostas.add(resposta);
		} else {
			System.out.println("\nResposta inválida - Programa encerrado");
			System.exit(1);
		} 
	}

	public void setListaDeRespostas(List<String> listaDeRespostas) {
		this.listaDeRespostas = listaDeRespostas;
	}

	public void exibirTitulo(int pontuacao) {
		System.out.println("Seu nível de conhecimento é:");

		if (pontuacao <= 25) {
			System.out.println(
					"Iniciante: Demonstra pouca compreensão sobre o tema, focando em estereótipos ou conceitos errôneos.");
		} else if (pontuacao <= 50) {
			System.out.println(
					"Intermediário: Demonstra alguma compreensão, mas ainda com falhas ou visões parciais sobre o tema.");
		} else if (pontuacao <= 75) {
			System.out.println(
					"Avançado: Entendimento correto e crítico dos conceitos, com foco nas causas estruturais e sociais.");
		} else {
			System.out.println(
					"Expert: A resposta reflete uma análise profunda e uma visão abrangente do tema, com conhecimento detalhado das implicações sociais.");
		}

		System.out.println("\n\nFeito por: Felipe Gomes - Unifametro 2025");
	}

	public int calcularPontuacao(List<String> respostas) {
		for (String resposta : respostas) {
			switch (resposta.toLowerCase()) {
				case "a" -> totalPontos += 5;
				case "b" -> totalPontos += 10;
				case "c" -> totalPontos += 15;
				case "d" -> totalPontos += 20;
				default -> System.exit(1);
			}
		}

		return totalPontos;
	}
}
