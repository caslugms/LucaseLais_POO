import java.util.Scanner;

public class Tratamento_exceções {
    public static Scanner LER =new Scanner(System.in);
    
    public static void main(String[] args) {

        Integer numerador;
        Integer denominador;
        double divisao;

        System.out.print("Digite o numerador: ");
        numerador = LER.nextInt();
        System.out.print("Digite o denominador: ");
        denominador = LER.nextInt();

        try {
            divisao = numerador/denominador;
            System.out.println("A divisão é: " + divisao);
        } catch (ArithmeticException execao) {
            System.out.println("Impossível dividir por 0");
        }finally{
            System.out.println("Digite um denominador diferente de 0.");
            denominador = LER.nextInt();
            divisao = numerador/denominador;
            System.out.println("Novo resultado: " + divisao);
        }
        
    }
}
