/*
 * Gui output for Message Service
 */
package dip.lab3.student.solution1;
import javax.swing.JOptionPane;
/**
 *
 * @author Terry Mahoney
 */
public class GuiOutput implements MessageOutput{
    

    @Override
    public void outputMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
