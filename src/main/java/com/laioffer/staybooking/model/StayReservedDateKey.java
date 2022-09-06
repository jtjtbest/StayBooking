package com.laioffer.staybooking.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class StayReservedDateKey implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long stay_id;
    private LocalDate date;

    // JPA composite primary keys need a no-arg constructor
    public StayReservedDateKey() {}

    public StayReservedDateKey(Long stay_id, LocalDate date) {
        this.stay_id = stay_id;
        this.date = date;
    }

    public Long getStay_id() {
        return stay_id;
    }

    public StayReservedDateKey setStay_id(Long stay_id) {
        this.stay_id = stay_id;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public StayReservedDateKey setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    @Override
    public boolean equals(Object o) { // ide can GENERATE directly
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StayReservedDateKey that = (StayReservedDateKey) o;
        return Objects.equals(stay_id, that.stay_id) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stay_id, date);
    }
}

