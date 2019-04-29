package tim_cipher;

/**
 *
 * @author Tim Barber
 */
public class Vigenere extends Cipher {

    private String pw;

    public Vigenere(String pass) {
        pw = pass;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String encode(String text) {
        int pw_Index = 0;
        String out = text;
        for (int i = 0; i < text.length(); i++) {
            out = out.substring(0, i) + (Character.getNumericValue(out.charAt(i)) + Character.getNumericValue(pw.charAt(pw_Index))) + (i < out.length() - 1 ? out.substring(i + 1) : String.valueOf(out.charAt(i)));
            if (++pw_Index > pw.length()) {
                pw_Index = 0;
            }
        }
        return out;
    }

    @Override
    public String decode(String text) {
        int pw_Index = 0;
        String out = text;
        for (int i = 0; i < text.length(); i++) {
            out = out.substring(0, i) + (Character.getNumericValue(out.charAt(i)) - Character.getNumericValue(pw.charAt(pw_Index))) + (i < out.length() - 1 ? out.substring(i + 1) : String.valueOf(out.charAt(i)));
            if (++pw_Index > pw.length()) {
                pw_Index = 0;
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
