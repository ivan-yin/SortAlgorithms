package com.nelson.sort.util;


public class RandomNoUtil {

	public static int defaultNo = 10;
	public static long defaultSeed = 100;
	public static int base = 100;
	
	public static int[] getNos(int no){
		if(no <= 0){
			no = defaultNo;
		}
		int[] result = new int[no];
		for (int index = 0; index < result.length; index++) {
			result[index] = (int) (Math.random() * base * no);
		}
		return result;
	}
}
