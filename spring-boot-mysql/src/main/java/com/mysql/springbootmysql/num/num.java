package com.mysql.springbootmysql.num;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table
public class num {
    @Id
    @GeneratedValue
    @Column(name="id")
    private  Integer id;
    @Column(name="number")
    private Integer number;

    public num(Integer id, Integer number) {
        this.id = id;
        this.number = number;
    }

    public num(Integer id) {
        this.id = id;
    }

    public num() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "num{" +
                "id=" + id +
                ", number=" + number +
                '}';
    }
}
