import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

//### IMPORTS ##############################################################################################################################

public class RentalTest {

	private static String title = "Ocean’s Eleven";
	private static int priceCode = 10;
	private static Movie movie;
	
	private static int daysRented = 5;
	private static Rental rental;
	
	@Before
	public void setUp() {
		RentalTest.movie = new Movie(RentalTest.title, RentalTest.priceCode);
		RentalTest.rental = new Rental(RentalTest.movie, RentalTest.daysRented);
	}
	
	@Test
	public void testConstructor() {
		
		//Test if movie is correct:
		assertEquals(RentalTest.rental.getMovie(), RentalTest.movie);
		//Test if daysRented is correct:
		assertEquals(RentalTest.rental.getDaysRented(), RentalTest.daysRented);
	}
	

}
//### EOF ##################################################################################################################################