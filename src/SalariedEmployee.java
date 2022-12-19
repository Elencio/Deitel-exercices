public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String first, String last, String ssn,int mon, int da, int ye, int month1, double salary){
        super(first, last, ssn, mon, da, ye, month1);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary){
        weeklySalary = salary< 0.0? 0.0: salary;
    }

    public double getWeelySalary(){
        return weeklySalary;
    }

    @Override
    public double earnings(){
        return getWeelySalary();
    }

    @Override
    public String toString(){
        return String.format("salaried employee: %s\n %s: $%,.2f",
        super.toString(), "weekly salary", getWeelySalary());
    }
}
