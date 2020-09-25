// Problem Statement:- Wap to find the largest prime no. from given array.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class LargestPrime {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		boolean[] sieve = new boolean[n+1];
		sieve[1] = true;
		for(int i = 2; i*i <= n; i++) {
			if(sieve[i] == false) {
				for(int j = i*2; j <= n; j+=i) {
					sieve[j] = true;
				}
			}
		}

		// System.out.println(Arrays.toString(sieve));

		for(int  i = n; i >= 2; i--) {
			if(sieve[i] == false) {
				System.out.println(i);
				break;
			}
		}
	}
}