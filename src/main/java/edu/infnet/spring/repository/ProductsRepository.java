package edu.infnet.spring.repository;

import org.springframework.data.repository.CrudRepository;

import edu.infnet.spring.dto.ProductsDTO;

public interface ProductsRepository extends CrudRepository<ProductsDTO, Long>{
    
}
