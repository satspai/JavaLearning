package org.lessons;

public class SumOfDigits {
    public static void main(String[] args) {
        int number =126;
        int sum=0;
        for (sum=0;number!=0;number=number/10){
            sum = sum + (number % 10);
        }
        System.out.println("Sum of number is : "+ sum);
    }
}
