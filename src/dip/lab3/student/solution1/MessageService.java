/*
 *High Level Message Service Class to input and Output a Message from any type 
 * of input or output device
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Teresa Mahoney
 */
public class MessageService {
    private MessageInput messageInput;
    private MessageOutput messageOutput;

    public MessageService(MessageInput messageInput, MessageOutput messageOutput) {
        this.messageInput = messageInput;
        this.messageOutput = messageOutput;
    }
    
    /**
     * Receive input message from one source
     * display to another source
     */
    public void displayMsg(){
        String message=messageInput.inputMessage();
        messageOutput.outputMessage(message);
    }
}
