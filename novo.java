import java.util.InputMismatchException;
import java.util.Scanner;

public class novo{
    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Digite o numerador: ");
            double numerador = LER.nextDouble();

            System.out.print("Digite o denominador: ");
            double denominador = LER.nextDouble();

            if (denominador == 0) {
                throw new ArithmeticException("ERRO: Divisão por zero não pode.");
            }

            double divisao = numerador / denominador;
            System.out.println("Resultado da divisão: " + divisao);

        } catch (ArithmeticException execao) {
            System.out.println("Exceção: " + execao.getMessage());
        } catch (InputMismatchException execao) {
            System.out.println("ERRO: Você deve digitar um número válido.");
        } catch (Exception execao) {
            System.out.println("ERRO INESPERADO: " + execao.getMessage());
        } finally {
            System.out.println("Programa finalizado.");
        }
    }
} 
