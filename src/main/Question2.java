package main;

import java.util.Scanner;

//Print all duplicate elements.
public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        String copy="";
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        String result="";
        for (int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++){
                if (arr[j]==arr[i]){
                    if(!result.contains(Integer.toString(arr[j]))){
                        result+=Integer.toString(arr[j])+" ";
                    }
                }
            }
        }
        System.out.println(result);
    }
}
