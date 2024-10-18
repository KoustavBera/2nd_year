

import java.util.Scanner;
/** 
 * Find maximum and minimum
 * 
 * Intuition: we believe that function recursionMaxMin() will send us the min max of the array
 * with out checking the last element of the array(arr[idx]). Our work is to compare this last element(arr[idx]) with
 * min and max --> if arr[idx]<min then the new min is arr[idx], if arr[idx]>max the new max is arr[idx]
 */
/**
 * problem2
 */
public class problem2 {

    public static void main(String[] args) {
        System.out.println("Find the maximum and minimum");
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
      MinMax minmax= recursionMaxMin(arr,arr.length-1,arr[0],arr[0]);
      System.out.println("Min="+minmax.min);
      System.out.println("max="+minmax.max);
       
    }
    static class MinMax{
        int min;
        int max;
        MinMax(int min,int max){
            this.min=min;
            this.max=max;
        }
    }
    private static MinMax recursionMaxMin(int[] arr,int idx,int min,int max) {
       if(idx<0){
return new MinMax(0, 0);
       }
       if(idx==0){
        return new MinMax(min, max);
       }

       if(arr[idx]>max){
        max=arr[idx];
       }
       if(arr[idx]<min){
        min=arr[idx];
       }
     
      
       return  recursionMaxMin(arr, idx-1,min,max);
    }
    }
