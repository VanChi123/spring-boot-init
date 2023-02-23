package com.example.demo.dto.criteria_test;

import com.example.demo.util.LocalDateTimeFilter;
import io.github.jhipster.service.Criteria;
import io.github.jhipster.service.filter.BigDecimalFilter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.LocalDateFilter;
import io.github.jhipster.service.filter.StringFilter;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GoodsCriteria implements Serializable, Criteria {
//public class GoodsCriteria {
    private static final long serialVersionUID = 1L;

    private StringFilter id;

    private StringFilter name;

    private IntegerFilter amount;

    private BigDecimalFilter price;

//    private LocalDateFilter date1;
    private LocalDateTimeFilter date1;

    private StringFilter note;

    public GoodsCriteria(GoodsCriteria other) {
        this.id = other.id;
        this.name = other.name;
        this.price = other.price;
        this.date1 = other.date1;
        this.amount = other.amount;
        this.note = other.note;
    }


    @Override
    public GoodsCriteria copy() {
        return new GoodsCriteria(this);
    }
}
