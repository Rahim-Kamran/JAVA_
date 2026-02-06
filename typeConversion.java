public class typeConversion {
    public static void main(String[] args) {
        // Implicit type conversion (widening)
        int num1 = 10;
        double num2 = num1; // int to double
        System.out.println("Implicit type conversion: " + num2);

        // Explicit type conversion (narrowing)
        double num3 = 9.99;
        int num4 = (int) num3; // double to int
        System.out.println("Explicit type conversion: " + num4);
    }
}
