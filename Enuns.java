import java.util.Scanner;

public class Enuns {
  public static Scanner LER = new Scanner(System.in);

  enum DiaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO
  }

  public static void main(String[] args) {

    System.out.print("Digite o dia da semana (ex: SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SÁBADO, DOMINGO): ");
    String entrada = LER.nextLine().toUpperCase(); 

    try {
      DiaSemana dia = DiaSemana.valueOf(entrada);

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
        case SABADO:
          System.out.println("Hoje é sábado");
          break;
        case DOMINGO:
          System.out.println("Hoje é domingo");
          break;
      }
    } catch (IllegalArgumentException execao) {
      System.out.println("Dia inválido. Tente novamente usando um dos seguintes: SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SÁBADO, DOMINGO.");
    }
  }
}