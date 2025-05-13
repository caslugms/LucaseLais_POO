
public class Enuns {

  enum DiaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA
  }

  public static void main(String[] args) {

    DiaSemana dia = DiaSemana.SEGUNDA;

    switch (dia) {
      case SEGUNDA:
        System.out.println("Hoje é segunda-feira");
        break;
      case TERCA:
        System.out.println("Hoje é terça-feira");
        break;
      case QUARTA:
        System.out.println("Hoje é quarta-feira");
        break;
      case QUINTA:
        System.out.println("Hoje é quinta-feira");
        break;
      case SEXTA:
        System.out.println("Hoje é sexta-feira");
        break;
    }

  }
}
