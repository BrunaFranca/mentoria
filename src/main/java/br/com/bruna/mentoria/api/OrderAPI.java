package br.com.bruna.mentoria.api;

import br.com.bruna.mentoria.domain.Order;
import br.com.bruna.mentoria.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional; //usar quando fizer consulta por id

@RestController
@RequestMapping("/api/order")
public class OrderAPI {
    @Autowired
    private OrderService orderService;

    @RequestMapping(method = {RequestMethod.GET})
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/cria")
    public Order vai() {
        return orderService.vaiSabrina();
    }

}
