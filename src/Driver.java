/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ahsan
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.print("Hello World!");
//        System.out.print("I am Abdullah and Ehsan is my team mate");
        Scanner read = new Scanner(System.in);
        String select = "";
        String input = null;
        while (!select.equals("0")) {
            select = JOptionPane.showInputDialog(null, "1.   Test World Counter\n\n"
                    + "2.   Test Vowel Counter\n\n"
                    + "3.   Test Punctuation Counter\n\n"
                    + "4.   Test Sub-String Finder\n\n"
                    + "5.   Test Display Vertical\n\n"
                    + "6.   Test Rid Multiple Blanks\n\n"
                    + "7.   Test Remove Integer\n\n"
                    + "8.   Test String Encryption\n\n"
                    + "9.   Go to MyString Tests\n\n"
                    + "0.   Exit");
            switch (select) {
                case "1":
                    input = JOptionPane.showInputDialog(null, "Enter Statement to check number of words");
                    JOptionPane.showMessageDialog(null, "Number of words in \n\"" + input + "\" are: " + Task1.WordsCounter(input));
                    break;
                case "2":
                    input = null;
                    input = JOptionPane.showInputDialog(null, "Enter Statement to check number of Vowels in Statement/Words");
                    JOptionPane.showMessageDialog(null, "Number of Vowels in \n\"" + input + "\" are: " + Task1.VowelCounter(input));
                    break;
                case "3":
                    input = null;
                    input = JOptionPane.showInputDialog(null, "Enter Statement to check number of Puntuation in Statement");
                    JOptionPane.showMessageDialog(null, "Number of Punctuations in \n\"" + input + "\" are: " + Task1.PunctuationCount(input));
                    break;
                case "4":
                    input = null;
                    input = JOptionPane.showInputDialog(null, "Enter the main String");
                    String sub = JOptionPane.showInputDialog(null, "Enter the sub String");
                    if (Task1.FindSubString(input, sub) == true) {
                        JOptionPane.showMessageDialog(null, "\"" + sub + "\" is found in string \"" + input + "\"");
                    } else {
                        JOptionPane.showMessageDialog(null, "\"" + sub + "\" is not found in string \"" + input + "\"");
                    }
                    break;
                case "5":
                    input = null;
                    input = JOptionPane.showInputDialog(null, "Enter the String to display it vertical");
                    JOptionPane.showMessageDialog(null, "Vertical String is:\n" + Task2.displayVertical(input));
                    break;
                case "6":
                    input = null;
                    input = JOptionPane.showInputDialog(null, "Enter the String to get the removed multiple blank spaces String");
                    JOptionPane.showMessageDialog(null, "String with removed extra blank spaces is:\n" + Task3.ridMultipleBlank(input));
                    break;
                case "7":
                    input = null;
                    input = JOptionPane.showInputDialog(null, "Enter the String to get the String with no removed integers ");
                    JOptionPane.showMessageDialog(null, "String with removed integers is:\n" + Task3.removeInteger(input));
                    break;
                case "8":
                    input = null;
                    input = JOptionPane.showInputDialog(null, "Enter the String to encrypt it");
                    JOptionPane.showMessageDialog(null, "Encrypted String is:\n" + Task3.stringEncryption(input));
                    break;
                case "9":
                    String selectMy = "";
                    input = null;
                    input = JOptionPane.showInputDialog(null, "Enter the String to perform operations on:");
                    MyString string = new MyString(input);
                    while (!selectMy.equals("0")) {
                        selectMy = JOptionPane.showInputDialog(null, "1.   Test Number of Lower Case Letters\n\n"
                                + "2.   Test Number of Upper Case Letters\n\n"
                                + "3.   Test get End index of Sub-String\n\n"
                                + "4.   Test get Start index of Sub-String\n\n"
                                + "5.   Test the number check of String\n\n"
                                + "6.   Test given words spacing\n\n"
                                + "7.   Test Format line\n\n"
                                + "8.   Change the String Without Changing the object\n\n"
                                + "0.   Exit");
                        switch (selectMy) {
                            case "1":
                                JOptionPane.showMessageDialog(null, "Number of Lower Case Letters in\n\"" + string + "\"  are: " + (string.numberOfLowerCase()));
                                break;
                            case "2":
                                JOptionPane.showMessageDialog(null, "Number of Upper Case Letters in\n\"" + string + "\"  are: " + string.numberOfUpperCase());
                                break;
                            case "3":
                                input = null;
                                input = JOptionPane.showInputDialog(null, "Enter the value of substring");
                                JOptionPane.showMessageDialog(null, "End Index of Substring  \n\"" + input + "\" in the String " + string + " is: " + string.endSubIndex(input));
                                break;
                            case "4":
                                input = null;
                                input = JOptionPane.showInputDialog(null, "Enter the value of substring");
                                JOptionPane.showMessageDialog(null, "Start Index of Substring  \n\"" + input + "\" in the String " + string + " is: " + string.startSubIndex(input));
                                break;
                            case "5":
                                if (string.isNumber() == true) {
                                    JOptionPane.showMessageDialog(null, "String is a Number");

                                } else {
                                    JOptionPane.showMessageDialog(null, "Start is not a Number");
                                }
                                break;
                            case "6":
                                input = null;
                                boolean flag = false;
                                while (flag == false) {
                                    input = JOptionPane.showInputDialog(null, "Enter the number of spaces you want between words");
                                    try {
                                        int index = Integer.parseInt(input);
                                        JOptionPane.showMessageDialog(null, "String after applying the given spaces:\n" + string.formatedSpacing(index));
                                        flag = true;
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "Invalid input");
                                    }
                                }

                                break;

                            case "7":
                                JOptionPane.showMessageDialog(null, "1-Formated Line Capitalize thhe First Character of the line\n"
                                        + "2- It Removes the extra spacing between words\n"
                                        + "3- it capitalize the first character of every line after \".\"\n So the formatted String is:\n\n" + string.formatedLine());
                                break;
                            case "8":
                                input = null;
                                input = JOptionPane.showInputDialog(null, "Enter String to Edit");
                                string.append(input);
                                break;
                            case "0":
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Invalid input");
                        }
                    }
                    break;
                case "0":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input");
                    break;

            }
        }
    }
}
