package com.ksns0ft.algorithms.sortings;

import com.ksns0ft.algorithms.Util;

public class SelectionSort {

	public static void main(String[] args) {
		int[] numarray = { 1, 670, 5, 98, 15, 8, 5 };
		Util.print("Selectin Sort Before-->", numarray);
		selectionsort(numarray);
		Util.print("Selectin Sort Result-->", numarray);
	}

	static void selectionsort(int[] numbers) {

		for (int i = numbers.length - 1; i > 0; i--) {
			int m = 0;
			for (int j = 1; j <= i; j++) {
				if (numbers[j] > numbers[m]) {
					m = j;
				}
			}
			Util.swap(numbers, i, m);
		}
	}

}
