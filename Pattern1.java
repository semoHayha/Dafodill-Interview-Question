// Input:- 1
// Output:-
//*

// Input:- 2
// Output:-
//**
//**

// Input:- 3
// Output:- 
//***
// ***
//***

// Input:- 4
// Output:-
//****
// ****
// ****
//****

// Input:- 5
// Output:-
//*****
// *****
//  *****
// *****
//*****

// Input:- 12
// // Output:-
//************
// ************
//  ************
//   ************
//    ************
//     ************
//     ************
//    ************
//   ************
//  ************
// ************
//************

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Pattern1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int x = n/2;

		String s = "";
		for(int i = 0; i < n; i++) {
			s += "*";
		}

		for(int i = 0; i < n; i++) {
			int y = (i <= x)?i:n-i;
			for(int j = y; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.println(s);
		}
	}
}