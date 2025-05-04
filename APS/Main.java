public class Main {
  public static void main(String[] args) {
    TelaInicial home = new TelaInicial();
    Questionario questionario = new Questionario();

    home.atulizaMensagemInicial();
    home.exibirMensagemInicial();

    questionario.exibirQuestionario();

    questionario.calcularPontuacao(questionario.getRespostas());
    questionario.obterTitulo(questionario.getTotalDePontos());

  }
}
