package controlflow;

import java.util.Scanner;

public class LearnIfElseIf {

    public static void main(String[] args) {
        LearnIfElseIf.getAge();
        LearnIfElseIf.getAge1();
        LearnIfElseIf.getAge2();
        LearnIfElseIf lf= new LearnIfElseIf();
        lf.getAge3();

    }

    public static void getAge() {
        int age = 45;
        String gender = "male";

        if (age > 42 && gender != "female") {
            System.out.println("you are good enough");

        } else if (age == 45 || gender == "male") {
            System.out.println("you are a male");
        } else {
            System.out.println("you are not a male");
        }
        System.out.println("**************************************");
    }


    public static void getAge1() {
        int age = 45;
        String gender = "male";

        if (age < 42 && gender != "female") {
            System.out.println("you are good enough");

        } else if (age == 45 || gender == "male") {
            System.out.println("you are a male");
        } else {
            System.out.println("you are not a male");
        }
        System.out.println("*****************************************");
    }

    public static void getAge2() {
        int age = 45;
        String gender = "male";

        if (age < 42 && gender != "female") {
            System.out.println("you are good enough");

        } else if (age == 40 && gender == "male") {
            System.out.println("you are a male");
        } else {
            System.out.println("you are not a male");
        }

    }

    public void getAge3(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter your age ");
        double age = in.nextDouble();
        //double  age = 80;
        if (age >= 28 && age<=40 ) {
            System.out.println("your age is more than 28");
        } else if (age>=40 && age <=50) {
            System.out.println("your age is more than 40");
        }else if (age>=50 && age<=60){
            System.out.println("your age is more than 50");
        } else if (age>=60 && age<=70){
            System.out.println("your age is more than 60");
        }else if (age>=70 && age <=80){
            System.out.println("your age is more than 70");
        } else {
            System.out.println("it is your retirement time ");
        }


        }
    }



