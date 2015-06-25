package esgi.al1.cipher;

import java.util.ArrayList;


public class VigenereCipher {
	
	private final static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	public ArrayList<Character> generateKey(String message){

		 ArrayList<Character> keys = new ArrayList<>();
		 //add random charachers te generate the key
		 for(int i = 0; i < message.length(); i++){
			 keys.add(alphabet.toUpperCase().charAt((int) (Math.random() * 25)));
		 }
		 return keys;
	}
	
	
	public String encode(String message, String key){
		return "";
	}
	
	
	public String decode(String encoded, ArrayList<Character> key){
		int keysIndex = 0;
		
		StringBuilder decoded = new StringBuilder();
		int transpose;
		for(int i = 0; i <encoded.length(); i++){
			transpose = key.get(i);
			decoded.append(((char)((encoded.charAt(i) - transpose + 26) % 26 + 'A')));
			if(transpose == key.size())
				transpose = 0;
		}
		return decoded.toString();
	}
	

}
