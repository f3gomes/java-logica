import java.util.Scanner;

public class TelaInicial {
  private String mensagem;
  Scanner continuar = new Scanner(System.in);
  
  public void exibirMensagemInicial() {
    for (int i = 0; i < 50; ++i) System.out.println();
    System.out.println(this.mensagem + "\n\n");
    System.out.println("Pressione enter para continuar...");

    continuar.nextLine();
    for (int i = 0; i < 50; ++i) System.out.println();
  }

  public void atulizaMensagemInicial() {
    this.mensagem = "Seja bem-vindo ao nosso programa interativo!\n\n Este espaço foi criado para estimular a reflexão e o aprendizado sobre temas fundamentais relacionados à igualdade de gênero e à luta das mulheres na sociedade. Aqui, você terá a oportunidade de aplicar seus conhecimentos de lógica de programação para desenvolver soluções que conscientizem sobre questões urgentes, como o machismo estrutural, a violência doméstica, a luta pelos direitos das mulheres e as disparidades de gênero no mercado de trabalho.\n\n Ao responder ao questionário, lembre-se de que o objetivo é aprofundar seu entendimento e engajamento com esses temas, enquanto também exercita suas habilidades de programação. Sua contribuição é fundamental para ampliar a conscientização e promover a mudança social.\n\n Vamos juntos nessa jornada de aprendizado e transformação!";
  }
}
