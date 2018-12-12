package com.ksns0ft.algorithms.sortings;

import com.ksns0ft.algorithms.Util;

public class InsertionSort {

	public static void main(String[] args) {
		int[] numarray = { 3, 5, 6, 2, 34, 1, 343 };
		Util.print("Insertion Sort Before-->", numarray);
		insertionsort(numarray);
		Util.print("Insertion Sort Result-->", numarray);
	}

	static void insertionsort(int[] numbers) {

		for (int i = 1; i < numbers.length; i++) {
			int sourceElement = numbers[i];
			int j = i;
			
			while (j > 0 && numbers[j - 1] > sourceElement) {
				numbers[j] = numbers[j - 1];
				j--;
			}
			numbers[j] = sourceElement;
		}
	}

}
