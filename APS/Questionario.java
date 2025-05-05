import java.util.Scanner;

public class Questionario {
	Scanner input = new Scanner(System.in);
	Perguntas perguntas = new Perguntas();
	Resultado resultado = new Resultado();

	public void limpaTela() {
		for (int i = 0; i < 50; ++i)
			System.out.println();
	}

	public void exibirResultado() {
		resultado.calcularPontuacao(resultado.getRespostas());
		resultado.exibirTitulo(resultado.getTotalDePontos());
	}

	public void exibirQuestionario() {
		perguntas.perguntaN1();
		resultado.setRespostas(input.nextLine());
		limpaTela();

		perguntas.perguntaN2();
		resultado.setRespostas(input.nextLine());
		limpaTela();

		perguntas.perguntaN3();
		resultado.setRespostas(input.nextLine());
		limpaTela();

		perguntas.perguntaN4();
		resultado.setRespostas(input.nextLine());
		limpaTela();

		perguntas.perguntaN5();
		resultado.setRespostas(input.nextLine());
		limpaTela();
	}

}
