package com.letv.entity;

import javax.persistence.*;

/**
 * 流程大类
 */
@Entity
@Table(name = "t_main_category")
public class MainCategoryEntity {
    private long id;
    private String name;
    private MainCategoryEntity workFlow;
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

    @ManyToOne(cascade=CascadeType.REFRESH, optional=false)
    @JoinColumn(name = "work_flow_id")
    public MainCategoryEntity getWorkFlow() {
        return workFlow;
    }

    public void setWorkFlow(MainCategoryEntity workFlow) {
        this.workFlow = workFlow;
    }
}
