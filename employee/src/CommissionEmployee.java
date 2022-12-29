public class CommissionEmployee extends Employee {
    private double grossSales;
    private double comissionRate;

    public CommissionEmployee(String first, String last, String ssn, int mon, int da, int ye, int month1, double sales, double rate) {
        super(first, last, ssn, mon, da, ye, month1);
        setGrossSales(sales);
        setCommisionRate(rate);
    }

    public void setCommisionRate(double rate) {
        comissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
    }

    public double getCommisionRate() {
        return comissionRate;
    }

    public void setGrossSales(double sales) {
        grossSales = (sales < 0.0) ? 0.0 : sales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    @Override
    public double earnings() {
        return getCommisionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s: %s \n%s: $%,.2f; %s: %.2f", 
        "commission employee",super.toString(), 
        "gross sales", getGrossSales(), 
        "commission rate", getCommisionRate());
    }
}
