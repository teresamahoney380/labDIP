package dip.lab2.student.solution1;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
    public static enum ServiceQuality {
           GOOD, FAIR, POOR
    };
 
    public static void main(String[] args) {
        
        TipCalculator tipCalculator =
                new BaggageServiceTipCalculator(
                BaggageServiceTipCalculator.ServiceQuality.FAIR,5);
        
        TipService tipService = new TipService(tipCalculator);
        
        System.out.println("The tip amount is:" +
                tipService.provideTipAmount());
        
        TipCalculator tipCalculator1 =
                new FoodServiceTipCalculator(
                FoodServiceTipCalculator.ServiceQuality.GOOD,100.00);
        
        TipService tipService1 = new TipService(tipCalculator1);
        System.out.println("The tip amount is:" +
                tipService1.provideTipAmount());
        
    }

}
