public class autoAndunboing {
    public static void main(String[] args)
    {
        int a = 10;
        Integer obj = a; // Auto-boxing: converting int to Integer
        int b = obj; // Unboxing: converting Integer back to int

        System.out.println("Auto-boxing: " + obj);
        System.out.println("Unboxing: " + b);
    }
}
