package com.example.demo.rest.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.example.demo.util.StringUtil.stringIsNullOrEmpty;
import static com.example.demo.util.StringUtil.stringIsNullOrEmptyBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchAllGoodRequest {
    private Integer pageIndex;

    private Integer pageSize;

    private String name;


    public String getName() {
        if (stringIsNullOrEmptyBlank(this.name))
            this.name = null;
        return this.name;
    }

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
