package basicAlgorithmsPractice;

public class subStringWhiteboard {

	public static void main(String[] args) {
		String s = "abcx;yzabc;xyz";
		String[] t = s.split(";");
		String cat = "";
		
		for (int i = 0; i < t.length; i++)
		cat =	cat.concat(t[i]);

		System.out.println(s);
		System.out.println(cat);
		
		System.out.println(cat.indexOf("xy"));
		System.out.println(cat.lastIndexOf("xy"));
		
		System.out.println(t[0]);
System.out.println(t[0].startsWith("abc"));
		
		
int[] array = {10,20,30,40,50,60,70,80,90,100};
		int w = array.length;
		
		
		while(w>0) {
			
			System.out.println(array[w-1]);	
			w-=2;
		}
	}

}
