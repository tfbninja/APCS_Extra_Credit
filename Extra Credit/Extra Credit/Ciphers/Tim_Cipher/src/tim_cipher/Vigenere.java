package tim_cipher;

/**
 *
 * @author Tim Barber
 */
public class Vigenere extends Cipher {

    private String pw;

    public Vigenere(String pass) {
        pw = pass.toLowerCase();
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw.toLowerCase();
    }

    @Override
    public String encode(String text) {
        int pw_Index = 0;
        String out = "";
        for (int i = 0; i < text.length(); i++) {
            if ((int) text.charAt(i) >= 65 && (int) text.charAt(i) <= 90 || ((int) text.charAt(i) >= 97) && (int) text.charAt(i) <= 122) {
                int n = (int) text.charAt(i);
                boolean low = n >= 97;
                n -= low ? 97 : 65;
                n += 26 * 5;
                n %= 26;
                int p = (int) pw.charAt(pw_Index);
                p -= p >= 97 ? 97 : 65;
                p += 26 * 5;
                p %= 26;
                n += p;
                n %= 26;
                n += (low ? 97 : 65);
                out += String.valueOf((char) n);
                if (++pw_Index > pw.length() - 1) {
                    pw_Index = 0;
                }
            } else {
                out += String.valueOf(text.charAt(i));
            }
        }

        return out;
    }

    @Override
    public String decode(String text) {
        int pw_Index = 0;
        String out = "";
        for (int i = 0; i < text.length(); i++) {
            if ((int) text.charAt(i) >= 65 && (int) text.charAt(i) <= 90 || ((int) text.charAt(i) >= 97) && (int) text.charAt(i) <= 122) {
                int n = (int) text.charAt(i);
                boolean low = n >= 97;
                n -= low ? 97 : 65;
                n += 26 * 5;
                n %= 26;
                int p = (int) pw.charAt(pw_Index);
                p -= p >= 97 ? 97 : 65;
                p += 26 * 5;
                p %= 26;
                n -= p;
                n += 26;
                n %= 26;
                n += low ? 97 : 65;
                out += String.valueOf((char) n);
                if (++pw_Index > pw.length() - 1) {
                    pw_Index = 0;
                }
            } else {
                out += String.valueOf(text.charAt(i));
            }
        }
        return out;
    }

}

/*
 * The MIT License
 *
 * Copyright (c) 2019 Tim Barber.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
