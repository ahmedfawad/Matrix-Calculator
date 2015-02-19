// UNIT TESTS

//show green in case of success and red in case of failure
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixTest {
    
   
    
    //Tests Addition 3 matrices
    @SuppressWarnings("deprecation")
	@Test
    public void testAdd() throws IOException {
    	
    	Matrix a = null;
    	int m1[][]={{3,2,1},{1,2,3},{2,3,5}};
    	int m2[][]={{1,2,3},{1,2,3},{2,0,1}};
    	int m3[][]={{1,1,0},{2,1,1},{0,1,3}};
    	int m4[][]={{5,5,4},{4,5,7},{4,4,9}};
    	
    	
    
        int result1[][]=a.add(m1,3,3,m2,3,3);
        int result2[][]=a.add(result1,3,3,m3,3,3);
        
        assertEquals(m4, result2);
        
    }


  
    //Tests matrix multiplication of 2 matrices
     
 public void testMultiply() throws IOException {
	 Matrix a = null;
	 int m1[][]={{1,2,3},{4,5,6}};
 	 int m2[][]={{7,8},{9,10},{11,12}};
 	 int m3[][]={{58,64},{139,154}};
 	 
 	 int result[][]=a.multiply(m1,2,3,m2,3,2);
 	 
 	 assertEquals(m3, result);
 	 
       }
   
    //Tests (A * B) + C
    public void testMultiply1() throws IOException {
   	 Matrix a = null;
   	 	 int m1[][]={{1,2,3},{4,5,6}};
    	 int m2[][]={{7,8},{9,10},{11,12}};
    	 int m3[][]={{58,64},{139,154}};
    	 int m4[][]={{2,4},{7,6}};
    	 int m5[][]={{60,68},{146,160}};
    	 
    	 
    	 int result[][]=a.multiply(m1,2,3,m2,3,2);
    	 int result2[][]=a.add(result,2,2,m4,2,2);
    	 
    	 assertEquals(m5, result2);
    	 
          }
    
}