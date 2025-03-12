import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = sc.nextDouble();
        System.out.print("Digite a nota de outro aluno: ");
        double nota2 = sc.nextDouble();

        System.out.println("A media entre " + nota + " e " + nota2 + " é igual "+ (nota+nota2));
    }
}
