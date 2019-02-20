/*
 * Angus Henry
 * 20/02/2019
 * Palindrome2.java
 * This program searches for palindromes in a sentence
 */

package palindrome2;

import javax.swing.JOptionPane;

/**
 *
 * @author anhen3335
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String  sentence, backwards;
        int pos, space;
        // get sentence 
        sentence = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a words is a palindrome.\n\n"
                + "Enter a sentence(Please do not include punctuation marks):");
    //Reverse the word
       backwards = "";
       for (pos = sentence.length() - 1; pos >= 0; pos--) {
            backwards += sentence.charAt(pos);
        }
       System.out.println (backwards);
       System.out.println (sentence);
    }
       
}