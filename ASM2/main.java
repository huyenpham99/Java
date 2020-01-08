package ASM2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        FoodList foodList = new FoodList();
        foodList.setMenu();
        int choice;
        Scanner sc = new Scanner(System.in);
        for(;;){
            System.out.println("-------------CHOOSE--------------");
            System.out.println("1: Show Food Menu:");
            System.out.println("2: Order Food:");
            System.out.println("3: Show Order Details: ");
            System.out.println("4: Remove Food in OrderList");
            System.out.println("5: Change Amount Food in OrderList");
            System.out.println("6: Exiting Programs");
            System.out.println("Enter number to choice action:\n");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    foodList.showMenu();
                    break;
                case 2:
                    foodList.oderFood();
                    break;
                case 3:
                    foodList.showOrder();
                    break;
                case 4:
                    foodList.removeOrder();
                    break;
                case 5:
                    foodList.changeAmount();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice Please Choose 1-6 !");
            }
        }
    }
}
