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
public abstract class Cipher {
    
    public abstract String encode(String plaintext);

    
    
    
    public abstract String decode(String ciphertext);

    
}
