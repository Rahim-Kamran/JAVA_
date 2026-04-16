// interface MyFunctionalInterface {
//     void myMethod();
// }

// class HelloProgram {
//     public static void main(String[] args) {

//         // Without Lambda
//         MyFunctionalInterface obj1 = new MyFunctionalInterface() {
//             public void myMethod() {
//                 System.out.println("Hello, World! (without lambda)");
//             }
//         };
//         obj1.myMethod();

//         // With Lambda
//         MyFunctionalInterface obj2 = () -> 
//             System.out.println("Hello, World! (with lambda)");
//         obj2.myMethod();
//     }
// }






// interface Add {
//     int sum(int a, int b);
// }

// class SumProgram {
//     public static void main(String[] args) {

//         // Without Lambda
//         Add add1 = new Add() {
//             public int sum(int a, int b) {
//                 return a + b;
//             }
//         };
//         System.out.println("Sum: " + add1.sum(10, 5));

//         // With Lambda
//         Add add2 = (a, b) -> a + b;
//         System.out.println("Sum: " + add2.sum(10, 5));
//     }
// }

//lamda with array list foreach loop
// import java.util.ArrayList;
// import java.util.List;


// class LambdaExample {
//     public static void main(String[] args) {
//         List<String> names = new ArrayList<>();
//         names.add("Alice");
//         names.add("Bob");
//         names.add("Charlie");

//         // Without Lambda
//         for (String name : names) {
//             System.out.println(name);
//         }

//         // With Lambda
//         names.forEach(name -> System.out.println(name));
//     }
// }

//predicate example
// import java.util.function.Predicate;

// class PredicateExample {
//     public static void main(String[] args) {
//         Predicate<Integer> isEven = n -> n % 2 == 0;

//         System.out.println(isEven.test(4)); // true
//         System.out.println(isEven.test(5)); // false
//     }
// }

//function transformer example
import java.util.function.Function;
class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = s -> s.length();

        System.out.println(stringLength.apply("Hello")); // 5
        System.out.println(stringLength.apply("Lambda")); // 6
    }
}