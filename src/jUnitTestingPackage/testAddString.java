package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFunctioning jUnitString = new jUnitFunctioning();
		String result = jUnitString.addstrings("capstone", "project");
		assertEquals ("capstoneproject",result);
	}

}
