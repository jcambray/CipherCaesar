package esgi.al1.cipher;

public interface ICipher {
	
	String encode(String message, char key);
	String decode(String encodedmsg, char key);

}
