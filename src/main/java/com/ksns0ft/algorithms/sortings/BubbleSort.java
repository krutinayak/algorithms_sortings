package com.ksns0ft.algorithms.sortings;

import com.ksns0ft.algorithms.Util;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numarray = { 1, 670, 5, 98, 15, 8, 5 };
		Util.print("Bubble Sort Before-->", numarray);
		bubblesort_Improved(numarray);
		Util.print("Bubble Sort Result-->", numarray);

	}

	static void bubblesort_Improved(int[] numbers) {

		boolean swapped = true;

		for (int i = numbers.length - 1; i > 0 && swapped; i--) {
			swapped = false;
			for (int j = 0; j < i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					Util.swap(numbers, j, j + 1);
					swapped = true;
				}
			}
		}
	}

	static void bubblesort(int[] numbers) {

		for (int i = numbers.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					Util.swap(numbers, j, j + 1);
				}
			}
		}
	}

}
