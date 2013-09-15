package dip.lab1.student.solution1;

/**
 * The concrete super class of all employee types. 
 * Change to interface with only methods needing to be used by all employee types
 * Remove all code specific to employee types
 *
 * @author Teresa Mahoney
 */
public interface Employee {
    // You gotta question if these are appropriate for ALL employees?
    

   public abstract double
           getAnnualCompensationForEmployee();
}
