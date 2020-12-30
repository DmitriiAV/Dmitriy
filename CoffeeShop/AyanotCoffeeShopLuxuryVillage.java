package AyanotCoffeeShopLuxuryVillage;

public class AyanotCoffeeShopLuxuryVillage {

    static {

    }

    public static void main(String[] args) {
        Cheque cheque = new Cheque("Mike");
        System.out.println("-------------------------------------");
        Cheque cheque1 = new Cheque("Ihor");
        System.out.println("-------------------------------------");
        Cheque.allCheque.get(cheque.getName()).forEach(System.out::println);
        System.out.println("-------------------------------------");
        Cheque.allCheque.get(cheque1.getName()).forEach(System.out::println);


    }
}
