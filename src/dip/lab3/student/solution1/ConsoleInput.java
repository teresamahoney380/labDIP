/*
 * Concrete class to input message from consol
 */
package dip.lab3.student.solution1;
import java.util.Scanner;

/**
 *
 * @author Teresa Mahoney
 */
public class ConsoleInput implements MessageInput{
    
    
    @Override
    public String inputMessage() {
        System.out.println("Please enter your Message, then press Enter:");
        Scanner message=new Scanner(System.in);
        return message.nextLine();
    }
    
}
