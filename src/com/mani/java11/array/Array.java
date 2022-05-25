package com.mani.java11.array;

import java.util.Arrays;
import java.util.List;

public class Array {
//	The java.util.Collection interface contains a new default toArray method which takes an IntFunction argument.
//	This makes it easier to create an array of the right type from a collection:

	public static void main(String[] args) {
		List sampleList = Arrays.asList("Java", "Kotlin");
		String[] sampleArray = (String[]) sampleList.toArray(String[]::new);
		System.out.println(sampleArray.length);
		System.out.println(sampleArray[0]);
//		assertThat(sampleArray).containsExactly("Java", "Kotlin");

	}

}
