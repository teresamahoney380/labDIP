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
        
        MessageInput messageInput=new GuiInput();
        MessageOutput messageOutput = new GuiOutput();
        
        messageService = new MessageService(messageInput, messageOutput);
        messageService.displayMsg();
        
        
    }
    
}
