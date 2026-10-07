import java.util.Calendar;
import java.util.GregorianCalendar;
public class Manager extends Employee{
    private String secretaryName;
    
    public Manager(String name, double salary,
    int day, int month, int year) {
        super(name, salary, day, month, year);
        secretaryName = "";
    }

    @Override
    public void raiseSalary(double byPercent) {
        GregorianCalendar today = new GregorianCalendar();
        int currentYear = today.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    public static void main(String[] args) {
        Manager m = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        Employee e = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        System.out.println(m.compare(e));
    }
}