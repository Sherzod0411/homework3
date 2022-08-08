package homework3_1;

public class Homework3_4 {
    public static void main(String[] args) {
        int number = 7;
        int result = 1;
        int power =1;
        while (power<=15){
            result =number*power;
            System.out.println(number+" умножить на "+power+"="+result);
            power++;
        }
    }
}
