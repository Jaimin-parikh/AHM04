import java.util.Scanner;
public class MaxFromArray {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner read = new Scanner(System.in);
        System.out.println("Fill up the array with Integers: ");
        for(int i=0 ; i<6;i++){
            arr[i] = read.nextInt();
        }
        read.close();
        int max = arr[0];
        for(int k : arr){
            if(k>max)   
            max = k;
        }
        System.out.println("Maximum number is: "+max);
    }

}