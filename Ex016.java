import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //[DESAFIO] Escreva um programa em Java para calcular a redução do tempo de vida de
        //um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já
        //fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos
        //dias de vida um fumante perderá e exiba o total em dias.

        System.out.print("Digite a quantidade de cigarros fumados: ");
        int quantCigarrosFumados = sc.nextInt();
        System.out.print("Quantos anos você já fumou? ");
        int quantAnos = sc.nextInt();

        int soma = quantCigarrosFumados* 10;

    }
}
