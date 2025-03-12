import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu salario: ");
        double salario = sc.nextFloat();
        double novoSalario = salario + (salario * 0.15);

        System.out.println("Novo salario: " + novoSalario);
    }
}
