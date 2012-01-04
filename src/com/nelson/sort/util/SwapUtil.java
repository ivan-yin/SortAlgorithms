package com.nelson.sort.util;

public class SwapUtil {

	public static void swap(int[] a, int i, int j){
		if(a == null || a.length <= 0) return;
		if(i < 0 ) i = 0;
		if(j < 0 ) j = 0;
		if(i >= a.length) i = a.length - 1;
		if(j >= a.length) j = a.length - 1;
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}
	
}
