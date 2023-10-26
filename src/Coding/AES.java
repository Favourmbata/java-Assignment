package Coding;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.util.Base64;

public class AES {


    private SecretKey key;
    private int kEY_SIZE = 128;
    private Cipher encryptionCipher;
    private int T_LEN = 128;


    public void init() throws Exception {
        KeyGenerator generator =  KeyGenerator.getInstance("AES");
        generator.init(kEY_SIZE);
        key = generator.generateKey();

    }

    public String encrypt(String message) throws Exception{
        byte[] messageInBytes = message.getBytes();
        Cipher encryptionCipher = Cipher.getInstance("AES/GCM/NoPadding");
        encryptionCipher.init(Cipher.ENCRYPT_MODE,key);
        byte[] encryptByte = encryptionCipher.doFinal(messageInBytes);
        return encode(encryptByte);

    }

    public String decrypt(String encryptedMessage)throws Exception{
     byte[]messageInBytes = decode(encryptedMessage);
     Cipher ecryptionCipher = Cipher.getInstance("AES/GCM/NoPadding");
        GCMParameterSpec spec = new GCMParameterSpec(T_LEN,encryptionCipher.getIV());
     ecryptionCipher.init(Cipher.DECRYPT_MODE,key,spec);
       byte []decryptBytes  = ecryptionCipher.doFinal(messageInBytes);
       return new String(decryptBytes);
    }

    private String encode(byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }


    private byte[] decode(String data) {
        return Base64.getDecoder().decode(data);
    }

    public static void main(String[] args) {
        try {
            AES aes = new AES();
           aes .init();
            String encryptedMessage = aes.encrypt("Hello World!");
            String decrytedMessage = aes.decrypt(encryptedMessage);

            System.err.println("Encrypted Message = " + encryptedMessage);
            System.err.println("Decryted Message = " + decrytedMessage);
        }catch (Exception ignored){

        }
    }


}
