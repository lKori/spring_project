package com.codestates.section2week4.coffee;

public class CoffeeService {
    private static CoffeeRepository coffeeRepository = new CoffeeRepository();

    public void createCoffee(Coffee coffee) {
        coffeeRepository.postCoffee(coffee);
    }

    public Coffee editCoffee(long coffeeId, String korName, int price) {
        return coffeeRepository.patchCoffee(coffeeId, korName, price);
    }

    public Coffee getCoffee(long coffeeId) {
        return coffeeRepository.getCoffee(coffeeId);
    }

    public void deleteCoffee(long coffeeId) {
        coffeeRepository.deleteCoffee(coffeeId);
    }
}
