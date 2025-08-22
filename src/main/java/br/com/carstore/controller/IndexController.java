package br.com.carstore.controller;

import br.com.carstore.model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastro")
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/car")
    public ResponseEntity<Car> nome(@RequestParam("car-name") String name, @RequestParam("car-color") String color){
        Car car = new Car();
        car.setName(name);
        car.setColor(color);

        return ResponseEntity.ok(car);
    }
}