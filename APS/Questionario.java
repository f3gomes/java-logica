public class Questionario {
  public String respostaN1;
  public String respostaN2;
  public String respostaN3;
  public String respostaN4;
  public String respostaN5;

  public void exibirQuestionario() {
    perguntaN1();
    perguntaN2();
    perguntaN3();
    perguntaN4();
    perguntaN5();
  }

  public void perguntaN1() {
    System.out.println("O que caracteriza o machismo estrutural na sociedade?");
    System.out.println("a) A crença de que homens e mulheres são iguais em todos os aspectos da vida.");
    System.out.println("b) A ideia de que as mulheres devem se submeter aos homens em todas as situações.");
    System.out.println("c) A distribuição desigual de poder entre homens e mulheres, perpetuada por normas e instituições sociais.");
    System.out.println("d) A valorização do trabalho feminino no mercado de trabalho.");
  }

  public void perguntaN2() {
    System.out.println("Qual é a principal causa da disparidade de gênero no mercado de trabalho?");
    System.out.println("a) A falta de interesse das mulheres em carreiras mais desafiadoras.");
    System.out.println("b) A ideia de que as mulheres devem se submeter aos homens em todas as situações.");
    System.out.println("c) A desvalorização do trabalho feminino e a distribuição desigual de oportunidades.");
    System.out.println("d) A maior dedicação das mulheres ao trabalho doméstico.");
  }

  public void perguntaN3() {
    System.out.println("O que define a violência doméstica?");
    System.out.println("a) Conflitos familiares comuns entre casais.");
    System.out.println("b) Qualquer tipo de violência que acontece dentro de um lar, independentemente do gênero.");
    System.out.println("c) A violência física ou psicológica perpetrada por um parceiro íntimo, geralmente contra a mulher.");
    System.out.println("d) A violência ocasional durante uma briga entre pessoas da mesma família.");
  }

  public void perguntaN4() {
    System.out.println("Qual dos seguintes movimentos sociais tem como principal objetivo a igualdade de direitos entre homens e mulheres?");
    System.out.println("a) Movimento feminista.");
    System.out.println("b) Movimento patriarcal.");
    System.out.println("c) Movimento conservador.");
    System.out.println("d) Movimento de direitos dos trabalhadores.");
  }

  public void perguntaN5() {
    System.out.println("Como o feminismo contribui para a luta contra o machismo estrutural?");
    System.out.println("a) Propaga a ideia de que mulheres são superiores aos homens.");
    System.out.println("b) Combate práticas discriminatórias e busca por igualdade de direitos e oportunidades.");
    System.out.println("c) Defende que as mulheres devem ser mais respeitadas do que os homens.");
    System.out.println("d) Incentiva a separação entre os gêneros no trabalho e na sociedade.");
  }
}
