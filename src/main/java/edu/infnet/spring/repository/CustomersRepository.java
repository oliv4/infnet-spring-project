package edu.infnet.spring.repository;

import org.springframework.data.repository.CrudRepository;

import edu.infnet.spring.dto.CustomersDTO;

public interface CustomersRepository extends CrudRepository<CustomersDTO, Long> {
    
}
