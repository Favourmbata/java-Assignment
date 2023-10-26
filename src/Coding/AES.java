package Coding;

import javax.crypto.Cipher;
import javax.crypto.CipherSpi;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.security.Key;
import java.util.Base64;

public class Encode {


    private SecretKey key;
    private int kEY_SIZE = 128;
    private Cipher encryptionCipher;
    private int T_LEN = 128;


    public void init() throws Exception {
        KeyGenerator generator =  KeyGenerator.getInstance("Encode");
        generator.init(kEY_SIZE);
        key = generator.generateKey();

    }

    public String encrypt(String message) throws Exception{
        byte[] messageInBytes = message.getBytes();
        Cipher encryptionCipher = Cipher.getInstance("AES/GCM/Nodding");
        encryptionCipher.init(Cipher.ENCRYPT_MODE,key);
        byte[] encryptByte = encryptionCipher.doFinal(messageInBytes);
        return encoding(encryptByte);

    }

    public String decrypt(String encryptedMessage)throws Exception{
     byte[]messageInBytes = decoding(encryptedMessage);
     Cipher decryptionCipher = Cipher.getInstance("AES/GCM/Nodding");
        GCMParameterSpec spec = new GCMParameterSpec(T_LEN,encryptionCipher.getIV());
     decryptionCipher.init(Cipher.DECRYPT_MODE,key,spec);
       byte []decryptBytes  = decryptionCipher.doFinal(messageInBytes);
       return new String(decryptBytes);
    }

    private String encoding(byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }


    private byte[] decoding(String data) {
        return Base64.getDecoder().decode(data);
    }

    public static void main(String[] args) {
        try {
            Encode encode = new Encode();
            encode.init();
            String encryptedMessage = encode.encrypt("Hello World!");
            String decrytedMessage = encode.decrypt(encryptedMessage);

            System.out.println("Encrypted Message = " + encryptedMessage);
            System.out.println("Decryted Message = " + decrytedMessage);
        }catch (Exception ignored){}
    }


}
