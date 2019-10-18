/**
 * Ben.C
 * Oct 18 2019
 * Asks for 5 names of friends and then displays the second,third, and forth names
 */

package arraypractice2;
   import java.util.Scanner;


public class ArrayPractice2 {

    public static void main(String[] args) {
        //Creates new scanner object
        Scanner keyedInput = new Scanner (System.in);
        
        String [ ] friends = new String [5];
        //asks for the 5 names
        System.out.println("Enter the names of five friends:");
        for (int i = 0; i <= 4; i = i + 1)
        {
            friends[i] = keyedInput.nextLine();
        }
        //Outputs the second,third, and forth names
        System.out.println("The fourth and seventh names listed were:");
        System.out.println("Second: " + friends[1]);
        System.out.println("Third: " + friends[2]);
        System.out.println("Forth: " + friends[3]);  
    }
    
}
