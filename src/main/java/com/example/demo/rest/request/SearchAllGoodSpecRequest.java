package com.example.demo.rest.request;


import com.example.demo.dto.criteria_test.GoodsCriteria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchAllGoodSpecRequest {
    private Integer pageIndex;

    private Integer pageSize;

    @NotNull
    private GoodsCriteria criteria;

    public Integer getPageIndex() {
        if (this.pageIndex == null)
            this.pageIndex = 1;
        return this.pageIndex;
    }

    public Integer getPageSize() {
        if (this.pageSize == null)
            this.pageSize = 2;
        return this.pageSize;
    }



}
