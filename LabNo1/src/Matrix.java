// AHMED FAWAD -- BS(CS)2-A

//--------------------------------------------------------------Libraries---------------------------------------------------------
import java.util.Scanner;
import java.util.StringTokenizer;
//--------------------------------------------------------------Libraries---------------------------------------------------------
 


public class Matrix {
	

//--------------------------------------------------------------Additon Function ---------------------------------------------------------

	public static int[][] add(int[][] A,int r1,int c1 ,int[][] B,int r2,int c2) {
        int m = A.length;
        int n = A[0].length;
        int[][] C = new int [m][n];	// creating array to store results
        
        if(r1 != r2  && c1 != c2)		// order of 2 matrices should be same
        {
        	System.out.println("ERROR: Matrices dont have same order");
        }
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }
//--------------------------------------------------------------Additon Function ---------------------------------------------------------

 
//--------------------------------------------------------------Subtration Function ---------------------------------------------------------
	public static int[][] subtract(int[][] A,int r1,int c1 ,int[][] B,int r2,int c2) {
        int m = A.length;
        int n = A[0].length;
        int [][] C = new int [m][n];	// creating array to store results
        if(r1 != r2  && c1 != c2)		// order of 2 matrices should be same
        {
        	System.out.println("ERROR: Matrices dont have same order");
        }
        
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }
	//--------------------------------------------------------------Subtration Function ---------------------------------------------------------

   
//--------------------------------------------------------------Multiplication Function ---------------------------------------------------------
    public static int[][] multiply(int[][] A,int r1,int c1, int[][] B,int r2,int c2) {
        int row1 = A.length;
        int col1 = A[0].length;
        int row2 = B.length;
        int col2  = B[0].length;
        if (r1 != c2) // checking if rows of 1st matrix is == to column of 2nd matrix
        {
        	System.out.println("Error:Matrix Order Voilation");
        }
        int[][] C = new int[row1][col2];
        for (int i = 0; i < row1; i++)
            for (int j = 0; j < col2; j++)
                for (int k = 0; k < col1; k++)
                    C[i][j] += (A[i][k] * B[k][j]);
        return C;
    }
//--------------------------------------------------------------Multiplication Function ---------------------------------------------------------

    
 //--------------------------------------------------------------Populating The Matrices ---------------------------------------------------------
   
    public static void take_input(int matrix[][],int r,int c)
    {
    	Scanner input = new Scanner(System.in);
    	for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				matrix[i][j]=input.nextInt();	//populating the matrix
			}
    	}
    		
    }
//--------------------------------------------------------------Populating The Matrices ---------------------------------------------------------

    
//--------------------------------------------------------------Print Matrix() ---------------------------------------------------------
    public static void printMatrix(int matrix[][],int r,int c)
    {
    	for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
			    System.out.print(" "+matrix[i][j]);
			}
			System.out.println();
    	}
    }
 //--------------------------------------------------------------Print Matrix() ---------------------------------------------------------
    
    
  //--------------------------------------------------------------Main Function() ---------------------------------------------------------
   
    public static void main(String []args) throws Exception {
    	
    	int row_a = 0, col_a = 0 , row_b = 0, col_b = 0, row_c = 0, col_c=0; 
    	String s;
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Enter the order of 1st matrix e.g(4x3)");
    	s = in.nextLine();
    	StringTokenizer st= new StringTokenizer(s,"x ");	// separating rows and columns from the string
    	while(st.hasMoreTokens()) { 
    		row_a = Integer.parseInt(st.nextToken()); 
    		col_a =Integer.parseInt( st.nextToken());
    	}
    	
    	
    	int[][] matrix1 = new int[row_a][col_a];	// initalizing the Matrix1
    	System.out.println("Enter the entries of 1st matrix");
    	take_input(matrix1,row_a,col_a);
    	System.out.println("Matrix1");
    	printMatrix(matrix1, row_a, col_a);
    	
    	
    	System.out.println("Enter the order of 2nd matrix e.g(4x3)");	
    	s = in.nextLine();
    	StringTokenizer st1= new StringTokenizer(s,"x ");	// separating rows and columns from the string
    	while(st1.hasMoreTokens()) { 
    		row_b = Integer.parseInt(st1.nextToken()); 
    		col_b =Integer.parseInt( st1.nextToken());
    	}
    	
    	
    	int[][] matrix2 = new int[row_b][col_b];		// initalizing the Matrix2
    	System.out.println("Enter the entries of 2nd matrix");
    	take_input(matrix2,row_b,col_b);
    	System.out.println("Matrix2");
    	printMatrix(matrix2, row_b, col_b);
    	
    	
    	/*System.out.println("Enter the order of 3rd matrix e.g(4x3)\n");
    	s = in.nextLine();
    	StringTokenizer st2= new StringTokenizer(s,"x");
    	while(st.hasMoreTokens()) { 
    		row_c = Integer.parseInt(st2.nextToken()); 
    		col_c =Integer.parseInt( st2.nextToken());
    	}
    	
    	int[][] matrix3 = new int[row_c][col_c];
		System.out.println("Enter the entries of 3rd matrix");
    	take_input(matrix3,row_c,col_c);
    	System.out.println("Matrix3");
    	printMatrix(matrix3, row_c, col_c);*/
    	
    	
    	// for testing purposes
    	int [][]a=add(matrix1, row_a, col_a, matrix2, row_b, col_b);
    	printMatrix(a,2,2);
    	
    	int [][]b=subtract(matrix1, row_a, col_a, matrix2, row_b, col_b);
    	printMatrix(b,2,2);
    	
    	int [][]c=multiply(matrix1, row_a, col_a, matrix2, row_b, col_b);
    	printMatrix(c,2,2);
    	
    	
        }
    //--------------------------------------------------------------Main Function() ---------------------------------------------------------
   
}// main class ends

