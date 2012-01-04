package com.nelson.sort.util;

import java.util.Arrays;

public class PrintUtil {
	public static void printF(int a[]) {
		LogUtil.info("array length " + a.length);
		LogUtil.info(Arrays.toString(a));
	}
}
