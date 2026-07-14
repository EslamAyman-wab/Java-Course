package Rebild.A_Course.A_Challenges.C_Ch.Ch_26;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(list1.size(), 40);
        // .add is to add any thinge to the arry list
        System.out.println(list1);

        ArrayList <Integer> list2 = new ArrayList<>();


        list2.add(55);
        list2.addAll(Arrays.asList(66,77,88,99));
        // Arrays.aslist  make the group of integers as list

        System.out.println(list2);
    }

    public boolean firstLast6 (int[] nums){
        if (nums[0] ==6 || nums[nums.length-1] ==6){
            return true;
        }
        return false;
    }
}
