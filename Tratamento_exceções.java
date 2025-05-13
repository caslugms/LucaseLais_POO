import java.util.Scanner;

public class Tratamento_exceções {
    public static Scanner LER =new Scanner(System.in);
    
    public static void main(String[] args) {

        Integer numerador = 0;
        Integer denominador = 0;

        numerador = LER.nextInt();
        denominador = LER.nextInt();

        try {
            double divisao = numerador/denominador;
            System.out.println("A divisão é: " + divisao);
        } catch (ArithmeticException execao) {
            System.out.println("Impossível dividir por 0");
        }finally{

        }
        
    }
}
