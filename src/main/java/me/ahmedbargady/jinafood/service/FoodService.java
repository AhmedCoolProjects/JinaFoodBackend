package me.ahmedbargady.jinafood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.ahmedbargady.jinafood.model.Food;
import me.ahmedbargady.jinafood.repository.FoodRepository;

@Service
public class FoodService {
    @Autowired
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        super();
        this.foodRepository = foodRepository;
    }

    public Optional<Food> get(String id) {
        return foodRepository.findById(id);
    }

    public List<Food> getall() {
        return foodRepository.findAll();
    }

    public Food add(Food p) {
        return foodRepository.save(p);
    }

    public Food update(Food p) {
        return foodRepository.save(p);
    }

    public String delete(String id) {
        foodRepository.deleteById(id);
        return "Deleted";
    }

}
