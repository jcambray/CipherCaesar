package esgi.al1.cipher;

import java.util.ArrayList;
import java.util.HashMap;


public class Main {
	
	public static void main(String[] args) {
		/*CipherCaesar m = new CipherCaesar();
		System.out.println(m.encode("blabla", 'c'));*/
		
		HomophonicCipher h = new HomophonicCipher();
		HashMap<Character, ArrayList<Byte>> key = h.generateKey("hello etienne");
		System.out.println(key);
		
	}

}
