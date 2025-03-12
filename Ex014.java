import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de Km percorridos: ");
        double km = sc.nextDouble();
        System.out.println("Quantidade de dias: ");
        double dias = sc.nextDouble();


        double precoTotal = (km*0.20) + (dias*90);
        System.out.println("O valor total a ser pago: R$ " + precoTotal);

    }
}
