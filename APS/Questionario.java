import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Questionario {
  private String respostaN1;
  private String respostaN2;
  private String respostaN3;
  private String respostaN4;
  private String respostaN5;
  private int totalPontos = 0;
  private List<String> listaDeRespostas = new ArrayList<>();

  Scanner input = new Scanner(System.in);

  public List<String> getRespostas() {
    return this.listaDeRespostas;
  }

  public int getTotalDePontos() {
    return this.totalPontos;
  }

  public void obterTitulo(int pontuacao) {
    System.out.println("Nível de conhecimento é: \n");

    if (pontuacao < 25) {
      System.out.println("Iniciante: Demonstra pouca compreensão sobre o tema, focando em estereótipos ou conceitos errôneos.");
    } else if (pontuacao < 50) {
      System.out.println("Intermediário: Demonstra alguma compreensão, mas ainda com falhas ou visões parciais sobre o tema.");
    } else if (pontuacao < 75) {
      System.out.println("Avançado: Entendimento correto e crítico dos conceitos, com foco nas causas estruturais e sociais.");
    } else {
      System.out.println("Expert: A resposta reflete uma análise profunda e uma visão abrangente do tema, com conhecimento detalhado das implicações sociais.");
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

  public void exibirQuestionario() {
    perguntaN1();
    respostaN1 = input.nextLine();
    listaDeRespostas.add(respostaN1);
    for (int i = 0; i < 50; ++i)
      System.out.println();

    perguntaN2();
    respostaN2 = input.nextLine();
    listaDeRespostas.add(respostaN2);
    for (int i = 0; i < 50; ++i)
      System.out.println();

    perguntaN3();
    respostaN3 = input.nextLine();
    listaDeRespostas.add(respostaN3);
    for (int i = 0; i < 50; ++i)
      System.out.println();

    perguntaN4();
    respostaN4 = input.nextLine();
    listaDeRespostas.add(respostaN4);
    for (int i = 0; i < 50; ++i)
      System.out.println();

    perguntaN5();
    respostaN5 = input.nextLine();
    listaDeRespostas.add(respostaN5);
    for (int i = 0; i < 50; ++i)
      System.out.println();
  }

  public void perguntaN1() {
    System.out.println("O que caracteriza o machismo estrutural na sociedade?");
    System.out.println("a) A crença de que homens e mulheres são iguais em todos os aspectos da vida.");
    System.out.println("b) A ideia de que as mulheres devem se submeter aos homens em todas as situações.");
    System.out.println(
        "c) A distribuição desigual de poder entre homens e mulheres, perpetuada por normas e instituições sociais.");
    System.out.println("d) A valorização do trabalho feminino no mercado de trabalho.\n\n");
    System.out.println("Resposta: ");
  }

  public void perguntaN2() {
    System.out.println("Qual é a principal causa da disparidade de gênero no mercado de trabalho?");
    System.out.println("a) A falta de interesse das mulheres em carreiras mais desafiadoras.");
    System.out.println("b) A ideia de que as mulheres devem se submeter aos homens em todas as situações.");
    System.out.println("c) A desvalorização do trabalho feminino e a distribuição desigual de oportunidades.");
    System.out.println("d) A maior dedicação das mulheres ao trabalho doméstico.\n\n");
    System.out.println("Resposta: ");
  }

  public void perguntaN3() {
    System.out.println("O que define a violência doméstica?");
    System.out.println("a) Conflitos familiares comuns entre casais.");
    System.out.println("b) Qualquer tipo de violência que acontece dentro de um lar, independentemente do gênero.");
    System.out
        .println("c) A violência física ou psicológica perpetrada por um parceiro íntimo, geralmente contra a mulher.");
    System.out.println("d) A violência ocasional durante uma briga entre pessoas da mesma família.\n\n");
    System.out.println("Resposta: ");
  }

  public void perguntaN4() {
    System.out.println(
        "Qual dos seguintes movimentos sociais tem como principal objetivo a igualdade de direitos entre homens e mulheres?");
    System.out.println("a) Movimento feminista.");
    System.out.println("b) Movimento patriarcal.");
    System.out.println("c) Movimento conservador.");
    System.out.println("d) Movimento de direitos dos trabalhadores.\n\n");
    System.out.println("Resposta: ");
  }

  public void perguntaN5() {
    System.out.println("Como o feminismo contribui para a luta contra o machismo estrutural?");
    System.out.println("a) Propaga a ideia de que mulheres são superiores aos homens.");
    System.out.println("b) Combate práticas discriminatórias e busca por igualdade de direitos e oportunidades.");
    System.out.println("c) Defende que as mulheres devem ser mais respeitadas do que os homens.");
    System.out.println("d) Incentiva a separação entre os gêneros no trabalho e na sociedade.\n\n");
    System.out.println("Resposta: ");
  }
}
