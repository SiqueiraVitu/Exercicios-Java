import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de um produto: ");
        float produto = sc.nextFloat();
        System.out.printf("O produto com PREÇO PROMOCIONAL: %.2f", (produto-(produto * (0.05))));
    }
}
