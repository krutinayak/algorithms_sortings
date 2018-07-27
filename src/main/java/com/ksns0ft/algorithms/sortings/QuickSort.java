package com.ksns0ft.algorithms.sortings;

import com.ksns0ft.algorithms.Util;

public class QuickSort {

	public static void main(String[] args) {

		int[] unsortednumbers = { 12, 43, 53, 67, 23, 54, 65, 98, 112, 3456, 123 };

		Util.print("Quick Sort before", unsortednumbers);
		sort1(unsortednumbers, 0, unsortednumbers.length);
		Util.print("Quick Sort after", unsortednumbers);

	}

	static void sort1(int[] numbers, int startIndex, int length) {

		int startPointer, endPointer, pivot = 0;

		startPointer = startIndex;
		endPointer = startIndex + length - 1;

		int midIndex = startIndex + (length >> 1);

		int med = median(numbers, startIndex, midIndex, endPointer);

		pivot = numbers[med];

		System.out.println("pivot--" + pivot);

		while (true) {

			while (startPointer <= endPointer && numbers[startPointer] < pivot) {
				startPointer++;
			}

			while (endPointer >= startPointer && numbers[endPointer] > pivot) {
				endPointer--;
			}

			if (startPointer > endPointer)
				break;

			Util.swap(numbers, startPointer++, endPointer--);
		}

		if (endPointer - startIndex + 1 > 1)
			sort1(numbers, startIndex, endPointer - startIndex + 1);

		if (startIndex + length - startPointer > 1)
			sort1(numbers, startPointer, startIndex + length - startPointer);

	}

	private static int median(int[] numbers, int startIndex, int midIndex, int endIndex) {

		if (numbers[startIndex] < numbers[midIndex] && numbers[midIndex] < numbers[endIndex])
			return midIndex;
		if (numbers[startIndex] > numbers[midIndex] && numbers[midIndex] > numbers[endIndex])
			return midIndex;

		if (numbers[startIndex] < numbers[midIndex] && numbers[midIndex] > numbers[endIndex]
				&& numbers[startIndex] < numbers[endIndex])
			return endIndex;
		if (numbers[startIndex] < numbers[midIndex] && numbers[midIndex] > numbers[endIndex]
				&& numbers[startIndex] > numbers[endIndex])
			return startIndex;

		if (numbers[startIndex] > numbers[midIndex] && numbers[midIndex] < numbers[endIndex]
				&& numbers[startIndex] > numbers[endIndex]) {
			return endIndex;
		} else
			return startIndex;

	}

}
