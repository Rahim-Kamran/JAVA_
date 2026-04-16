// public class threedarray {
//     public static void main(String[] args){
//         int[][][] ar = {{{1,2},{3,4}},{{5,6},{7,8}}};
//         for(int i=0; i<2; i++){
//             for(int j=0; j<2; j++){
//                 for(int k=0; k<2; k++){
//                     System.out.print(ar[i][j][k] + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }
// }


import java.util.Scanner;
class threedarray{
    public static void mian(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[][][] = new int[2][2][2];
        System.out.println("Enter elements for 3D array: ");
        for(int i=0; i<2; i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    System.out.println("Element["+i+"]["+j+"]["+k+"]:");
                    arr[i][j][k]=sc.nextInt();
                }
            }
        }
        System.out.println("/nDisplay 3D Array: ");
        for(int i=0; i<2; i++){
            System.out.println("Layer"+i);

            for(int j=0; j<2;j++){
                for(int k=0;k<2;k++){
                    System.out.println(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();

    }
}