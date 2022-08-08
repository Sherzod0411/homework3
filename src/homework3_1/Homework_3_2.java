package homework3_1;

import java.util.Scanner;

public class Homework_3_2 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("What symbol of the rainbow do you want to know?");
        int rainbow = r.nextInt(8);
        switch (rainbow) {
            case 1 -> System.out.println("Red");
            case 2 -> System.out.println("Orange");
            case 3 -> System.out.println("Yellow");
            case 4 -> System.out.println("Green");
            case 5 -> System.out.println("Blue");
            case 6 -> System.out.println("Indigo");
            case 7 -> System.out.println("Violet");
            default -> {
            }
        }
        System.out.println();
        System.out.println("==============");
            System.out.println("If you have an error, you should write from 1 to 7, because there are 7 colors in the rainbow");
        }
    }


