// Wap to count the no. of times a word is repeated in given string.
// For example:-
// Input:- "who are you and where are you from you two times are two times Rest I don't remember"
// Output:- 
			// remember->1
			// times->2
			// Rest->1
			// are->3
			// don't->1
			// and->1
			// I->1
			// where->1
			// from->1
			// two->2
			// you->3
			// who->1


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class Repeat {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");
		int n = s.length;

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for(int i = 0; i < n; i++) {
			if(hm.get(s[i]) == null) {
				hm.put(s[i], 1);
			}
			else {
				hm.put(s[i], hm.get(s[i])+1);
			}
		}

		for(String x: hm.keySet()) {
			System.out.println(x  + "->" + hm.get(x));
		}
	}
}