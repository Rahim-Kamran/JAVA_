public class static_key {
    int data=50;
    static int m=100;
    static void display(){
        System.out.println("Static method called");
        System.out.println("Value of m: " + m);
    }
    public static void main(String args[]){
        display();
        
    }
}
