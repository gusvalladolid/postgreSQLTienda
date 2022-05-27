package com.example.demo.entities;

import javax.persistence.*;
@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq_gen")
    @SequenceGenerator(name = "supplier_seq_gen", sequenceName = "product_id_Seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "product_name", columnDefinition = "varchar(30)", nullable = false)
    private String product_name;
    @Column(name = "from_where", columnDefinition = "varchar(30)", nullable = false)
    private String from_where;
    @Column(name = "where_to", columnDefinition = "varchar(30)", nullable = false)
    private String where_to;

    public ProductEntity(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getFrom_where() {
        return from_where;
    }

    public void setFrom_where(String from_where) {
        this.from_where = from_where;
    }

    public String getWhere_to() {
        return where_to;
    }

    public void setWhere_to(String where_to) {
        this.where_to = where_to;
    }
}
