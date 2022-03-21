package avaliacao;

import java.util.Random;
import java.util.Scanner;

public class Questao8Lista2 {
public static void main(String[] args) {
		
		float media = 0;
		float soma = 0;
		int cont = 0;
		int maior = 0;
		int menor = 1;
		
	
		
		int[] vetor = new int[100];

        //instância um objeto da classe Random usando o construtor padrão
        Random gerador = new Random();

        //imprime sequência de 100 números inteiros aleatórios
        for (int i = 0; i < 100; i++) {
            vetor[i] = gerador.nextInt(100);
            soma =  soma + vetor[i];
            cont++;
            if (maior <= vetor [i]) {
            	maior = vetor [i];
            }
            else if (menor >= vetor [i]) {
            	menor = vetor [i];
            }
       
        }
        for(int i = 0; i < vetor.length-1; i++){
        	System.out.println(vetor[i]);
        }
        
		media = soma/(cont-1);
		System.out.println("\n O menor valor é : "+ menor );
		System.out.println("\n O maior valor é : "+ maior );
	}


}
