package org.lessons;

public class overloading {
    public static void main(String[] args) {
        calc(2,4);
        calc(1,2,3);
    }
    public static void calc(int a,int b){
        System.out.println(a+b);
    }
    public static void calc(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void calc(int a){
        System.out.println(a);
    }
}
