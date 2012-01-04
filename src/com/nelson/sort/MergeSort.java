package com.nelson.sort;

import java.util.Arrays;

import com.nelson.sort.util.SwapUtil;

public class MergeSort implements Sort {

	public void sort(int[] a) {
//		sort2(a, 0 , a.length - 1);
		sort3(a, 0 , a.length - 1);
	}

	private void sort2(int[] a, int lo0, int hi0) {
		int lo = lo0, hi = hi0;
		if(lo >= hi){//pay attention to
			return;
		}
		int mid = (lo + hi) / 2;
		
		sort2(a, lo, mid);
		sort2(a, mid + 1, hi);
		
		int low_end = mid, hi_st = mid + 1;
		
		while(lo <= low_end && hi_st <= hi){
			if(a[lo] < a[hi_st]){
				lo ++;
			} else{
				/*
				 * a[lo] >= a[start_hi] The next element comes from the second
				 * list, move the a[start_hi] element into the next position and
				 * shuffle all the other elements up.
				 */
				int T = a[hi_st];
				for (int k = hi_st - 1; k >= lo; k--) {//pay attention to
					a[k + 1] = a[k];
				}
				a[lo] = T;
				low_end ++;
				lo ++;
				hi_st ++;
			}
		}
	}
	
	public void sort3(int [] a, int lo0, int hi0){
		int lo = lo0, hi = hi0;
		if(lo >= hi) return;
		
		int mid = (lo + hi)/2;
		sort3(a, lo, mid);
		sort3(a, mid + 1, hi);
		
		int low_end = mid, hi_st = mid + 1;
		while(lo <= low_end && hi_st <= hi){
			if(a[lo] < a[hi_st]) lo++;
			else{
				int T = a[hi_st];
				for (int k = hi_st - 1; k >= lo; k--) {
					a[k+1] = a[k];
				}
				a[lo] = T;
				hi_st ++;
				lo++;
				low_end ++;
			}
		}
			
	}
	
}
