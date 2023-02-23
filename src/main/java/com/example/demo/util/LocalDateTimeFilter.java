package com.example.demo.util;

import io.github.jhipster.service.filter.RangeFilter;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class LocalDateTimeFilter extends RangeFilter<LocalDateTime> {
    private static final long serialVersionUID = 1L;

    public LocalDateTimeFilter() {
    }

    public LocalDateTimeFilter(LocalDateTimeFilter filter) {
        super(filter);
    }

    public LocalDateTimeFilter copy() {
        return new LocalDateTimeFilter(this);
    }

    @DateTimeFormat(
            iso = ISO.DATE_TIME
    )
    public LocalDateTimeFilter setEquals(LocalDateTime equals) {
        super.setEquals(equals);
        return this;
    }

    @DateTimeFormat(
            iso = ISO.DATE_TIME
    )
    public LocalDateTimeFilter setNotEquals(LocalDateTime equals) {
        super.setNotEquals(equals);
        return this;
    }

    @DateTimeFormat(
            iso = ISO.DATE_TIME
    )
    public LocalDateTimeFilter setGreaterThan(LocalDateTime equals) {
        super.setGreaterThan(equals);
        return this;
    }

    @DateTimeFormat(
            iso = ISO.DATE_TIME
    )
    public LocalDateTimeFilter setGreaterThanOrEqual(LocalDateTime equals) {
        super.setGreaterThanOrEqual(equals);
        return this;
    }

    /** @deprecated */
    @DateTimeFormat(
            iso = ISO.DATE_TIME
    )
    @Deprecated
    public LocalDateTimeFilter setGreaterOrEqualThan(LocalDateTime equals) {
        super.setGreaterOrEqualThan(equals);
        return this;
    }

    @DateTimeFormat(
            iso = ISO.DATE_TIME
    )
    public LocalDateTimeFilter setLessThan(LocalDateTime equals) {
        super.setLessThan(equals);
        return this;
    }

    @DateTimeFormat(
            iso = ISO.DATE_TIME
    )
    public LocalDateTimeFilter setLessThanOrEqual(LocalDateTime equals) {
        super.setLessThanOrEqual(equals);
        return this;
    }

    @DateTimeFormat(
            iso = ISO.DATE_TIME
    )
    public LocalDateTimeFilter setIn(List<LocalDateTime> in) {
        super.setIn(in);
        return this;
    }
}

