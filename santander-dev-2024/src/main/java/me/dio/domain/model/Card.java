package me.dio.domain.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

// Card.java
@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    @Column(precision = 2, scale = 13)
    private BigDecimal limit;

    public Card(String number, BigDecimal limit) {
        this.number = number;
        this.limit = limit;
    }

    public Card() {}

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}

