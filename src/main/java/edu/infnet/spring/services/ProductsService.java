package edu.infnet.spring.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.infnet.spring.dto.ProductsDTO;
import edu.infnet.spring.repository.ProductsRepository;

@Service
public class ProductsService {

    @Autowired
    public ProductsRepository productRepository;

    public List<ProductsDTO> getAll() {
        return (List<ProductsDTO>)productRepository.findAll();
    }

    public ProductsDTO save(ProductsDTO product) {
        return productRepository.save(product);
    }

    public Optional<ProductsDTO> getById(Long id) {
        return productRepository.findById(id);
    }
}
