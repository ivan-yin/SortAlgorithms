package com.nelson.sort;

import java.util.Arrays;

import com.nelson.sort.util.SwapUtil;

public class QuickSort implements Sort {

	public void sort(int[] a) {
		sort2(a, 0 , a.length - 1);
	}

	private void sort2(int[] a, int lo0, int hi0) {
		int hi = hi0, lo = lo0;
		if(lo >= hi) return;
		if(lo == hi - 1){/*
			 * sort a two element list by swapping if necessary
			 */
			if(a[lo] > a[hi]){
				SwapUtil.swap(a, lo, hi);
			}
			return;
		}
		
		int pivot_index = (int) (Math.random() * hi);
		int pivot = a[pivot_index];
		a[pivot_index] = a[hi];
		a[hi] = pivot;
		
		while(lo < hi){
			while(a[lo] <= pivot && lo < hi){
				lo ++;
			}
			while(a[hi] >= pivot && lo < hi){
				hi --;
			}
			if(lo < hi){
				SwapUtil.swap(a, lo, hi);
			}
		}
		
		a[hi0] = a[hi];
		a[hi] = pivot;
		
		sort2(a, lo0, lo - 1);
		sort2(a, hi + 1, hi0);
		
	}
}
