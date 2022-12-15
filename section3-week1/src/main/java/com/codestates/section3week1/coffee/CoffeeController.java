package com.codestates.section3week1.coffee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/coffees")
public class CoffeeController {
    @PostMapping
    public ResponseEntity postCoffee(@RequestParam("engName") String engName,
                                     @RequestParam("korName") String korName,
                                     @RequestParam("price") int price) {

        Map<String, Object> map = new HashMap<>();
        map.put("engName", engName);
        map.put("korName", korName);
        map.put("price", price);

        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }

    @GetMapping("/{coffee-id}")
    public ResponseEntity getCoffee(@PathVariable("coffee-id") long coffeeId) {
        System.out.println("# coffeeId: " + coffeeId);

        // not implementation
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getCoffees() {
        System.out.println("# get Coffees");

        // not implementation
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
