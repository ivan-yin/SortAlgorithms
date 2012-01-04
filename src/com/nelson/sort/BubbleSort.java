package com.nelson.sort;

import com.nelson.sort.util.SwapUtil;

public class BubbleSort implements Sort {

	public void sort(int[] a) {
		 sort1(a);
	}

	public static void sort1(int[] a) {
		for (int i = 0; i < a.length; i++) {
			// int curIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					SwapUtil.swap(a, i, j);
					// curIndex = j;
				}
			}
		}
	}

	
}
