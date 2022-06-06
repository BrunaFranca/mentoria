package br.com.bruna.mentoria.api;

import br.com.bruna.mentoria.domain.Product;
import br.com.bruna.mentoria.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductAPI {

   // public ProductAPI(ProductService productService) {
   //     this.productService = productService;
   // }
    @Autowired
    private ProductService productService;

    @RequestMapping(method = {RequestMethod.GET})
    //@GetMapping
    public List<Product> getAllProducts() {
        //chamar camada de serviço e depois chamar repositório
        return productService.getAllProducts();
    }

    @RequestMapping(value = {"/{idProduct}"}, method = {RequestMethod.GET})
    public Product getProductById(@PathVariable("idProduct") Long idProduct) {
        Optional<Product> productById = productService.getProductById(idProduct);
        if(!productById.isPresent()) {
            throw new IllegalArgumentException("Não existe esse ID");
        }
        return productById.get();
    }

}

