package com.ksns0ft.algorithms.sortings;

import com.ksns0ft.algorithms.Util;

public class InsertionSort {

	public static void main(String[] args) {
		int[] numarray = { 1, 670, 5, 98, 15, 8, 5 };
		Util.print("Insertion Sort Before-->", numarray);
		insertionsort(numarray);
		Util.print("Insertion Sort Result-->", numarray);
	}

	static void insertionsort(int[] numbers) {

		int sourceElement = 0;

		for (int i = 1; i <= numbers.length - 1; i++) {
			sourceElement = numbers[i];
			int j = i;
			while (j > 0 && numbers[j - 1] > sourceElement) {
				numbers[j] = numbers[j - 1];
				j--;
			}

			numbers[j] = sourceElement;
		}
	}

}
