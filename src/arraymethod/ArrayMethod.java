/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraymethod;

import java.util.Scanner;


public class ArrayMethod {

    public static  int[] getIntegers(){
    int [] values = new int [5];
       Scanner fx = new Scanner(System.in);
       for(int a = 0 ; a < 5;a++){
       System.out.print("ENTER NUMBER:");
        values[a]=fx.nextInt();
       }
    return values;
    }
    public static int[] sortIntegers(){
    int values []= new int[5];
    for (int a = 0 ; a < values.length;a++){
    for (int b = a ; b< values.length;b++){
    if (values[a]>values[b]){}
    }
    }
    return values;
    }
    public static int[] printArray(){
    int values [] = new int [5];
    for (int b= 0;b < values.length;b++){
    System.out.print(values);
    }
    return values;
    }
    public static void main(String[] args) {
    int values[]=new int[5];
    for (int a:values)
            {System.out.print(values);}
    }  
}
