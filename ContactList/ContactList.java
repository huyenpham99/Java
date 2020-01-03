package PhoneNumbers;

import java.util.ArrayList;
import java.util.List;

public class ContactList {

    private static List<Contact> ContactList = new ArrayList<>();
    public void addcontactList(String name, String numberphone) {
        ContactList.add(new Contact(name, numberphone));
    }

    public void updateContact(int index, String name, String numberphone) {
        ContactList.set(index, new Contact(name, numberphone));
        System.out.println("Updated!");
        System.out.println("name" + (index + 1) + " " + name);
    }

    public void display() {
        System.out.println("You have" + ContactList.size() + "items in  list");
        for (int i = 0; i < ContactList.size(); i++) {
            System.out.println("User:" + (i + 1) + ContactList.get(i).getName());
            System.out.println("\t" + (i + 1) + ContactList.get(i).getNumberphone());
        }
    }
}

