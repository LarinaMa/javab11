package Constractor;

public class Employee_Class {
    String  name, companyName;
    double budgetCompany = 100000;
    int id;
    public Employee_Class(){
        System.out.println("This is no argument constructor");
    }
    public Employee_Class(String newName, String newCompanyName){
       this.name = newName;
       this.companyName = newCompanyName;
        System.out.println("This is two argument constructor");
    }
    public void updateCompanyBudget(double expences){
        budgetCompany -= expences;
        System.out.println("The budget of the company is now: "+budgetCompany);
    }
    public Employee_Class(int newID){
        this.id = newID;
        System.out.println("This is one argument constructor");
    }

    public Employee_Class(double budgetCompany) {
        this.budgetCompany = budgetCompany;

    }
}
