package edu.infnet.spring.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import edu.infnet.spring.dto.CustomerOrdersDTO;
import edu.infnet.spring.services.CustomerOrdersService;

@RestController
@RequestMapping("/orders")
public class CustomerOdersController {

    @Autowired
    private CustomerOrdersService ordersService;

    @GetMapping
    public List<CustomerOrdersDTO> getOrders() {
        List<CustomerOrdersDTO> orders = ordersService.getAll();
        return orders;
    }

    @PostMapping
    public CustomerOrdersDTO storeOrder(@RequestBody CustomerOrdersDTO order) {
        return ordersService.save(order);
    }

    @GetMapping("/{id}")
    public CustomerOrdersDTO getOrder(@PathVariable Long id) {
        Optional<CustomerOrdersDTO> order = ordersService.getById(id);

        if(order.isEmpty()) return null;

        return order.get();
    }
}
