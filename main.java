abstract class abstraction {
    abstract void daw();
    void display(){
        System.out.println("This is an abstract class");
    }
}
class circle extends abstraction{
    void daw(){
        System.out.println("This is a circle");
    }
}
public class main{
    public static void main(String[] args) {
        circle c = new circle();
        c.daw();
        c.display();
    }
}