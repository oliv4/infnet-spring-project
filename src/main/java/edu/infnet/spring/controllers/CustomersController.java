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
import edu.infnet.spring.dto.CustomersDTO;
import edu.infnet.spring.services.CustomersService;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    @Autowired
    private CustomersService customerService;

    @GetMapping
    public List<CustomersDTO> getCustomers() {
        return customerService.getAll();
    }

    @PostMapping
    public CustomersDTO storeCustomer(@RequestBody CustomersDTO customer) {
        return customerService.save(customer);
    }

    @GetMapping("/{id}")
    public CustomersDTO getCustomer(@PathVariable Long id) {
        Optional<CustomersDTO> customer = customerService.getById(id);

        if(customer.isEmpty()) return null;

        return customer.get();
    }
}
