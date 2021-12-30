package me.ahmedbargady.jinafood.controller.admin;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import me.ahmedbargady.jinafood.model.Order;
import me.ahmedbargady.jinafood.service.OrderService;

@Controller
@RequestMapping("/api/v1/admin/orders")
public class OrderAdminController {
    private final OrderService orderService;

    public OrderAdminController(OrderService orderService) {
        super();
        this.orderService = orderService;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    @GetMapping
    public String Orders(Model model) {
        model.addAttribute("title", "Orders");
        model.addAttribute("orders", orderService.getall());
        return "admin/orders";
    }

    @PostMapping("/update/{id}")
    public void setOrderDelievred(HttpServletResponse response, @PathVariable String id) {
        Optional<Order> o = orderService.get(id);
        Order oo = o.get();
        oo.setDelievred(true);
        orderService.update(oo);
        try {
            response.sendRedirect("/api/v1/admin/orders");
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}
