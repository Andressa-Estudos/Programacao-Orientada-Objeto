package avaliacao;

import java.util.Scanner;

public class Questao3Lista1 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	float BaseMaior = 0;
	float BaseMenor = 0;
	float altura = 0;
	float area = 0;
	System.out.printf("Digite a maior base: ");
	BaseMenor = entrada.nextFloat();
	System.out.printf("Digite a menor base: ");
	BaseMaior = entrada.nextFloat();
	System.out.printf("Digite a altura: ");
	altura = entrada.nextFloat();
	area = ((BaseMaior + BaseMenor)* altura) /2;
	System.out.printf("A área do trapézio em cm² é "+ area);
	}
}
