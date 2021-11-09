package javaassignment_omilia;

import java.util.Scanner;

/**
 *
 * @author haris
 */
public class JavaAssignment_Omilia
{

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException
    {
        // TODO code application logic here
        System.out.println("Hello, please type in your name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        
        System.out.println("Welcome " + name + "...");
        Thread.sleep(1300);
        
        System.out.println("Please type a sequence of numbers (each between one and three digits): ");      // prompting the user for a specific input
        String num = scan.nextLine();                                                                       // accepting input from user
        Thread.sleep(1000);
        
        NumbersByUser numsByUser = new NumbersByUser();
        String number = numsByUser.inputNumbers(num);                                                       // method called from NumbersByUser class
        if (number == null)
        {
            return;
        }
        boolean valResult = numsByUser.checkNumber(number);                                                 // method called from NumbersByUser class

        System.out.println(number);                                                                         // printing the final result of the given inputs
        if (valResult == true)
        {
            System.out.println("[phone number: VALID]");                                                    // notifying user that restrictions were met and input was ok
        }
        else
        {
            System.out.println("[phone number: INVALID]");                                                  // notifying user that restrictions were not met and input was wrong
        }
    }
}
