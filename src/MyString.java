/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class MyString {

    private String string = null;

    public void append(String string) {
        this.string = string;
    }
    public MyString(String string)
    {
        this.string = string;
    }
    public int numberOfLowerCase() {
        int a = 0;
        for (int i = 0; i < this.string.length(); i++) {
            if (this.string.charAt(i) >= 'a' && this.string.charAt(i) <= 'z') {
                a = a + 1;
            }
        }
        return a;
    }

    public int numberOfUpperCase() {
        int a = 0;
        for (int i = 0; i < this.string.length(); i++) {
            if (this.string.charAt(i) >= 'A' && this.string.charAt(i) <= 'Z') {
                a = a + 1;
            }
        }
        return a;
    }

    public int endSubIndex(String Sub) {
        int f = 0;
        int a = this.string.length();
        int b = Sub.length();

        for (int i = 0; i <= a - b; i++) {
            int j;
            for (j = 0; j < b; j++) {
                if (this.string.charAt(i + j) != Sub.charAt(j)) {
                    break;
                }
            }
            if (j == b) {
                f = i + (b - 1);
                return f;
            }

        }
        return f;
    }

    public int startSubIndex(String Sub) {
        int f = 0;
        int a = this.string.length();
        int b = Sub.length();

        for (int i = 0; i <= a - b; i++) {
            int j;
            for (j = 0; j < b; j++) {
                if (this.string.charAt(i + j) != Sub.charAt(j)) {
                    break;
                }
            }
            if (j == b) {
                f = i;
                return f;
            }

        }
        return f;
    }

    public boolean isNumber() {
        boolean flag = false;
        for (int i = 0; i < this.string.length(); i++) {
            if (this.string.charAt(i) >= '0' && this.string.charAt(i) <= '9') {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public String formatedSpacing(int spaces) {
        String formatedWord = "";
        for (int i = 0; i < this.string.length(); i++) {
            if (this.string.charAt(i) == ' ') {
                for (int j = 0; j < spaces; j++) {
                    formatedWord = formatedWord + " ";
                }
            } else {
                formatedWord = formatedWord + this.string.charAt(i);
            }

        }
        return formatedWord;
    }

    public String formatedLine() {
        String capatalized = "";
        this.string = Task3.ridMultipleBlank(this.string);
        if (this.string.length() > 0) {
            capatalized = (this.string.charAt(0) + "").toUpperCase();
        }
        for (int i = 1; i < this.string.length(); i++) {
            if (this.string.charAt(i - 1) == '.') {
                capatalized = capatalized + (this.string.charAt(i) + "").toUpperCase();

            } else {
                capatalized = capatalized + this.string.charAt(i);
            }
        }
        return capatalized;
    }

    public String toString() {
        return this.string;
    }
}
