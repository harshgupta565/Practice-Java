package Search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int [] arr = {15,20,30,35,40,50};
        int low = 0;
        int high = arr.length-1;
       while(low<=high){
           // use low +(high - low )/2 to avoid overflow conditon
           int mid = (low+high)/2;
           if(arr[mid]== target){
               System.out.println("Element is at "+mid);
               break;
           }
           else if(target > arr[mid] ){
               low = mid+1;
           }
           else{
               high = mid-1;
           }
       }
    }
}
