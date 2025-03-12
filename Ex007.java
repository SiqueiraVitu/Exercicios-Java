import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        float num = sc.nextFloat();

        float dobro = num * 2;
        float tercaparte = num / 3;


        System.out.println("O dobro de " + num + " é " + dobro);
        System.out.println("A terça parte de " + num + " é " + tercaparte);
    }
}
