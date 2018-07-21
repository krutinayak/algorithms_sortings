package com.ksns0ft.algorithms;

import java.util.Arrays;

public class Util {

	public static void print(String msg, int[] data) {
		System.out.printf("%s %s", msg, Arrays.toString(data));
		System.out.println();
	}

	public static void swap(int[] unsortedArray, int a, int b) {
		int temp = unsortedArray[a];
		unsortedArray[a] = unsortedArray[b];
		unsortedArray[b] = temp;
	}

}
