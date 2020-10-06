package lesson11;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;


public class Main {
    static Scanner  tt= new Scanner(System.in);
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 6;
        int x2 = 6;
        int y2 = 4;
        System.out.println("Введите координаты точек");
        int x = tt.nextInt();
        int y = tt.nextInt();
        boolean p = x >x1 & x >x2 & y >y2 & y < y1;
        if(p){
        System.out.println(p);
        if p=sqrt((x1-x2)^2+(y1-y2)^2);
        

        double x2 = x1 - Math.sqrt(Math.pow(p, 2) - Math.pow(y1 - y2, 2));




    }
}
