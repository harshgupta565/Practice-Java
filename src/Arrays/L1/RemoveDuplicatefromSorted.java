package Arrays.L1;


import java.util.*;

public class RemoveDuplicatefromSorted {
    public static void main(String[] args) {
        int [] arr = {10,20,20,30,40,50,50};
        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        System.out.println(set);
    }
}
