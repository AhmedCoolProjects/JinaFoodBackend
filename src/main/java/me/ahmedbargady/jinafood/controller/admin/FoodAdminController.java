package me.ahmedbargady.jinafood.controller.admin;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import me.ahmedbargady.jinafood.model.Food;
import me.ahmedbargady.jinafood.service.FoodService;

@Controller
@RequestMapping("/api/v1/admin/foods")
public class FoodAdminController {
    private final FoodService foodService;

    public FoodService getFoodService() {
        return foodService;
    }

    public FoodAdminController(FoodService foodService) {
        super();
        this.foodService = foodService;
    }

    @GetMapping
    public String foods(Model model) {
        model.addAttribute("title", "Foods");
        model.addAttribute("foods", foodService.getall());
        return "admin/foods";
    }

    @PostMapping
    public void addFood(HttpServletRequest request, HttpServletResponse response) {
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String salePrice = request.getParameter("salePrice");
        String regularPrice = request.getParameter("regularPrice");
        String images1 = request.getParameter("images");
        String[] images = images1.split(";");
        String ingredients1 = request.getParameter("ingredients");
        String[] ingredients = ingredients1.split(";");
        String category1 = request.getParameter("category");
        String[] category = category1.split(";");
        Food p = new Food(title, description, Double.parseDouble(salePrice), Double.parseDouble(regularPrice), images,
                ingredients, category);
        foodService.add(p);
        try {
            response.sendRedirect("/api/v1/admin/foods");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/update/{id}")
    public void updateFood(HttpServletRequest request, HttpServletResponse response, @PathVariable String id) {
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String salePrice = request.getParameter("salePrice");
        String regularPrice = request.getParameter("regularPrice");
        String images1 = request.getParameter("images");
        String[] images = images1.split(";");
        String ingredients1 = request.getParameter("ingredients");
        String[] ingredients = ingredients1.split(";");
        String category1 = request.getParameter("category");
        String[] category = category1.split(";");
        Food p = new Food(title, description, Double.parseDouble(salePrice), Double.parseDouble(regularPrice), images,
                ingredients, category);
        p.setId(id);
        foodService.add(p);
        try {
            response.sendRedirect("/api/v1/admin/foods");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/delete/{id}")
    public void deleteFood(HttpServletResponse response, @PathVariable String id) {
        foodService.delete(id);
        try {
            response.sendRedirect("/api/v1/admin/foods");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
