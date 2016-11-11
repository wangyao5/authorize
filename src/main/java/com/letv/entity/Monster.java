package com.letv.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_monster")
public class Monster {
    private long id;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sid")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
