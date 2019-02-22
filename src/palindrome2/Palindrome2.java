/*
 * Angus Henry
 * 20/02/2019
 * Palindrome2.java
 * This program searches for palindromes in a sentence
 */

package palindrome2;

import java.util.ArrayList;
import java.util.Collections;
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
        ArrayList <String> phrase = new ArrayList();
        ArrayList <String> phrasebackwards = new ArrayList();
        String  sentence, backwards;
        String wordsback = null;
        int pos, numpal;
        numpal = 0;
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
       Collections.addAll (phrasebackwards, backwards);
       
       for (int i = 0; i < backwards.length();){
        int end = i-1;
           if (end == -1){
          System.out.println ("oops");  
        }
        else{
            if (" ".equals(backwards.substring(end,i ))){
            System.out.println(" SPACE! ");
            
        }
            else {
                wordsback += backwards.substring (i,i);
                System.out.println (backwards.substring(i));
            }
           
        }
        
        
        System.out.println (i);
           i++;
               }
       System.out.println (backwards);
       System.out.println (sentence);
       System.out.println (phrasebackwards);
       
    // currently ingnore the if and else statements, what it is checking for is not correct
       if (sentence.equalsIgnoreCase(backwards)) {
            JOptionPane.showMessageDialog(null, "There are " + numpal + " palindromes in " + sentence);
        } else {
            JOptionPane.showMessageDialog(null, "There are no palindromes in " + sentence);
        }
    }
       
}