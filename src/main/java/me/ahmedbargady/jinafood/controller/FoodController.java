package me.ahmedbargady.jinafood.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.ahmedbargady.jinafood.model.Food;
import me.ahmedbargady.jinafood.service.FoodService;

@RestController
@CrossOrigin(origins = "https://jinafood.vercel.app")
@RequestMapping("/api/v1/food")
public class FoodController {

    private final FoodService foodService;

    public FoodService getFoodService() {
        return foodService;
    }

    public FoodController(FoodService foodService) {
        super();
        this.foodService = foodService;
    }

    @GetMapping("/id/{id}")
    public Optional<Food> get(@PathVariable String id) {
        return foodService.get(id);
    }

    @GetMapping
    public List<Food> getall() {
        return foodService.getall();
    }

    @PostMapping("/add")
    public Food add(@RequestBody Food p) {
        return foodService.add(p);
    }

    @PostMapping("/update")
    public Food update(@RequestBody Food p) {
        return foodService.update(p);
    }

    @GetMapping("/delete/{id}")
    public String delelte(@PathVariable String id) {
        return foodService.delete(id);
    }

}
