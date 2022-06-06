package br.com.bruna.mentoria.service;

import br.com.bruna.mentoria.domain.Product;
import br.com.bruna.mentoria.domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {

        return productRepository.findAll();

    }

    public Optional<Product> getProductById(Long idProduct) {

        return productRepository.findById(idProduct);

    }

}
