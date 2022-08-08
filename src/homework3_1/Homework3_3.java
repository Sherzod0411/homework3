package homework3_1;

import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Введите целый положителной число(от 0 до 100)=");
        int i = x.nextInt();
        if ( i>100) {
            System.out.println("Вам нужно написат положительное число от 0 до 100");
        } else if (i<=0) {
            System.out.println("Это не положительной число ");
         }else {
            System.out.println("Отлично!");
        }
    }
}
