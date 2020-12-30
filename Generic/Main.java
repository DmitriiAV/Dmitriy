package Generic;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Something<String, String> stringStringSomething = new Something<>("У нас нету", "электричества");
        stringStringSomething.likeString();

        Something<Integer,Integer> integerIntegerSomething = new Something<>(10,10);
        integerIntegerSomething.likeInt();


        System.out.println(Ototo.<String>getValue("Жизнь - боль"));
        System.out.println(Ototo.<Integer>getValue(12345));

    }
}
