package controlflow;

import java.util.Scanner;

public class LearnIfElse {


    // if condition id true then execute if block of code
    // if condition is false then it will not execute if block of code
    public static void main(String[] args) {
        int age = 25;
        if (age == 26) {

            System.out.println("your age is 25");
        }
        System.out.println("*******************if condition true**********");
        if (age > 20) {
            System.out.println("your age is more than 25");
        }
        System.out.println("*******************if condition false*****");
        String carBrand = "BMW";
        if (carBrand == "Meercedes") {
            System.out.println("you car brand is BMW");
        } else {
            System.out.println("yor car brand is not BMW");
        }

        LearnIfElse.getvoteAge();

    }

    public static void getvoteAge(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age please");
        int voteAge=input.nextInt();
        System.out.println("you are eligible for vote");

    }
}





