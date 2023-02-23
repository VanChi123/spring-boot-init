package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "GOODS")
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Goods {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AMOUNT")
    private Integer amount;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "DATE1")
//    private Date date1;
//    private LocalDate date1;
    private LocalDateTime date1;

    @Column(name = "NOTE")
    private String note;
}
