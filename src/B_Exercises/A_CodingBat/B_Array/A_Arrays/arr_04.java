package B_Exercises.A_CodingBat.B_Array.A_Arrays;

public class arr_04 {
    public static void main(String[] args) {
        arr_04 obj = new arr_04();
        System.out.println(obj.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3})); // true
        System.out.println(obj.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2})); // false
        System.out.println(obj.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3})); // true
    }

    public boolean commonEnd(int[] a, int[] b) {

        if (a[0] == b[0]  || a[a.length-1] == b[b.length-1]){
            return true;
        }
        return false;
    }
}
