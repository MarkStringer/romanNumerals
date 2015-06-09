import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralTest {
	
	
	@Test
	public void testRomantoDecimal1()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("i"),1);
		System.out.println(testObject.romanToDecimal("i"));
	}

	@Test
	public void testRomantoDecimal2()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("ii"),2);
		System.out.println(testObject.romanToDecimal("ii"));
	}
	
	@Test
	public void testRomantoDecimal3()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("iii"),3);
		System.out.println(testObject.romanToDecimal("iii"));
	}
	
	@Test
	public void testRomantoDecimal4()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("iv"),4);
		System.out.println(testObject.romanToDecimal("iv"));
	}
	
	@Test
	public void testRomantoDecimal5()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("v"),5);
		System.out.println(testObject.romanToDecimal("v"));
	}
	
	@Test
	public void testRomantoDecimal6()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("vi"),6);
		System.out.println(testObject.romanToDecimal("vi"));
	}
	@Test
	public void testRomantoDecimal9()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("ix"),9);
		System.out.println(testObject.romanToDecimal("9"));
	}
	@Test
	public void testRomantoDecimal10()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("x"),10);
		System.out.println(testObject.romanToDecimal("10"));
	}
	
	@Test
	public void testRomantoDecimal19()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("xix"),19);
		System.out.println(testObject.romanToDecimal("19"));
	}
	
	@Test
	public void testRomantoDecimal50()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("l"),50);
		System.out.println(testObject.romanToDecimal("50"));
	}
	
	@Test
	public void testRomantoDecimal90()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("xc"),90);
		System.out.println(testObject.romanToDecimal("90"));
	}
	
	@Test
	public void testRomantoDecimal100()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("c"),100);
		System.out.println(testObject.romanToDecimal("100"));
	}
	
	@Test
	public void testRomantoDecimal500()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("d"),500);
		System.out.println(testObject.romanToDecimal("500"));
	}
	@Test
	public void testRomantoDecimal900()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("cm"),900);
		System.out.println(testObject.romanToDecimal("900"));
	}

	@Test
	public void testRomantoDecimal1000()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("m"),1000);
		System.out.println(testObject.romanToDecimal("1000"));
	}
	
	@Test
	public void testRomantoDecimal1900()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("mcm"),1900);
		System.out.println(testObject.romanToDecimal("1900"));
	}
	
	@Test
	public void testRomantoDecimal3000()
	{
		RomanNumeral testObject = new RomanNumeral();
		assertEquals(testObject.romanToDecimal("mmm"),3000);
		System.out.println(testObject.romanToDecimal("3000"));
	}
}
