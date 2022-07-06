package br.com.bruna.mentoria.service;

import br.com.bruna.mentoria.domain.Order;
import br.com.bruna.mentoria.domain.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order vaiSabrina() {
        Order order = new Order();
        order.setClient("bruna");
        order.setIdProduct(2L);
        order.setQuantity(BigDecimal.ONE);
        order.setTotalPrice(BigDecimal.TEN);
        return orderRepository.save(order);
    }

}
