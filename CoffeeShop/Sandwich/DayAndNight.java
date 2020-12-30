package AyanotCoffeeShopLuxuryVillage.Sandwich;

public class DayAndNight extends Sandwich {
    private int price = 300;
    private String type = "DayAndNight";

    @Override
    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
