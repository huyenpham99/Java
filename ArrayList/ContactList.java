import PhoneNumbers.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactList {
    String name;
    String numberphone;
    static List<ContactList> contact = new ArrayList<>();

    public ContactList(String name, String numberphone) {
        this.name = name;
        this.numberphone = numberphone;
    }

    public ContactList() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberphone() {
        return numberphone;
    }


    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;

    }

    public void addcontactList(String name, String numberphone) {

        contact.add(new ContactList(name, numberphone));
    }

    public void updateContact(int index, String name, String numberphone) {
        contact.set(index, new ContactList(name, numberphone));
        System.out.println("Updated!");
        System.out.println("name" + (index + 1) + " " + name);
    }

    public void removeContact(int index) {
        contact.remove(index);

    }


    public void display() {
        System.out.println("You have" + contact.size() + "items in list");
        for (int i = 0; i < contact.size(); i++) {
            System.out.println("Users:" + (i + 1) + contact.get(i).getName());
            System.out.println("\t" + (i + 1) + contact.get(i).getNumberphone());
        }
    }

    public static void main(String[] args) {
        ContactList obj = new ContactList();
//        System.out.println("List Users:");
        obj.addcontactList("Huyen", "0377073565");
        obj.addcontactList("Lam", "01233333332");
        obj.addcontactList("Yen", "05404807");
        obj.removeContact(0);
        obj.updateContact(0, "Linh", "00546400");
        obj.updateContact(1, "nhung", "48087");
        System.out.println("Available Option:");
        System.out.println("Press:");
        System.out.println("0-To shutdown");
        System.out.println("1-To print contact");
        System.out.println("2-To add ");
        System.out.println("3-To update");
        System.out.println("4-To remove");
        System.out.println("5-To search");
        System.out.println("6-To print all option");
        int chose;
        Scanner input = new Scanner(System.in);
        System.out.println("Your Chose:");
        chose = input.nextInt();

        switch (chose) {
            case 0:

                System.out.println("0-To shutdown");
                break;
            case 1:
                System.out.println("1-To print contact");
                obj.display();
                break;
            case 2:
                System.out.println("2-To add ");
                System.out.println("Moi ban nhap ten va sdt users:");
                obj.addcontactList(input.next(), input.next());
                obj.display();
                break;
            case 3:
                System.out.println("3-To update");
                System.out.println("Moi ban nhap thong tin can update gom co index, name, sdt:");
                obj.updateContact(input.nextInt(), input.next(), input.next());
                obj.display();
                break;
            case 4:
                System.out.println("4-To remove");
                System.out.println("Moi ban nhap thong tin can remove: index");
                obj.removeContact(input.nextInt());
                obj.display();
                break;
            case 5:
                System.out.println("5-To find");
                System.out.println("Moi ban nhap thong tin can tim kiem");


                break;
            case 6:
                System.out.println("6-To print all option");
                obj.addcontactList(input.next(), input.next());
                obj.updateContact(input.nextInt(), input.next(), input.next());
                obj.removeContact(input.nextInt());
                obj.display();
                break;
            default:
                System.out.println("Unvailable! Chose other!");
                break;


        }

    }


}
