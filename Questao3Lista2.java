package avaliacao;
import java.util.Random;
import java.util.Scanner;
public class Questao3Lista2 {


	    public static void main(String[] args) {
	    	Scanner ent = new Scanner(System.in);
	    	int[] vetor = new int[10];

	        //instância um objeto da classe Random usando o construtor padrão
	        Random gerador = new Random();

	        //imprime sequência de 10 números inteiros aleatórios
	        for (int i = 0; i < 10; i++) {
	            vetor[i] = gerador.nextInt(100);
	            System.out.println(vetor[i]);
	        }

	        System.out.println("\n Números ordenados \n");
	        for(int i = vetor.length-1; i >= 0; i--){
	            System.out.println(vetor[i]);
	        }
	    }
}
