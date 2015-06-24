package esgi.al1.cipher;

public interface ICipher {
	
	void encode(String message, char key);
	void decode(String encodedmsg, char key);

}
