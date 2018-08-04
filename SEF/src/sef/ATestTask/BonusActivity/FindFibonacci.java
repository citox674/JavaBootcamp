package sef.ATestTask.BonusActivity;

public class FindFibonacci {
    public static void main(String[] args){

        int howManyNumbers = 25;

        long number1 = 0;
        long number2 = 1;
        System.out.println(number1);
        System.out.println(number2);

        for(int i = 0; i<howManyNumbers - 2; i++){
            long numberTemp = number2;
            number2 = number1 + number2;
            number1 = numberTemp;
            System.out.println(number2);
        }

    }

}

