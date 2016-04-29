//### IMPORTS ##############################################################################################################################
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MovieTest {
	
	private static String title = "Ocean’s Eleven";
	private static int priceCode = 10;
	
	private static Movie movie;
	
	@Before
	public void setUp() {
		MovieTest.movie = new Movie(MovieTest.title, MovieTest.priceCode);
	}
	
	@Test
	public void testConstructor() {
		
		//Test if title is correct:
		assertEquals(MovieTest.movie.getTitle(), MovieTest.title);
		//Test if priceCode is correct:
		assertEquals(MovieTest.movie.getPriceCode(), MovieTest.priceCode);
	}
	
	@Test
	public void testSetter() {
		
		int newPriceCode = 20;
		
		//Test if priceCode is no equal the new priceCode:
		assertEquals(MovieTest.movie.getPriceCode(), MovieTest.priceCode);
		
		//Change the priceCode:
		MovieTest.movie.setPriceCode(newPriceCode);

		//Test if priceCode is correct:
		assertEquals(MovieTest.movie.getPriceCode(), newPriceCode);
		
	}

}

//### EOF ##################################################################################################################################