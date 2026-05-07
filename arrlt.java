import java.util.*;
public class arrlt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //remove
        list.remove(1);
        System.out.println(list);
        //size
        System.out.println(list.size());
        //get
        System.out.println(list.get(0));
        //set
        list.set(0, 10);
        System.out.println(list);
        //contains
        System.out.println(list.contains(10));
        //clear
        list.clear();
        System.out.println(list);
        
    }
}