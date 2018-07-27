package com.ksns0ft.algorithms.sortings;

import com.ksns0ft.algorithms.Util;

public class MergeSort {

	public static void main(String[] args) {

		int[] unsortedarray = { 2, 56, 12, 32, 45, 124, 987, 125, 2, 34 };

		Util.print("before mergesort--", unsortedarray);

		divide_merge(unsortedarray, 0, unsortedarray.length - 1);

		Util.print("after mergesort--", unsortedarray);

	}

	static void divide_merge(int[] srcarray, int startIndx, int endIndx) {

		if (startIndx >= endIndx)
			return;

		int midIndx = (startIndx + endIndx) >> 1;

		divide_merge(srcarray, startIndx, midIndx);
		divide_merge(srcarray, midIndx + 1, endIndx);
		merge(srcarray, startIndx, midIndx, endIndx);

	}

	static void merge(int[] srcarray, int startIndx, int midIndx, int endIndx) {

		System.out.println();

		Util.print("before merge--data--" + startIndx + "--" + midIndx + "--" + endIndx, srcarray);

		int leftStart = startIndx;
		int leftEnd = midIndx;
		int rightStart = midIndx + 1;
		int rightEnd = endIndx;
		int tmpIndx = startIndx;

		int[] tmprray = new int[srcarray.length];

		while (leftStart <= leftEnd && rightStart <= rightEnd) {

			if (srcarray[leftStart] < srcarray[rightStart]) {
				tmprray[tmpIndx] = srcarray[leftStart];
				++leftStart;
			} else {
				tmprray[tmpIndx] = srcarray[rightStart];
				++rightStart;
			}

			++tmpIndx;
		}

		Util.print("tmprray data--" + startIndx + "--" + midIndx + "--" + endIndx, tmprray);

		System.arraycopy(srcarray, leftStart, tmprray, tmpIndx, leftEnd - leftStart + 1);

		Util.print("after 1st merge--data--" + leftStart + "--" + leftEnd, tmprray);

		System.arraycopy(srcarray, rightStart, tmprray, tmpIndx, rightEnd - rightStart + 1);

		Util.print("after 2nd merge--data--" + rightStart + "--" + rightEnd, tmprray);

		System.arraycopy(tmprray, startIndx, srcarray, startIndx, endIndx - startIndx + 1);

		Util.print("after copy from tmparray to srcarray --data--" + startIndx + "--" + midIndx + "--" + endIndx,
				srcarray);

		System.out.println();
	}

}
