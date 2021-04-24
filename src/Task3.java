/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class Task3 {

    /** This method remove the multiple blank spaces from the String
    * 
    * @param s unremoved extra blank spaces string
    * @return removed extra blank spaces string
    */
    public static String ridMultipleBlank(String s) {
        String convertedString = null;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {

                convertedString = s.charAt(i) + "";
            } else {

                if (!(s.charAt(i) == ' ' && s.charAt(i - 1) == ' ')) {

                    convertedString = convertedString + s.charAt(i);
                }
            }
        }
        return convertedString;
    }
    /**
     * This Method remove the integer numbers from the String
     * @param s unremoved integer number string
     * @return removed integer number string
     */
    public static String removeInteger(String s) {
        String convertedString = "";
        for (int i = 0; i < s.length(); i++) {

            if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                convertedString = convertedString + s.charAt(i);
            }
        }
        return convertedString;
    }
    /**
     * This Method Encrypts the String depending upon the number of character in a string and the ASCII of the character
     * @param s string to be encrypted
     * @return encrypted string
     */
    public static String stringEncryption(String s) {
        String encryptedString = "";
        for (int i = 0; i < s.length(); i++) {
            encryptedString = encryptedString + ((char)(s.charAt(i)+(7+(i-(i*2)))));
        }
        return encryptedString;
    }
}