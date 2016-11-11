package com.letv.entity;

import javax.persistence.*;

/**
 * 流程小类
 */
@Entity
@Table(name = "t_little_category")
public class LittleCategoryEntity {
    private long id;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
