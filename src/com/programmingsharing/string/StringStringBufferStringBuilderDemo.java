package com.programmingsharing.string;

import java.util.concurrent.TimeUnit;

public class StringStringBufferStringBuilderDemo {
	public static void main(String[] args) {
		
		// Change String value
		long startString = System.nanoTime();
		String stringTest = "";
		for (int i = 0; i < 100000; i++) {
			stringTest += i;
		}
		System.out.println("String running time:"+ TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startString));
		
		// Change String value using StringBuilder
		long startStringBuilder = System.nanoTime();
		StringBuilder stringBuilderTest = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			stringBuilderTest.append(i);
		}
		System.out.println("StringBuilder running time: "+ TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startStringBuilder));
		
		
		// Change String value using StringBuffer
		long startStringBuffer = System.nanoTime();
		StringBuilder stringBufferTest = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			stringBufferTest.append(i);
		}
		System.out.println("StringBuffer running time: "+ TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startStringBuffer));
	}
}
