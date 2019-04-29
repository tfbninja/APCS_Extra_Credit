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
public class SkipCipher extends Cipher {
    int skip;
    int bypass;

    public SkipCipher(int skip, int bypass) {
        this.skip = skip;
        this.bypass = bypass;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public int getBypass() {
        return bypass;
    }

    public void setBypass(int bypass) {
        this.bypass = bypass;
    }
    
    @Override
    public String encode(String s) {
        String coded = s;
        return coded;
    }

    @Override
    public String decode(String s) {
//        String decoded = "";
//        int index =0;
//        do {
//            
//        } 
//        return "";
    }
    
}
