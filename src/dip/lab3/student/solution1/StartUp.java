/*
 * StartUp class for Message Service
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Teresa Mahoney
 */
public class StartUp {
    public static void main(String[] args) {
        
        MessageService messageService;
        
        MessageInput messageInput=new ConsoleInput();
        MessageOutput messageOutput = new ConsoleOutput();
        
        messageService = new MessageService(messageInput, messageOutput);
        messageService.displayMsg();
        
        
    }
    
}
