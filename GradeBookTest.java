import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook g1;

	@BeforeEach
	//implement setup method
	public void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);


	}
	//implement the tearDown method
	
     @After
     public void tearDown () throws Exception{
    	 g1=null;
    			 
     }
     //implement test addScore method
	@Test 
	public void testAddScore() {
		assertEquals(2.0, g1.getScoreSize(), 0.01);
		 
		
		 assertTrue(g1.toString().equals("50.0 75.0 "));     

	}
	
	//implement test sum method
	@Test
	
	public void testSum() { 
		
		assertEquals(125, g1.sum(), .0001);
	}
	
	//implement test minimun method

	@Test
	public void testMinimum() {
		
		assertEquals(50, g1.minimum(), .001);


	}
 //implement test final score
	@Test
	 public void testFinalScore() {
		  assertEquals(75.0, g1.finalScore(), .0001);
	}


}
