package avaliacao;

import java.util.Random;

public class Questao6Lista2 {
public static void main(String[] args) {
    	
    	int[] vetor = new int[100];

        //instância um objeto da classe Random usando o construtor padrão
        Random gerador = new Random();

        //imprime sequência de 100 números inteiros aleatórios
        for (int i = 0; i < 100; i++) {
            vetor[i] = gerador.nextInt(100);
       
        }
        System.out.println("Números pares");
        for(int i = 2; i < vetor.length-1; i++){
        	if (vetor [i] % 2 == 0 ) {
        		System.out.println(vetor[i]);
            }
        }
    }
}
