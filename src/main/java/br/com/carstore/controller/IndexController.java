package br.com.carstore.controller;

import br.com.carstore.model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index(){


        return "<h1>Hello, World</h1>";

    }

    @GetMapping("/car")
    public ResponseEntity<Car> nome(String name @RequestParam("car-name"), ){
        Car car = new Car();
        car.setName("Polo");
        car.setColor("Cinza");



        return ResponseEntity.ok(car);
    }
}