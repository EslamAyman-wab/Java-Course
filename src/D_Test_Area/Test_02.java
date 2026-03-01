package D_Test_Area;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_02 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the numbers");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int temp = in.nextInt();
            if (!list.contains(temp)) {
                list.add(temp);
            }
        }
        System.out.println(list);


//        ArrayList <Integer> list = new ArrayList (Arrays.asList(10,20.30,40));
//        System.out.println(list.contains(10)); // this menthod chek if it has the thing it konten
//        1. With Strings (Text)
//         It checks if a piece of text exists inside another piece of text.
//
//        1 String name = "Java A_Course";
//        2 System.out.println(name.contains("Java")); // Result: true
//        3 System.out.println(name.contains("Python")); // Result: false
//
//        2. With Lists (ArrayList)
//                It checks if a specific item is inside your list.
//
//        1 ArrayList<String> fruits = new ArrayList<>();
//        2 fruits.add("Apple");
//        3 fruits.add("Banana");
//        4
//        5 System.out.println(fruits.contains("Apple")); // Result: true
//        6 System.out.println(fruits.contains("Orange")); // Result: false
//
//        Summary:
//   * Returns: true if it finds it, false if it doesn't.
//                * Easy Rule: Use it whenever you need to check if something exists inside a collection or a string.


//        ArrayList list1 = new ArrayList(Arrays.asList(1, 2));
//        ArrayList list2 = new ArrayList(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 4, 5));
//        list2.retainAll(Arrays.asList(1, 2, 3));
//        System.out.println(list2);

//    retainAll keeps only the elements in a list that are also present in another list.
//    It removes everything else.
//       In your example:
//    list2 starts with: [1, 1, 1, 2, 2, 3, 3, 4, 5]
//    retainAll(Arrays.asList(1, 2, 3)) keeps only 1, 2, and 3
//     Result: [1, 1, 1, 2, 2, 3, 3] (the 4 and 5 are removed)


    }
}
