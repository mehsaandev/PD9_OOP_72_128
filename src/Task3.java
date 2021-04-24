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

    public static String removeInteger(String s) {
        String convertedString = "";
        for (int i = 0; i < s.length(); i++) {

            if (!(s.charAt(i)>='0' && s.charAt(i) <= '9')) {
                convertedString = convertedString + s.charAt(i);
            }
        }
    return convertedString ;
    }
}
