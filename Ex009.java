import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor que está em sua carteira: ");
        double valor = sc.nextDouble();
        double dorlar = valor / 6.75;

        System.out.printf("Você pode comprar com R$%.2f reais %.2f dolares.", valor, dorlar);

        sc.close();
    }
}
