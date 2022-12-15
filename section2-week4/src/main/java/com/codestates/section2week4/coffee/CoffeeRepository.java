package com.codestates.section2week4.coffee;

import java.util.HashMap;
import java.util.Map;

public class CoffeeRepository {
    private static Map<Long, Coffee> drinks = new HashMap<>();

    public void postCoffee(Coffee coffee) {
        drinks.put(coffee.getCoffeeId(), coffee);
    }

    public Coffee patchCoffee(long coffeeId, String korName, int price) {
        Coffee drink = drinks.get(coffeeId);
        drink.setKorName(korName);
        drink.setPrice(price);

        return drinks.put(coffeeId, drink);
    }

    public Coffee getCoffee(long coffeeId) {
        return drinks.get(coffeeId);
    }

    public void deleteCoffee(long coffeeId) {
        drinks.remove(coffeeId);
    }
}
