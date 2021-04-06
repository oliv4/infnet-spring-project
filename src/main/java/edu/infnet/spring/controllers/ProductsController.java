package edu.infnet.spring.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import edu.infnet.spring.dto.ProductsDTO;
import edu.infnet.spring.services.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsService productService;

    @GetMapping
    public List<ProductsDTO> getProducts() {
        return productService.getAll();
    }

    @PostMapping
    public ProductsDTO storeProduct(@RequestBody ProductsDTO product) {
        return productService.save(product);
    }

    @GetMapping("/{id}")
    public ProductsDTO getProduct(@PathVariable Long id) {
        Optional<ProductsDTO> product = productService.getById(id);

        if(product.isEmpty()) return null;

        return product.get();
    }
}
