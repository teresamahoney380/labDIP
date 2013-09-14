/*
 * Concrete Class to output message to console
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Teresa Mahoney
 */
public class ConsoleOutput implements MessageOutput{

    @Override
    public void outputMessage(String message) {
        System.out.println("This is your message:");
        System.out.println(message);
    }
    
}
