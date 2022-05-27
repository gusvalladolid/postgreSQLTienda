package com.example.demo.entities;

import javax.persistence.*;
import java.util.function.Supplier;
@Entity
public class SupplierEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "supplier_seq_gen")
    @SequenceGenerator(name = "supplier_seq_gen", sequenceName = "supplier_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "vehicle_id", columnDefinition = "int", nullable = false)
    private Integer vehicle_id;
    @Column(name = "first_name", columnDefinition = "varchar(20)", nullable = false)
    private String first_name;
    @Column(name = "last_name", columnDefinition = "varchar(50)", nullable = false)
    private String last_name;

    public SupplierEntity(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(Integer vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}


