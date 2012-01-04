package com.nelson.sort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.nelson.sort.util.LogUtil;
import com.nelson.sort.util.PrintUtil;
import com.nelson.sort.util.RandomNoUtil;

public class SortTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSort() {
//		Sort sort = new InsertSort();
//		Sort sort = new SelectionSort();
		Sort sort = new MergeSort();
//		Sort sort = new QuickSort();
		int a [] = RandomNoUtil.getNos(5);
		PrintUtil.printF(a);
		long startS = System.currentTimeMillis();
		LogUtil.info("start millis " + startS);
		sort.sort(a);
		long endS = System.currentTimeMillis();
		LogUtil.info("end millis " + endS);
		LogUtil.info("spend millis " + (endS - startS));
		PrintUtil.printF(a);
	}

}
