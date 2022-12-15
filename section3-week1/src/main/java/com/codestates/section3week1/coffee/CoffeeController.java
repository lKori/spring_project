package com.codestates.section3week1.coffee;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/coffees")
public class CoffeeController {
    @PostMapping
    public String postCoffee(@RequestParam("engName") String engName,
                             @RequestParam("korName") String korName,
                             @RequestParam("price") String price) {
        System.out.println("# engName: " + engName);
        System.out.println("# korName: " + korName);
        System.out.println("# price: " + price);

        String response = "{\"engName\": \"" + engName + "\"," +
                "\"korName\": \"" + korName + "\"," +
                "\"price\": \"" + price + "\"}";

        return response;
    }

    @GetMapping("/{coffee-id}")
    public String getCoffee(@PathVariable("coffee-id") long coffeeId) {
        System.out.println("# coffeeId: " + coffeeId);

        // not implementation
        return null;
    }

    @GetMapping
    public String getCoffees() {
        System.out.println("# get Coffees");

        // not implementation
        return null;
    }
}
