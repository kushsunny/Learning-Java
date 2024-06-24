//Day - 02
package Class;

class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    };
    public String getName(){
        return name;
    };
    public void setName(String n){
      name = n;
    };
}
public class pro_02 {
    public static void main(String args[]){
    Employee1 emp = new Employee1();
    emp.setName("Sunny Kushwaha");
        System.out.println(emp.getName());
        emp.salary=120000;
        System.out.println(emp.getName() +" Salary = "+emp.getSalary());
//    emp.getName();
    }
}
