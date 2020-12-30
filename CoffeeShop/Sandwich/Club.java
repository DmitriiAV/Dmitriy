package AyanotCoffeeShopLuxuryVillage.Sandwich;

public class Club extends Sandwich {
    private int price = 200;
    private String type = "Club";

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return type;
    }
}
