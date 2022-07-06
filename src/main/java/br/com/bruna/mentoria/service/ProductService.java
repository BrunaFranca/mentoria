package br.com.bruna.mentoria.service;

import br.com.bruna.mentoria.domain.Product;
import br.com.bruna.mentoria.domain.ProductDTO;
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
        Optional<Product> productById = productRepository.findById(idProduct);
        if(!productById.isPresent()) {
            throw new IllegalArgumentException("Não existe esse ID");
        }
        return productById;
    }

    public Product postProduct(ProductDTO product) {
        Product productEntity = new Product();
        productEntity.setAmount(product.getAmount());
        productEntity.setPrice(product.getPrice());
        productEntity.setTitle(product.getTitle());
        return productRepository.save(productEntity);
    }

    public Product putProduct(Long idProduct, ProductDTO product) {
        Optional<Product> productById = this.getProductById(idProduct);
        Product productEntity = productById.get();
        productEntity.setAmount(product.getAmount());
        productEntity.setPrice(product.getPrice());
        productEntity.setTitle(product.getTitle());
        return productRepository.save(productEntity);
    }

    public void deleteProductById(Long idProduct) {
        this.getProductById(idProduct);
        productRepository.deleteById(idProduct);

    }
}
