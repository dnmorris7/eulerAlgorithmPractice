package basicAlgorithmsPractice;

public class alternatingCharacters {
	 // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
char[]c = new char[s.length()];
c=s.toCharArray();

int deletionCounts = 0; 
for(int i = 0; i<s.length(); i++) {
if (s.charAt(i)==s.charAt(i+1)){
 deletionCounts++;
}


}
return deletionCounts;
}
    }
