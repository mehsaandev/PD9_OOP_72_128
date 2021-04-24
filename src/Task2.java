/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class Task2 {

    /** This method converts the string to vertical character by character form
     * 
     * @param  normal 1 line String
     * @return converted string to vertical character by character form
     */
    public static String displayVertical(String horizontal) {
        String vertical = null;
        for (int i = 0; i < horizontal.length(); i++) {

            if (i == 0) {
                vertical = horizontal.charAt(i) +"";
            } else {

                vertical = vertical+ "\n" + horizontal.charAt(i) ;
            }
        }
        return vertical;

    }

}
