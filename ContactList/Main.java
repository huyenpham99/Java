package PhoneNumbers;

public class Main {
    public static void main(String[] args) {
        ContactList obj = new ContactList();
        System.out.println("List Users:");
        obj.addcontactList("Huyen", "0377073565");
        obj.addcontactList("Lam", "01233333332");
        obj.display();
    }

}
