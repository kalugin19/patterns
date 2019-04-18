package com.company;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class Aes256EncryptionDecorator extends DataSourceDecorator{

    private SecretKey secretKey;

    public Aes256EncryptionDecorator(DataSource wrapper) {
        super(wrapper);
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256);
            this.secretKey = keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public byte[] makeAes(byte[] rawMessage, int cipherMode){
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(cipherMode, this.secretKey);
            return cipher.doFinal(rawMessage);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void writeData(String data) {
        super.writeData(encrypt(data));
    }

    @Override
    public String readData() {
        return decrypt(super.readData());
    }

    private String decrypt(String txt){
        byte[] src = makeAes(txt.getBytes(), Cipher.DECRYPT_MODE);
        return new String(src);
    }

    private String encrypt(String text){
        byte[] shifr = makeAes(text.getBytes(), Cipher.ENCRYPT_MODE);
        return new String(shifr);
    }
}
