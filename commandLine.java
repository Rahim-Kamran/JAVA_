public class commandLine {
    // public static void main(String[] args){
    //     System.out.println("First argument: " +args[0]);
    //     System.out.println("Second argument: " +args[1]);
    //     System.out.println("Sum of arguments: " +(Integer.parseInt(args[0]) + Integer.parseInt(args[1])));




    //Take student marks are recived form the user in String format and convert it into integer values, calculate the total and percentage, and display the result.
    public static void main(String[] args){
        String strMarks1 = args[0];
        String strMarks2 = args[1];
        String strMarks3 = args[2];
        int marks1 = Integer.parseInt(strMarks1);
        int marks2 = Integer.parseInt(strMarks2);
        int marks3 = Integer.parseInt(strMarks3);
        int total = marks1 + marks2 + marks3;
        double percentage = (total / 300.0) * 100;
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

    }
    }

