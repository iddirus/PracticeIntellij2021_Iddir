package controlflow;

import java.util.Scanner;

public class LearnSwitchCase {

    public static void main(String[] args) {
        LearnSwitchCase.getFoodMenu();

    }

    public static void getFoodMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your car serial number");
        int carSerial = input.nextInt();
        String carName;

        switch (carSerial) {
            case 1:
                carName = "BMW";
                break;
            case 2:
                carName = "OPEL";
                break;
            case 3:
                carName = "Mercedes";
                break;
            case 4:
                carName = "Toyota";
                break;
            case 5:
                carName = "honda";
                break;
            case 6:
                carName = "Hyundai";
                break;
            case 7:
                carName = "Audi";
                break;
            case 8:
                carName = "ford";
                break;
            case 9:
                carName = "GMC";
                break;
            case 10:
                carName = "Tata";
                break;
            default:
                carName = "car is unavailable ";
        }

        System.out.println("My favorite car " + carName);
    }
}
