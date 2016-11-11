package com.letv.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 流程信息
 */
@Entity
@Table(name = "t_work_flow")
public class WorkFlowEntity {
    private long id;
    private String name;
    private Collection<MainCategoryEntity> workFlowFirst = new ArrayList<MainCategoryEntity>();

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

    /**
     * OneToMany:一对多的配置
     * mappedBy="id":指定由多的一方的属性维护关联关系
     */
    @OneToMany(mappedBy="id",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Collection<MainCategoryEntity> getWorkFlowFirst() {
        return workFlowFirst;
    }

    public void setWorkFlowFirst(Collection<MainCategoryEntity> workFlowFirst) {
        this.workFlowFirst = workFlowFirst;
    }

    @Override
    public int hashCode() {
        long result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return (int)result;
    }
}
