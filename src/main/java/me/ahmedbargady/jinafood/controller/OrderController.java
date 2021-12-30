package me.ahmedbargady.jinafood.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.ahmedbargady.jinafood.model.Command;
import me.ahmedbargady.jinafood.model.Order;
import me.ahmedbargady.jinafood.service.CommandService;
import me.ahmedbargady.jinafood.service.OrderService;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    private final OrderService orderService;
    private final CommandService commandService;

    public OrderService getOrderService() {
        return orderService;
    }

    public OrderController(OrderService orderService, CommandService commandService) {
        super();
        this.orderService = orderService;
        this.commandService = commandService;
    }

    @GetMapping("/id/{id}")
    public Optional<Order> get(@PathVariable String id) {
        return orderService.get(id);
    }

    @GetMapping
    public List<Order> getall() {
        return orderService.getall();
    }

    @PostMapping("/add")
    public Order add(@RequestBody Order p) {
        for (Command command : p.getCommands()) {
            commandService.add(command);
        }
        return orderService.add(p);
    }

    @PostMapping("/update")
    public Order update(@RequestBody Order p) {
        for (Command command : p.getCommands()) {
            commandService.update(command);
        }
        return orderService.update(p);
    }

    @GetMapping("/delete/{id}")
    public String delelte(@PathVariable String id) {
        return orderService.delete(id);
    }

}
