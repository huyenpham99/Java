package DatMonAn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    Food obj = new Food("Vit", 5, 1200);
    ArrayList<Food> menu = new ArrayList<>(Arrays.asList(obj));

    public void showMenu() {
        if (menu.size() == 0) {
            System.out.println("error");
        } else {
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1)
                        + "\n" + "Tên món: " + menu.get(i).getName() + " | Số lượng: " + menu.get(i).getAmount() + " | Giá tiền: " + menu.get(i).getPrice());
            }
        }
    }

    public void foodList() {
        for (int i = 0; i < menu.size(); i++) {
            obj = menu.get(i);
            obj.thongtinmon();
        }
    }

//    private int findNameFood(Food food){
//        return this.menu.indexOf(food);
//    }
//
//    public boolean addFoods(Food food) {
//        if (findNameFood(food) > 0) {
//            System.out.println("Food is already");
//            return false;
//        }
//        menu.add(food);
//        return true;
//    }

    public void addFood() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn đặt món :");
        String ten_monan = sc.nextLine();
        System.out.println("Nhập giá tiền :");
        int giatien = sc.nextInt();
        System.out.println("Bạn muốn thêm bao nhiêu xuât nữa nhỉ ?");
        int soluong = sc.nextInt();
        Food obj = new Food(ten_monan, giatien, soluong);
        menu.add(obj);
        System.out.println("Them thanh cong");
    }

    public void removeFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Nhap ten mon an: ");
        String ten_monan = scanner.nextLine();
        for (int i = 0; i < menu.size(); i++) {
            obj = menu.get(i);
            if (obj.getName().equals(ten_monan)) {
                menu.remove(i);
                System.out.println("Da xoa " + ten_monan + " trong menu.");
            } else {
                System.out.println("Khong tim thay mon " + ten_monan + " trong thuc don.");
            }
        }
    }

    public void changeAmount() {
        for (int i = 0; i < menu.size(); i++) {
            Scanner input = new Scanner(System.in);
            obj = menu.get(i);
            System.out.println("Món ăn đã đặt :");
            String ten_monan = input.nextLine();
            if (obj.getName().equals(ten_monan)) {
                System.out.println("Số lượng bạn muốn thay đổi là :");
                int soluongmoi = input.nextInt();
                obj.setAmount(soluongmoi);
                menu.set(i, obj);
            }
        }
    }
}