/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment_omilia;

/**
 *
 * @author haris
 */
public class NumbersByUser                                                                                    // a separate class that contains all the methods needed for accepting,
{                                                                                                             // checking and validating user inputs

    public String inputNumbers(String num)
    {
        String specialCharacters = "!#$%&'()*+,-./:;<=>?@[]^_`{|}";
        boolean found;
        for (int j = 0; j < specialCharacters.length(); j++)                                                  // checking input validity for avoiding special characters
        {
            if (num.contains(Character.toString(specialCharacters.charAt(j))))
            {
                found = true;
                System.out.println("Attention, please type a valid number sequence with no special characters!");
                return null;
            }
        }

        String[] input = num.split(" ");
        for (int i = 0; i < input.length; i++)                                                                // checking input validity for specific size of numbers typed
        {
            if (input[i].length() < 1 || input[i].length() > 3)
            {
                System.out.println("Attention, please type a valid number sequence"
                        + "(each number between one and three digits)!");
                return null;
            }
        }

        String endStr = "";
        for (int k = 0; k < input.length; k++)                                                                 // concatenating all given numbers to one whole number
        {
            endStr = endStr + input[k];
        }
        return endStr;
    }

    
    
    
    public boolean checkNumber(String endStr)
    {
        boolean valid = false;
        if (endStr.length() == 10)                                                                              // 1a. checking if the produced number has the appropriate size
        {
            if ((endStr.charAt(0) == '2') || (endStr.charAt(0) == '6' && endStr.charAt(1) == '9'))              // 1b. making sure that the number starts with the correct combination of digits
            {
                valid = true;
            }
        }
        if (endStr.length() == 14)                                                                              // 2a. checking if the produced number has the appropriate size
        {
            if ((endStr.charAt(0) == '0' && endStr.charAt(1) == '0' && endStr.charAt(2) == '3'                  // 2b. making sure that the number starts with the correct combination of digits
                    && endStr.charAt(3) == '0' && endStr.charAt(4) == '2') || (endStr.charAt(0)
                    == '0' && endStr.charAt(1) == '0' && endStr.charAt(2) == '3' && endStr.charAt(3)
                    == '0' && endStr.charAt(4) == '6' && endStr.charAt(5) == '9'))
            {
                valid = true;
            }
        }
        return valid;
    }

}
