package com.nelson.sort;

import com.nelson.sort.util.SwapUtil;

public class SelectionSort implements Sort {

	public void sort(int[] a) {
		sort1(a);
	}

	public void sort1(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int k = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[k] > a[j]) {
					k = j;
				}
			}
			SwapUtil.swap(a, i, k);
		}
	}
}
