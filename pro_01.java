package Class;

class Employee{
    int id;
    int salary;
    String name;

    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("and my name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}
class EmpDetails{
    int id;
    String name;
    int age;
    int Salary;
    public void printEmpDetails(){
        System.out.println("Emp id - "+id);
        System.out.println("Emp name - "+name);
        System.out.println("Emp age - "+age);
        System.out.println("Emp Salary - "+Salary);

    }
}
public class pro_01 {
    public static void main(String[] args) {
        System.out.println("This is our Custom Class");
Employee emp = new Employee();  //Instantiating a new Employee Object
Employee emp2 = new Employee();
EmpDetails EmpD = new EmpDetails();
//Setting Attributes for emp1
    emp.id=20;
    emp.salary=50000;
    emp.name="Sunny";

//Setting Attributes for emp2
    emp2.id=30;
    emp2.salary=55000;
    emp2.name="Rishi";

//    setting info
        EmpD.id = 121;
        EmpD.name = "Ryan Goyal";
        EmpD.age = 23;
        EmpD.Salary = 60000;
//    Printing the Attributes
        emp.printDetails();
        System.out.println(emp.getSalary());
        emp.getSalary();

        emp2.printDetails();

//        print info
        System.out.println("EMPLOYEE INFO");
        EmpD.printEmpDetails();
//        System.out.println(emp.id);
//        System.out.println(emp.name);
    }
}
