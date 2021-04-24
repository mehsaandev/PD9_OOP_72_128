/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class Task4 {

    public static int NumberOfLowerCase(String A) {
        int a = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) >= 'a' && A.charAt(i) <= 'z') {
                a = a + 1;
            }
        }
        return a;
    }

    public static int NumberOfUpperCase(String A) {
        int a = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) >= 'A' && A.charAt(i) <= 'Z') {
                a = a + 1;
            }
        }
        return a;
    }

    public static int EndIndex(String A, String Sub) {
        int f = 0;
        int a = A.length();
        int b = Sub.length();

        for (int i = 0; i <= a - b; i++) {
            int j;
            for (j = 0; j < b; j++) {
                if (A.charAt(i + j) != Sub.charAt(j)) {
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

    public static int StartIndex(String A, String Sub) {
        int f = 0;
        int a = A.length();
        int b = Sub.length();

        for (int i = 0; i <= a - b; i++) {
            int j;
            for (j = 0; j < b; j++) {
                if (A.charAt(i + j) != Sub.charAt(j)) {
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

    public static String formatedSpacing(String words, int spaces) {
        String formatedWord = "";
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ' ') {
                for (int j = 0; j < spaces; j++) {
                    formatedWord = formatedWord + " ";
                }
            } else {
                formatedWord = formatedWord + words.charAt(i);
            }

        }
        return formatedWord;
    }

    public static String catpitalFirstCharOfLine(String line) {
        String capatalized = "";
        line = Task3.ridMultipleBlank(line);
        if (line.length() > 0) {
            capatalized = (line.charAt(0) + "").toUpperCase();
        }
        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i - 1) == '.') {
                capatalized = capatalized + (line.charAt(i) + "").toUpperCase();

            } else {
                capatalized = capatalized  + line.charAt(i);
            }
        }
        return capatalized;
    }
}
