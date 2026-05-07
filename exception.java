// Arthmetic exception
// public class exception {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;
//         try {
//             int c = a / b; 
//             System.out.println("Result: " + c);
//         } catch (ArithmeticException e) {
//             System.out.println("Error: Cannot divide by zero.");
//         }
//     }
// }

//accesing invalid index of array
// public class exception {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         try {
//             System.out.println(arr[10]);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Error: Array index out of bounds.");
//         }
//     }
// }

// Null reference exception
public class exception {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Null reference.");
        }
    }
}


