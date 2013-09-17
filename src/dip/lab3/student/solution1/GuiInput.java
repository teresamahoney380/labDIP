/*
 * Gui Input for Message Service
 */
package dip.lab3.student.solution1;
import javax.swing.JOptionPane;
/**
 *
 * @author Teresa Mahoney
 */
public class GuiInput implements MessageInput{

    @Override
    public String inputMessage() {
        return JOptionPane.showInputDialog("Enter Your Name");
    }
    
}
