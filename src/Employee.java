public abstract class Employee {

    private String firstname;
    private String lastname;
    private String socialSecurityNumber;
    private int month;
    private int day;
    private int year;
    private int monf;
    private int mES;

    public Employee(String first, String last, String ssn, int mon, int da, int ye, int month1) {
        firstname = first;
        lastname = last;
        socialSecurityNumber = ssn;
        month = checkMonth(mon);
        day = checkDay(da);
        year = ye;

    }

    public void setFirstName(String first) {
        firstname = first;
    }

    public void setLastName(String last) {
        lastname = last;
    }

    public void setSocialSecurityNumber(String ssn) {
        socialSecurityNumber = ssn;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setYe(int ye) {
        year = ye;
    }

    public int getYe() {
        return year;
    }

    public void setMes(int month1) {
        mES = month1;
    }

    public int getMes() {
        return mES;
    }

    public void setMONTH(int monTH) {
        monf = monTH;
    }

    public int getMONTH() {
        return monf;
    }

    private int checkMonth(int mes) {
        if (mes > 0 && mes <= 12)
            return mes;
        else {
            System.out.printf("Invalid month (%d) set 1.", mes);
            return 1;
        }
    }

    private int checkDay(int dia) {

        int[] diames = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (dia > 0 && dia <= diames[month])
            return dia;

        if (month == 2 && dia == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            return dia;

        System.out.printf("Invalid day (%d) set to 1.", dia);
        return 1;
    }

    @Override
    public String toString() {
        return String.format("%s %s\nsocial security number: %s \n%s: %d/%d/%d",
                getFirstName(), getLastName(), getSocialSecurityNumber(), "Dateofbirth", day, month, year);
    }

    public abstract double earnings();
}
