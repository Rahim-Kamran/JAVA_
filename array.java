// public class array {
//     //To find the largest element in an array
//     public static void main(String[] args) {
//         int ar[] = {1,2,3,4,5}; 
//         int max = ar[0];
//         int min = ar[0];
//         for(int i=0; i<ar.length; i++){
//             if(ar[i]>max){
//                 max = ar[i];
//             }
//             if(ar[i]<min){
//                 min = ar[i];
//             }
//         }       
//         System.out.println("The largest element in the array is: " + max);
//         System.out.println("The smallest element in the array is: " + min);
    
//     }}

//WAP remove duplicate elements and sum of all the elements in an array
public class array {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,1,2};
        int sum = 0;
        for(int i=0; i<ar.length; i++){
            sum += ar[i];
        }
        System.out.println("The sum of all the elements in the array is: " + sum);
        System.out.print("The unique elements in the array are: ");
        for(int i=0; i<ar.length; i++){
            boolean isDuplicate = false;
            for(int j=0; j<i; j++){
                if(ar[i] == ar[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.print(ar[i] + " ");
            }
        }
    }
}