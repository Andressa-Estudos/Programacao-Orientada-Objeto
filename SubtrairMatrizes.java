package avaliacao;
import java.util.Scanner;
public class SubtrairMatrizes {
	public static void main(String [] args){
	       
		   
		        Scanner entrada = new Scanner(System.in);
		   
		       
		        int[][] A = { { 3, 4, 5 }, { 5, 6, 1 }, {7, 8, 2} };
		        int[][] B = { { 10, 1, 2 }, { 3, 5, 0 }, {0, 21, 15} };
		        int C[][] = new int [3][3];
		   
		       
		   // Obtendo a primeira matriz
		        System.out.println("PRIMEIRA MATRIZ!");
		               
	 	    for (int i=0; i<3; ++i){
		        for (int j=0; j<3; ++j){
		        	System.out.println("A [" + i + "][" + j + "] = "+ A[i][j]);
		        }       
		    }
		    
		       
		    // Obtendo a segunda matriz
		        System.out.println("SEGUNDA MATRIZ!");
		            
		    for (int i=0; i<3; ++i){
		        for (int j=0; j<3; ++j){
		        	System.out.println("B [" + i + "][" + j + "] = "+ B[i][j]);
		        }            
		    }
		    
		    if (A [0].length ==  B [0].length  ) {
		       
		       
		              
		        System.out.println("\nDIFERENÇA DAS MATRIZ A e B!");
		    for (int i=0; i<3; ++i){
		        for (int j=0; j<3; ++j){
		            C[i][j] = A[i][j] - B[i][j];
		            System.out.printf("%d\t",C[i][j]);   
		        } 
		          System.out.printf("\n");      
		    }
		   
		    }
		    
		    else {
		    	System.out.printf("Não é possível fazer a subtração!!");
		    }
		    }   

}
