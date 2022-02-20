package Part2;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        //System.out.println(method(giveArgument(),giveArgument()));
        //checkNumber(giveArgument());
        //checkNumberTwo(giveArgument());
        //hello(giveName());
        checkYear(giveArgument());
    }

    static boolean method(int x, int y){
        return x+y>=10 && x+y<=20;
    }

    static int giveArgument(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите аргумент");
        return userInput.nextInt();
    }

    static void checkNumber(int x){
        if (x >=0){
            System.out.println("Число положительно");
        } else System.out.println("Число отрицательное");
    }

    static void checkNumberTwo(int x){
        if (x < 0){
            System.out.println(true);
        }
    }

    static void hello(String name){
        System.out.println("Привет, " + name);
    }

    static String giveName(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите аргумент");
        return userInput.nextLine();
    }

    static void checkYear(int year){
        if ((year % 400 == 0) || (year % 4 == 0) && !(year % 100 == 0)){
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");
    }
}