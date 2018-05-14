package _01_encapsulation;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class Data {
//test
	EncapsulateTheData ED = new EncapsulateTheData();
String x = "xxx";
	@Test
	public void testItems() {
		ED.setItem(-12);
		assertEquals(0, ED.getItem());
		ED.setItem(-529);
		assertEquals(0, ED.getItem());
		ED.setItem(33);
		assertEquals(33, ED.getItem());
	}

	@Test
	public void testDegrees() {
		ED.setDegrees(-17);
		assertEquals((float) 0.0, ED.getDegrees(), 0);
		ED.setDegrees(449);
		assertEquals((float) 360.0, ED.getDegrees(), 0);
		ED.setDegrees(52);
		assertEquals((float) 52, ED.getDegrees(), 0);
	}

	@Test
	public void testNomenclature() {
		ED.setNomenclature("");
		assertEquals(" ", ED.getNomenclature());
		ED.setNomenclature("hi");
		assertEquals("hi", ED.getNomenclature());
	}

	@Test
	public void testMember() {
ED.setMember(898);
assertEquals(898, ED.getMember());
String h = "hello";
ED.setMember(h);
assertNotSame(h, ED.getMember());
	}

}
