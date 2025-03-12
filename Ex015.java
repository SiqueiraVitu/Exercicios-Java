import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite os dias trabalhados em um mês: ");
        int diasTrabalhadas = sc.nextInt();

        int horasTrabalhadas = 8;

        System.out.println("Salario: " + (25*horasTrabalhadas)*diasTrabalhadas);
    }
}
