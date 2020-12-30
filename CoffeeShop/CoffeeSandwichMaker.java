package AyanotCoffeeShopLuxuryVillage;

import AyanotCoffeeShopLuxuryVillage.Coffee.Amerikano;
import AyanotCoffeeShopLuxuryVillage.Coffee.Asiano;
import AyanotCoffeeShopLuxuryVillage.Coffee.Coffee;
import AyanotCoffeeShopLuxuryVillage.Coffee.Russiano;
import AyanotCoffeeShopLuxuryVillage.Sandwich.Club;
import AyanotCoffeeShopLuxuryVillage.Sandwich.DayAndNight;
import AyanotCoffeeShopLuxuryVillage.Sandwich.Sandwich;
import AyanotCoffeeShopLuxuryVillage.Sandwich.Toster;

public class CoffeeSandwichMaker {
    protected static Coffee makeCoffee(int type) {
        Coffee coffee = null;
        switch (type) {
            case 1 -> coffee = new Amerikano();
            case 2 -> coffee = new Asiano();
            case 3 -> coffee = new Russiano();
        }
        return coffee;
    }
    protected static Sandwich makeSandwich(int type) {
        Sandwich sandwich = null;
        switch (type) {
            case 4 -> sandwich = new Club();
            case 5 -> sandwich = new Toster();
            case 6 -> sandwich = new DayAndNight();
        }
        return sandwich;
    }
}
