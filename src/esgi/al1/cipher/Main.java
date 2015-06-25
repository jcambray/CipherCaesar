package esgi.al1.cipher;

import java.util.ArrayList;



public class Main {
	
	public static void main(String[] args) {	
		/*HomophonicCipher h = new HomophonicCipher();
		HashMap<Character, ArrayList<Byte>> key = h.generateKey("hello etienne");
		System.out.println(key);*/
		VigenereCipher cipher = new VigenereCipher();
		System.out.println(cipher.generateKey("cccccc"));
		ArrayList<Character> key = new ArrayList<Character>();
		key.add('B');key.add('C');key.add('B');key.add('C');key.add('B');
		System.out.println(cipher.decode("IGMNP",cipher.generateKey("cccccc")));
	}

}
