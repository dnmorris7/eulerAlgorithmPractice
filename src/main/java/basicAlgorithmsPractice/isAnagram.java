package basicAlgorithmsPractice;

public class isAnagram {

public static void main(String[] args) {
	
}

static int makeAnagram(String a, String b) {
	int min_deletions = 0;
	int[] a_freq=new int[26];
	int[] b_freq=new int[26];
	
	for(int i=0; i<a.length(); i++) {
		char current_char=a.charAt(i);
		int char_to_int= (int)current_char;
		int position = char_to_int - (int)'a';
		a_freq[position]++;
	}
	for(int i=0; i<b.length(); i++) {
		char current_char=b.charAt(i);
		int char_to_int= (int)current_char;
		int position = char_to_int - (int)'a';
		b_freq[position]++;
	}
	
	for (int i = 0; i<26;i++) {
		int difference = Math.abs(a_freq[i] - b_freq[i]);
		min_deletions+=difference;
	}
return min_deletions;	
}
}