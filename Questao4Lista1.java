package avaliacao;

import java.util.Scanner;

public class Questao4Lista1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		
		System.out.printf("Digite um número: ");
		numero1 = entrada.nextInt();
		System.out.printf("Digite outro número: ");
		numero2 = entrada.nextInt();
		
		if (numero1 > numero2) {
            System.out.println("O primeiro é maior!!");
        } else {
            System.out.println("O segundo é maior!!");
        }
	}
}
