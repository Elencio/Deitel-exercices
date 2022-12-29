public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary;

    public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, int mon, int da, int ye, int month1, double rate, double salary){
        super(first, last, ssn, mon, da, ye, month1, sales, rate);
        setBaseSalary(salary);
    }

    public void setBaseSalary(double salary){
        baseSalary = (salary < 0.0)? 0.0: salary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    @Override
    public double earnings(){
        return getBaseSalary()+super.earnings();
    }

    @Override
    public String toString(){
        return String.format("%s %s; %s: $%,.2f", 
        "base-salaried", super.toString(), 
        "base-salary", getBaseSalary() );
    }
}
