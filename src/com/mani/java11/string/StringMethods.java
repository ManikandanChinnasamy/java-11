package com.mani.java11.string;

import java.util.List;
import java.util.stream.Collectors;

public class StringMethods {

	public static void main(String[] args) {
		String multilineString = "Baeldung helps \n \n developers \n explore Java.";

		strip(multilineString); // remove white space
		lines(multilineString); // Returns a stream of lines extracted from this string,separated by line
		stripLeading(multilineString); // all leading white space removed.
		stripTrailing(multilineString); // all trailing white space removed.
		repeat("Mani"); // Repeated string  by count
	}

	private static void repeat(String text) {
		System.out.println(text.repeat(3));
	}

	private static void stripTrailing(String multilineString) {
		System.out.println("stripTrailing \t" + multilineString.stripTrailing());
	}

	private static void stripLeading(String multilineString) {
		System.out.println("stripLeading \t" + multilineString.stripLeading());
	}

	private static void lines(String multilineString) {
		List<String> lines = multilineString.lines().map(s -> s).collect(Collectors.toList());
		System.out.println("Lines:\t" + lines);
	}

	private static void strip(String multilineString) {
		List<String> lines = multilineString.lines().filter(line -> !line.isBlank())// Without blank
				.map(String::strip).collect(Collectors.toList());
		System.out.println("strip \t" + lines);
	}

}
