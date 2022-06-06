package br.com.bruna.mentoria.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@SequenceGenerator(name="seq_new_product", sequenceName = "seq_new_product", allocationSize = 1)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_new_product")
    private Long id;
    private String title;
    private BigDecimal amount;
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
