package ASM2;

public class Order {
    private String foodName;
    private int foodAmount;
    private int TotalPrice;
    public Order(){

    };
    public Order(String foodName, int foodAmount,int TotalPrice) {
        this.foodName = foodName;
        this.foodAmount = foodAmount;
        this.TotalPrice = TotalPrice;
    }
    public int getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        TotalPrice = totalPrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }
}
