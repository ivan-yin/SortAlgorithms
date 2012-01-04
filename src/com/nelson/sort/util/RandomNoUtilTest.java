package com.nelson.sort.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RandomNoUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetNos() {
		int[] nos = RandomNoUtil.getNos(0);
		Assert.assertNotNull(nos);
		Assert.assertTrue("length is 0", nos.length != 0 );
		PrintUtil.printF(nos);
	}

}
