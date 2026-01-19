import java.time.*;
class Employee{
    private String name;
    private double salary;
    private LocalDate hireday;
    public Employee(String n,double s, int year, int month, int day){
        name= n;
        salary= s;
        hireday= LocalDate.of(year,month,day);
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public LocalDate getHireDay(){
        return hireday;
    }
    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary += raise;
    }
}
public class employee_info{
    public static void main(String[] args){
        Employee[] staff = new Employee[3];
        staff[0]= new Employee("Carl Kacob", 800000,1964,12,1);
        staff[1]= new Employee("Imaad",900000,2007,8,1);
        staff[2]= new Employee("god",1,0,12,1);
        for (Employee e: staff){
            e.raiseSalary(5);
        }
        for (Employee e: staff)
            System.out.println("name=" +e.getName()+",salary="+e.getSalary()+",hireday="+e.getHireDay());

    }
}