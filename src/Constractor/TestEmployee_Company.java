package Constractor;

public class TestEmployee_Company {
    public static void main(String[] args) {
        Employee_Class e1 = new Employee_Class(2564);
        System.out.println(e1.id);
        Employee_Class e2 = new Employee_Class("Zack", "Google");
        System.out.println(e2.name);
        System.out.println(e2.companyName);
        Employee_Class e3 = new Employee_Class();
        e3.updateCompanyBudget(300.58);
        System.out.println(e3.budgetCompany);
       e1.budgetCompany = 5000;
       e1.updateCompanyBudget(450);
        System.out.println();

    }
}
