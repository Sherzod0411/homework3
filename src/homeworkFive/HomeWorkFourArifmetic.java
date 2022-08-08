package homeworkFive;

public class HomeWorkFourArifmetic {
    public static void main(String[] args) {
        float[] arr = {2,3,4,5,7};
        float[] arr1 = {22,33,44,55,66};
        float First = 0;
       float Second = 0;
       for (float j:arr1){
           First+=j;
       }
        System.out.println("Введите ср ариф значения 1го массива ="+First/ arr1.length);
       for(float i :arr){
        Second +=i;

            }
        System.out.println("Введите ср ариф значения 2го массива  = "+Second/ arr.length);
        }




    }

