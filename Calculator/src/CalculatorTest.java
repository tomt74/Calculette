import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	
	private Calculette c;

	@Before
	public void initCalcul(){
		this.c = new Calculette();
	}
	
	@Test
	public void clickOneReturnOne() {
		assertEquals(1,c.click(1).getResultat(),0.0001);
	}
	
	@Test
	public void clickOnePlusReturnOne(){
		assertEquals(1,c.click(1).click("+").getResultat(),0.0001);
	}
	
	@Test
	public void clickOnePlusOneReturnTwo(){
		assertEquals(2,c.click(1).click("+").click(1).getResultat(),0.0001);
	}
	
	@Test
	public void clickOnePlusOneTwoReturnThirteen(){
		assertEquals(13,c.click(1).click("+").click(1).click(2).getResultat(),0.0001);
	}
	
	@Test
	public void clickOneMinusOneReturnZero(){
		assertEquals(0,c.click(1).click("-").click(1).getResultat(),0.0001);
		
	}
	
	@Test
	public void clickOneTwoMinusTwoReturnTen(){
		assertEquals(10,c.click(1).click(2).click("-").click(2).getResultat(),0.0001);
	}
	
	@Test
	public void clikThreeMultiFiveReturnFifteen(){
		assertEquals(15,c.click(3).click("*").click(5).getResultat(),0.0001);
	}
	
	@Test
	public void clikOneZeroMultiThree(){
		assertEquals(30,c.click(1).click(0).click("*").click(3).getResultat(),0.0001);
	}
	
	@Test 
	public void clickFiveDiviseTwoReturnTwoPointFive(){
		assertEquals(2.5,c.click(5).click("/").click(2).getResultat(),0.0001);
	}
}
