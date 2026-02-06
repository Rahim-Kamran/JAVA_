import java.util.ArrayList;

public class wrapperClass {
    public static void main(String[] args) {
       int a=10;
       int b=20;
       int c=30;
       ArrayList<Integer> list = new ArrayList<>();
       list.add(a);
       list.add(b);
       list.add(c);

       int sum=0;
       for(Integer num : list){
        sum += num;
       }
       System.out.println("Sum: " + sum);
    }
}