package esgi.al1.cipher;

import java.util.ArrayList;


public class VigenereCipher {
	
	private final static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	public ArrayList<String> generateKey(){

		 ArrayList<String> keys = new ArrayList<>();
		 keys.add(alphabet.charAt((int) (Math.random() * ( 2 - 26))));
		 keys.add(alphabet.charAt((int) (Math.random() * ( 2 - 26))));
		 return keys;
	}
	
	
	public String encode(String message, String key){
		
	}
	
	
	public String decode(){
		
	}
	

}
