package ajp;

public class Conditional {
    public static void main(String[] args) {
        int num1 = 440;
        int num2 = 60;
        int num3 = 40;
        int max;
        if (num1>=num2 && num1>=num3){
          max = num1;
        }
        else if (num2>=num3){
        max = num2;
        }
        else{
            max = num3;
        }
        System.out.println(max + " is a largest number");

    }
}