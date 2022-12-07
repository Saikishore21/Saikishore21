import java.util.Scanner;
interface Employee
{
  int empId=105119;
  String empName="Saikishore";
  double empSalary=85000.00;
  void getData();
  double calcTax(double empSalary);
  void display();
}
class Information implements Employee
{
  double empTaxSalary;
  public void getData()
  {
    empTaxSalary=calcTax(empSalary);
  }
  public double calcTax(double empSalary)
  {
    empTaxSalary=(empSalary*0.2);
    return empTaxSalary;
  }
  public void display()
  {
    System.out.println("<<<====Employee Details are====>>>>");
    System.out.println("<<<====Employee Id: "+empId+"====>>>");
    System.out.println("<<<====Employee Name: "+empName+"====>>>");
    System.out.println("<<<====Employee Salary: "+empSalary+"====>>>");
    System.out.println("<<<====Total Tax to be paid for the income is: "+empTaxSalary+"====>>>");
  }
}
public class InterfaceInJava 
{
  public static void main(String [] args)
    {
      Information i=new Information();
      i.getData();
      i.display();
    }
}

