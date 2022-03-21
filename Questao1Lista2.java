package avaliacao;

import java.util.Scanner;

public class Questao1Lista2 {
	public static void main(String[] args) {
		
		float nota = 0;
		float media = 0;
		float soma = 0;
		int cont = 0;
		
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i <= 5;i++) {
		    soma =  soma + nota;
		    cont++;
		    System.out.println("Digite sua nota: ");
		    nota = entrada.nextFloat();
		}
		media = soma/(cont-1);
		System.out.println("\nA média das suas notas digitados é : "+ media );
	}
}
