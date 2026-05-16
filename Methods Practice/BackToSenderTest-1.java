import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest{

	@Test
	public void testThatTheRigthAllowanceIsReturnedWhenSuccessfulDeliveryIsGreaterorEqualsToSeventy(){
		//Given
		int diliveryNumber = 80;
		
		//When
		int expectedWageForTheDay = BackToSender.ridersPayment(diliveryNumber);

		//check
		int actualWageForTheDay = 45000;
		assertEquals(actualWageForTheDay, expectedWageForTheDay);
	}
    @Test
	public void testThatTheRigthAllowanceIsReturnedWhenSuccessfulDeliveryIsLessThanFifty(){
		//Given
		int diliveryNumber = 25;
		
		//When
		int expectedWageForTheDay = BackToSender.ridersPayment(diliveryNumber);

		//check
		int actualWageForTheDay = 9000;
		assertEquals(actualWageForTheDay, expectedWageForTheDay);
	}
    
    @Test
	public void testThatTheRigthAllowanceIsReturnedWhenSuccessfulDeliveryRangesFromSixtyToSixtynine(){
		//Given
		int diliveryNumber = 69;
		
		//When
		int expectedWageForTheDay = BackToSender.ridersPayment(diliveryNumber);

		//check
		int actualWageForTheDay = 22250;
		assertEquals(actualWageForTheDay, expectedWageForTheDay);
	}
}
