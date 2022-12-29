
public class PayrollSystemTest {
    public static void main(String[] args) throws Exception {

        SalariedEmployee salaryEmployee = new SalariedEmployee("John", "Smith", "111-11-111", 07, 7, 1964, 07, 800.0);
        HourlyEmployee hourlyemployee = new HourlyEmployee("Karen", "Price", "222-22-222", 8, 9, 1974, 8, 16.75, 40);

        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-333", 07, 23, 1992, 07,
                10000, .06);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis",
                "444-44-444", 10, 04, 05, 1985, 04, .04, 300);

        System.out.println("Employees processed individually:\n");

        System.out.printf("%s\n%s: $%,.2f\n\n", salaryEmployee, "earned:", salaryEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyemployee, "earned:", hourlyemployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "earned:", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned:",
                basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];

        employees[0] = salaryEmployee;
        employees[1] = hourlyemployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employees proceed polymorphically");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("New base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary());

                if (employee.getMes() == employee.getMONTH()) {

                   employee.setBaseSalary(100 + employee.getBaseSalary());
                   System.out.println("You are in your month, We added 100.");
                      
                }
            }

            if (currentEmployee instanceof SalariedEmployee) {
                SalariedEmployee employee = (SalariedEmployee) currentEmployee;

                if (employee.getMes() == employee.getMONTH()) {

                   employee.setWeeklySalary(100 + employee.getWeelySalary());
                   System.out.println("You are in your month, We added 100.");
                      
                }
            }
           

            System.out.printf("earned: $%,.2f\n\n", currentEmployee.earnings());
        }

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s\n", j, employees[j].getClass().getName());
        }

    }
}
