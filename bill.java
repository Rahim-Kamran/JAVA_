import java.util.Scanner;
public class bill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Units: ");
        int Units= sc.nextInt();
        System.out.println("Enter the unit per price: ");
        int Price = sc.nextInt();

        int total = Units * Price;

        int discount = 0;
        if(total >= 1000 && total <=2000){
            discount = (total * 10)/100;
            System.out.println("10% discount: " + discount);
        }else if(total > 2000){
            discount = (total * 20)/100;
            System.out.println("20% discount: " + discount);
        }
        sc.close();




    }
}