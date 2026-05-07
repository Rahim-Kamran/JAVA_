import java.util.HashMap;

public class tree {
    public static void main(String[] args) {
        HashMap<String, String> treeMap = new HashMap<>();
        treeMap.put("1", "Marshi");
        treeMap.put("2", "Riya");
        treeMap.put("3", "Aman");
        System.out.println(treeMap);
        //get
        System.out.println(treeMap.get("2"));
        //remove
        treeMap.remove("1");
        System.out.println(treeMap);
    }
    
}