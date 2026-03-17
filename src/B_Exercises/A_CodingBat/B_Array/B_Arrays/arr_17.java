package B_Exercises.A_CodingBat.B_Array.B_Arrays;

public class arr_17 {
    public static void main(String[] args) {
        arr_17 obj = new arr_17();
        System.out.println(java.util.Arrays.toString(obj.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
        System.out.println(java.util.Arrays.toString(obj.middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0})));
        System.out.println(java.util.Arrays.toString(obj.middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5})));
    }
    public int [] middleWay(int [] a , int [] b){
        return new int[] {a[1], b[1]};
    }
}
