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
		listaDeRespostas.add(resposta);
	}

	public void obterTitulo(int pontuacao) {
		System.out.println("Nível de conhecimento é: \n");

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
	}

	public int calcularPontuacao(List<String> respostas) {
		for (String resposta : respostas) {
			switch (resposta.toLowerCase()) {
				case "a":
					totalPontos += 5;
					break;
				case "b":
					totalPontos += 10;
					break;
				case "c":
					totalPontos += 15;
					break;
				case "d":
					totalPontos += 20;
					break;
				default:
					System.out.println("Resposta inválida: " + resposta);
					break;
			}
		}

		return totalPontos;
	}
}
