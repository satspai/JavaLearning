package org.lessons;

public class Loops {
    public static void main(String[] args) {

//            for (int i=2;i<20;i=2*i) {
//                System.out.println("Value of i is " + i );
//            }

//              for ( int i = 99; i >= 0; i / 9) {
//                System.out.println("Value of i is " + i );
//              }

        int [][] arr = {{10,20,30},{40,50,60}};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }

            /*
            int i=0;
            while (i<=10){
                System.out.println(i);
                i++;
            }

             */
            /*
            int i=0;
            do {
                System.out.println(i);
                i++;
            }
            while (i<=10);
             */
//            int a=10;
//            int b=a++;
//            System.out.println(a);
//            System.out.println(b);



        }


}
