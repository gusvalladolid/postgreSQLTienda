package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq_gen")
    @SequenceGenerator(name = "customer_seq_gen", sequenceName = "customer_id_seq", allocationSize = 1)
    @Column(name = "customer_id")
    private Integer customer_id;
    @Column(name = "customer_name", columnDefinition = "varchar(30)", nullable = false)
    private String customer_name;
    @Column(name = "customer_country", columnDefinition = "varchar(20)", nullable = false)
    private String customer_country;


    public CustomerEntity(){

    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_country() {
        return customer_country;
    }

    public void setCustomer_country(String customer_country) {
        this.customer_country = customer_country;
    }
}
