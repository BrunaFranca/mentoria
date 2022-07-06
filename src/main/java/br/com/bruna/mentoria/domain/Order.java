package br.com.bruna.mentoria.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table (name = "sales_order")
@SequenceGenerator(name="seq_new_order", sequenceName = "seq_new_order", allocationSize = 1)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_new_order")
    private Long id;
    private String client;
    @Column(name = "idproduct")
    private Long idProduct;
    private BigDecimal quantity;
    @Column(name = "totalprice")
    private BigDecimal totalPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
