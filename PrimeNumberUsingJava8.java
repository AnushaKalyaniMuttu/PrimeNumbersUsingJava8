package com.demo;

import java.util.stream.IntStream;

public class PrimeNumberUsingJava8 {

public static void main (String [] args) {
	
	IntStream.rangeClosed(10, 1000)
	.filter(StringReversalUsingReduce::isPrime)
	.forEach(System.out::println);
}


public static boolean isPrime(int number) {
	
	if(number<=1) {
		return false;
	}
	for(int i=2;i<Math.sqrt(number);i++) {
		if(number%i==0) {
			return false;
		}
	}
	return true;
}
}
