package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "point")
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String coords;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoords() {
        return coords;
    }

    public void setCoords(String coords) {
        this.coords = coords;
    }

    public Point() {
    }
    public Point(Integer id, String coords) {
        this.id = id;
        this.coords = coords;
    }
}
