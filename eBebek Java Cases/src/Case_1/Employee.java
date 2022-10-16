package Case_1;

public class Employee {
	
    protected String name;
    protected double salary;
    protected int workHours;
    protected int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
    	
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    private double tax(double baseSalary) {
        double tax = 0;
        if (baseSalary > 1000)
            tax = baseSalary * 3 / 100;
        return tax;
    }

    private int bonus(int baseWorkHours) {
        int bonusFee = 0;
        if (baseWorkHours > 40) {
            bonusFee = (baseWorkHours - 40) * 30;
        }
        return bonusFee;
    }

    private double raiseSalary(int baseHireYear) {
        int workYear = (2021 - baseHireYear);
        double raisedSalary;
        double raiseRate;

        if (0 <= workYear && workYear < 10)
            raiseRate = 0.05;
        else if (9 < workYear && workYear < 20)
            raiseRate = 0.10;
        else if(19<workYear)
            raiseRate = 0.15;
        else
        	raiseRate = 0;
        
        raisedSalary = raiseRate * salary + bonus(workHours) - tax(salary);
        return raisedSalary;
    }

    @Override
    public String toString() {
        return          
        		 "Employee Name                 : " + name +
               "\nSalary                        : " + String.format("%.2f",salary )+ " TL" +
               "\nWork hours                    : " + workHours + " Hours" +
               "\nHire Year                     : " + hireYear +
               "\nTax                           : " + String.format("%.2f",tax(salary)) + " TL" +
               "\nBonus                         : " + bonus(workHours) + " TL" +
               "\nSalary Increase(only increase): " + String.format("%.2f",(raiseSalary(hireYear)-bonus(workHours)+tax(salary))) + " TL" +   // maaş zammı yani maaş artışı           
               "\nSalary With Bonus and Tax     : " + String.format("%.2f",raiseSalary(hireYear)) + " TL" + 
               "\nTotal Salary                  : " + String.format("%.2f",(salary + raiseSalary(hireYear))) + " TL"+
               "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

    }
/*    public static void main(String[] args) {
        Employee employee1 = new Employee("Yakup BERBER", 1461, 45, 1996);
        Employee employee2 = new Employee("Halil ERMAN", 900, 55, 2001);
        Employee employee3 = new Employee("Selim KOCAMAN", 1300, 42, 2011);
        Employee employee4 = new Employee("Burhan KAYIM", 1500, 25, 1994);        
        Employee employee5 = new Employee("Cengiz AKIN", 875, 52, 2016);
        
        System.out.println(employee1);  
        System.out.println(employee2); 
        System.out.println(employee3); 
        System.out.println(employee4); 
        System.out.println(employee5); 
   }
*/
}