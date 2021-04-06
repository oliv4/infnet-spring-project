package edu.infnet.spring.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.infnet.spring.dto.CustomersDTO;
import edu.infnet.spring.repository.CustomersRepository;

@Service
public class CustomersService {
    
    @Autowired
    public CustomersRepository customerRepository;

    public List<CustomersDTO> getAll() {
        return (List<CustomersDTO>)customerRepository.findAll();
    }

    public CustomersDTO save(CustomersDTO customer) {
        return customerRepository.save(customer);
    }

    public Optional<CustomersDTO> getById(Long id) {
        return customerRepository.findById(id);
    }
}
