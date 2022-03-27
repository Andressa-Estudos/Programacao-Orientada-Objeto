package avaliacao;

public class MultiplicarMatrizes {

	public static void main(String [] args) {
		
		int[][] A = { { 3, 4, 5}, { 5, 6 , 1}};
		
		
		
		int[][] B = { { 10,1}, {3,5}, {0,21} };
		
		int C[][] = new int [2][2];
		
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("A [" + i + "][" + j + "] = "+ A[i][j]);
			}
		}
		System.out.printf("\n");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("B [" + i + "][" + j + "] = "+ B[i][j]);
			}
		}
		System.out.printf("\n");
		
		
	    
	    if (B [0].length ==  C[0].length  ) {
	    	
	    	
	    	
		    for (int i=0; i<2; ++i){
		    	for (int j=0; j<2; ++j){
		    		for (int k=0; k<3; ++k){
		    			 C[i][j] += A[i][k] * B[k][j];
			             
				    }  
			    }
		    }
		    System.out.println("\nMULTIPLICAÇÃO DAS MATRIZ A e B!");
		    for (int i=0; i<2; ++i){
		        for (int j=0; j<2; ++j){
		            System.out.printf("%d\t",C[i][j]);   
		        }
		        System.out.printf("\n");
		        
		    }
	    	
	    }
		    
	    else {
	    	System.out.print("Não é possível fazer a multiplicação!!");
	    }
	}

}
