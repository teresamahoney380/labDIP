package dip.lab1.student.solution1;

/**
 * Change to implement Employee interface and include code pertinent to
 * Salaried Employee only
 *
 * @author Teresa Mahoney
 */
public class SalariedEmployee implements Employee {
    
    private double annualSalary;
    
    /** default constructor. Is this the best way to go? */
    public SalariedEmployee() {}

    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
    
     */
    public SalariedEmployee(double annualSalary) {
        this.annualSalary=annualSalary;
        
    }
     
    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @return
     */
    public double getAnnualSalary() {
        return annualSalary;
    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param annualSalary - think carefully about this
     */
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    

    @Override
    public double getAnnualCompensationForEmployee() {
        return annualSalary;
    }

    
}
