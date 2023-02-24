package com.example.demo.dto.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class GoodsDTO {
    private String id;

    private String name;

    private Integer amount;

    private BigDecimal price;

//    private Date date1;
//    private LocalDate date1;
    private LocalDateTime date1;

    private String note;
}
