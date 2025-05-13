
import java.util.ArrayList;
import java.util.Scanner;

public class Wrapper_Autoboxing {
    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Double> listaNotas = new ArrayList();
        Double soma = 0d;

        System.out.print("Digite a quantidade de notas que você quer adicionar: ");
        Integer qtdNotas = LER.nextInt();

        for (int i = 0; i < qtdNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            Double nota = LER.nextDouble();
            listaNotas.add(nota);
        }

        for (int i = 0; i < listaNotas.size(); i++) {
            soma += listaNotas.get(i);
        }
        System.out.println("A soma da nota dos alunos é: " + soma);

        Double media = soma / qtdNotas;
        System.out.print("A média do aluno é: " + media);

    }
}
