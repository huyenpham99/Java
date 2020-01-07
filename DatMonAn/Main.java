package DatMonAn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu obj = new Menu();
        int food;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("===================");
            System.out.println("1 - Nhà hàng thêm món vào menu");
            System.out.println("2 - Hiển thị menu");
            System.out.println("3 - Đặt món ");
            System.out.println("4 - Xóa món ăn đã đặt ");
            System.out.println("5 - Thay đổi số lượng món ăn");
            System.out.println("===================");
            System.out.println("Chọn: ");
            food = sc.nextInt();
            switch (food) {
                case 1:
//                    obj.datmon();
                    break;
                case 2:
                    obj.showMenu();
                    break;
                case 3:
                    obj.addFood();
                    obj.foodList();
                    break;
                case 4:
                    obj.removeFood();
                    obj.foodList();
                    break;
                case 5:
                    obj.changeAmount();
                    obj.showMenu();
                    break;
                case 6:
                    System.out.println("Kết thúc đặt món");
                    break;
                default:
                    System.out.println("Không có lựa chọn này, mời bạn nhập lại!");
                    System.out.println("=======================");
            }
        } while (food != 0);

    }
}
