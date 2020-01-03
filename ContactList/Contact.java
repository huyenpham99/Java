package PhoneNumbers;

public class Contact {
    String name;
    String numberphone;

    public Contact(String name, String numberphone) {
        this.name = name;
        this.numberphone = numberphone;
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
}
