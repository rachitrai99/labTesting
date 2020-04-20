package main;
// Print the index fo required element from an array.
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(arr[i]==num)
                System.out.print((i)+" ");
        }
    }
}
