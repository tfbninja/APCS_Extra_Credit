/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ciphers;

/**
 *
 * @author wkranz
 */
public class VigenereCipher extends Cipher{
    String key;

    public VigenereCipher(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    
    @Override
    public String encode(String plaintext) {
        String ciphertext = "";

        return ciphertext;
    }

    @Override
    public String decode(String ciphertext) {
        String plaintext = "";

        return plaintext;
    }

    
}
