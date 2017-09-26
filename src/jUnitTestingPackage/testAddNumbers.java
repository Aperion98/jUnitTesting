package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctioning jUnit = new jUnitFunctioning();
		int result = jUnit.addnumbers(100, 200);
		assertEquals (300,result);
	}

}
