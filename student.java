public class student {
    String studentName;
    int studentID;
    float studentGrade;
    void display() {
        System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentID);
        System.out.println("Grade: " + studentGrade);
    }
    public static void main(String[] args) {
        student stu = new student();
        stu.studentName = "Rahim";
        stu.studentID = 101;
        stu.studentGrade = 89.5f;
        stu.display();
    }
}