package edu.infnet.spring.repository;

import org.springframework.data.repository.CrudRepository;

import edu.infnet.spring.dto.CustomerOrdersDTO;

public interface CustomerOrdersRepository extends CrudRepository<CustomerOrdersDTO, Long> {
    
}
