import java.util.Scanner;
public class armString {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it is an Armstrong number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int arm=0;
        while(temp > 0){
            int digit = temp % 10;
            arm += digit * digit * digit;
            temp = temp / 10;
        }
        if(num == arm){
            System.out.println(num + " is an armstrong number.");
        } else {
            System.out.println(num + " is not an armstrong number.");
        }
        sc.close();

    }
}
