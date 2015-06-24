package esgi.al1.cipher;

import java.util.ArrayList;
import java.util.HashMap;
import java.nio.ByteBuffer;

public class HomophonicCipher {

	
	public HashMap<Character, ArrayList<Byte>> generateKey(String message){
		
		HashMap<Character, ArrayList<Byte>> key = new HashMap<Character, ArrayList<Byte>>();
		for(int i  = 0; i < message.length(); i++){
			char c = message.charAt(i);
			if(!key.containsKey(c)){
				byte[] b = new byte[2];
				ArrayList<Byte> bytesList = new ArrayList<Byte>();
				bytesList.add(new Byte(Integer.toString(1)));
				bytesList.add(new Byte(Integer.toString(i)));
				key.put(message.charAt(i),bytesList);
			}
			else{
				ArrayList<Byte> bytesList = key.get(c);
				bytesList.add(new Byte(Integer.toString(i)));
				bytesList.set(0,new Byte(Integer.toString(bytesList.size() - 1)));
			}
				
			
		}
		return key;
		
	}
	
	
	private byte[] writeToBuffer(byte[] buffer,int value, boolean init){
		
		ByteBuffer bb = ByteBuffer.wrap(buffer);
		System.out.println(bb);
		if(init){
			bb.putInt(0,1);
			bb.putInt(value);
		}
		else
		{
			//modifie le nombre d'octet contenu dans le byte array
			//et insertion de la nouvelle valeur
			int newValue = bb.getInt(1);
			bb.putInt(1,++newValue);
			bb.putInt(value);
		}
		
		return bb.array();
		
	}
	
	
	public String encode(String message, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public String decode(String crypted, String key) {
		// TODO Auto-generated method stub
		return null;
	}
}
