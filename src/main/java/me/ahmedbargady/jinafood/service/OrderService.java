package me.ahmedbargady.jinafood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.ahmedbargady.jinafood.model.Order;
import me.ahmedbargady.jinafood.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private final OrderRepository orderRepository;

    public OrderRepository getOrderRepository() {
        return orderRepository;
    }

    public Optional<Order> get(String id) {
        return orderRepository.findById(id);
    }

    public OrderService(OrderRepository orderRepository) {
        super();
        this.orderRepository = orderRepository;
    }

    public List<Order> getall() {
        return orderRepository.findAll();
    }

    public Order add(Order e) {
        return orderRepository.save(e);
    }

    public String delete(String id) {
        orderRepository.deleteById(id);
        return "Deleted";

    }

    public Order update(Order e) {
        return orderRepository.save(e);
    }
}
