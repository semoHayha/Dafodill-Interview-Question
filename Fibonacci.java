// Problem Statement:- Write a function to generate a fibonacci number using recursive function.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Fibonacci {
	public static int fib(int n) {
		if(n < 2) {
			return n;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		System.out.println(fib(n));
	}
}