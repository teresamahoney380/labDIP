/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author Owner
 */
public class  SalariedPlusBonusEmployee implements Employee{
    private double annualSalary;
    private double annualBonus;

    /** default constructor. Is this the best way to go? */
    public SalariedPlusBonusEmployee() {}

    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedPlusBonusEmployee(double annualSalary, double annualBonus) {
        this.annualSalary=annualSalary;
        this.annualBonus=annualBonus;
    }
     public double getAnnualBonus() {
        return annualBonus;
    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param annualBonus -- think carefully about this
     */
    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
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
        return annualSalary+annualBonus;
    }
    
}

