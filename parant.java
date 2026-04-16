//use super() in child class Constructor
public class parant {
    parant (){
        System.out.println("Parant Constructor");
    }
}
class child extends parant{
    child(){
        super();
        System.out.println("Child Constructor");
    }
    public static void main(String[] args) {
        child c = new child();
    }
}

