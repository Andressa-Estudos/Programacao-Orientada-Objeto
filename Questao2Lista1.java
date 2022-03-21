package avaliacao;

import java.util.Scanner;

public class Questao2Lista1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float peso = 0;
		float altura = 0;
		float IMC = 0;
		System.out.printf("Digite seu peso: ");
		peso = entrada.nextFloat();
		System.out.printf("Digite sua altura: ");
		altura = entrada.nextFloat();
		IMC = peso / (altura*altura);
		System.out.printf("O seu IMC é: "+ IMC);
	}
}
