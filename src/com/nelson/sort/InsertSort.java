package com.nelson.sort;

import com.nelson.sort.util.SwapUtil;

public class InsertSort implements Sort {

	public void sort(int[] a) {
		// sort1(a);
		sort2(a);
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

	public void sort2(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j >= 1 && a[j - 1] > a[j]; j--) {
				SwapUtil.swap(a, j - 1, j);
			}
		}
	}
	
}
