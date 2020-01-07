package DatMonAn;

public class Food {

    private String name;
    private int amount;
    private double price;
    private double total;

    public Food() {
    }

    public Food(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }



    public void thongtinmon() {
        this.total = this.amount * this.price;
        String info = "\n" + "Tên món ăn: " + this.name + "\nSố lượng: " + this.amount + "\nGiá Tiền: " + this.price + "\nTổng tiền: " + this.total;
        System.out.println(info);
    }
}

