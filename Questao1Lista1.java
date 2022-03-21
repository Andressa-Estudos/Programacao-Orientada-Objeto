package avaliacao;

import java.util.Scanner;

public class Questao1Lista1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int inteiro = 0;
		float flutuante = 0;
		long longo = 0;
		System.out.printf("Digite um número inteiro: ");
		inteiro = entrada.nextInt();
		System.out.printf("Digite um número float: ");
		flutuante = entrada.nextFloat();
		System.out.printf("Digite um número longo: ");
		longo = entrada.nextLong();
		System.out.printf("O número inteiro digitado foi "+inteiro+"\n"+"O número float digitado foi "+flutuante+"\n"+"O número long digitado foi "+longo+"\n");
		
	}
}
