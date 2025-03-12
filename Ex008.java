import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma distância em metros: ");
        double metros = sc.nextDouble();

        double quilometros = metros / 1000;
        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println("Distância em quilômetros: " + quilometros + " km");
        System.out.println("Distância em centímetros: " + centimetros + " cm");
        System.out.println("Distância em milímetros: " + milimetros + " mm");
    }
}
