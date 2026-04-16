public class varibale_argument {
    static void fun(int...a){
        System.out.println("Number of arguments: " + a.length);
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();  
    }
    public static void main(String[] args) {
        fun(1, 2, 3);
        fun(4, 5);
        fun();
    }
}
