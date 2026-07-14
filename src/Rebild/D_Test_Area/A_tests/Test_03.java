package Rebild.D_Test_Area.A_tests;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_03 {

    static void displayMenu() {
        System.out.println();
        System.out.println(
                "1. Add element\n" +
                        "2. Remove element\n" +
                        "3. Print elements\n" +
                        "4. Exit"
        );
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    //Add
                    System.out.println("Enter an integer: ");
                    list.add(in.nextInt());
                    System.out.println("Element added");
                    break;

                case 2:
                    System.out.println("Enter a number to be deleted: ");
                    int element = in.nextInt();
                    if (list.contains(element)) {
                        list.remove((Integer) element);
                        System.out.println("Element Removed");
                    } else
                        System.out.println("Element not found");
                    break;

                case 3:
                    System.out.println(list);
                    break;
                case 4:
                    return;
            }
        }
    }

}
