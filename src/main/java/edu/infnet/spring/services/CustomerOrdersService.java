package edu.infnet.spring.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.infnet.spring.dto.CustomerOrdersDTO;
import edu.infnet.spring.repository.CustomerOrdersRepository;

@Service
public class CustomerOrdersService {
    
    @Autowired
    public CustomerOrdersRepository orderRepository;

    public List<CustomerOrdersDTO> getAll() {
        return (List<CustomerOrdersDTO>)orderRepository.findAll();
    }

    public CustomerOrdersDTO save(CustomerOrdersDTO order) {
        return orderRepository.save(order);
    }

    public Optional<CustomerOrdersDTO> getById(Long id) {
        return orderRepository.findById(id);
    }
}
