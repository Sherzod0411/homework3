package homework3_1;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;
//outside temperature
public class Homework_3_1 {
    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
        out.print("Enter the current temperature =");
        int t=x.nextInt();
        out.println(t);
        if (t>30 || t<-30 ) {
            out.println("You can determine the temperature from -30 to 30");
        }else if (t > -5) {
            out.println("Hot");
        } else if (t > -20) {
            out.println("Norm");
        } else {
            out.println("Cool");
        }
    }
}
