public class emp {
    String name;
    int empid;
    float salary;
    char gender;

    emp(String name, int empid, float salary, char gender){
        this.name = name;
        this.empid = empid;
        this.salary = salary;
        this.gender = gender;
    }

    void display(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Gender: " + gender);
    }
    public static void main(String args[]){
        emp e1 = new emp("Rahim", 101, 50000.0f, 'M');
        emp e2 = new emp("Mehnaz", 102, 60000.0f, 'F');
        e1.display();
        System.out.println();
        e2.display();
    }
}