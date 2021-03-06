import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

//### IMPORTS ##############################################################################################################################
public class CustomerTest {

	private static String name = "Fred";
	private static String statement;
	
	private static Customer customer;
	
	@Before
	public void setUp() {
		CustomerTest.customer = new Customer(CustomerTest.name);
	}
	
	@Test
	public void testConstructor() {
		
		//Test if name is correct:
		assertEquals(CustomerTest.customer.getName(), CustomerTest.name);
		//Test if statement is correct:
		CustomerTest.statement = "Rental Record for " + CustomerTest.name + "\n" +
		                                    "\tTitle\t\tDays\tAmount\n" +
				                            "Amount owed is 0.0\n" +
		                                    "You earned 0 frequent renter points";
		
		assertEquals(CustomerTest.customer.statement(), CustomerTest.statement);
	}
	
	@Test
	public void testStatement() {
		
		Movie mov1 = new Movie("movie1", 1);
		Rental ren1 = new Rental(mov1, 5);
		
		Movie mov2 = new Movie("movie2", 2);
		Rental ren2 = new Rental(mov2, 3);
		
		CustomerTest.customer.addRental(ren1);
		CustomerTest.customer.addRental(ren2);
		
		CustomerTest.statement = "Rental Record for " + CustomerTest.name + "\n" +
                "\tTitle\t\tDays\tAmount\n" +
				"\tmovie1\t\t5\t15.0\n" +
                "\tmovie2\t\t3\t1.5\n" +
                "Amount owed is 16.5\n" +
                "You earned 3 frequent renter points";

		assertEquals(CustomerTest.customer.statement(), CustomerTest.statement);
	}
	
}
//### EOF ##################################################################################################################################