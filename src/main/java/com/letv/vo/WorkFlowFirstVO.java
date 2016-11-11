package com.letv.vo;

import java.util.List;

public class WorkFlowFirstVO {
    private long id;
    private String name;
    private List<WorkFlowSecondVO> workFlowSecond;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WorkFlowSecondVO> getWorkFlowSecond() {
        return workFlowSecond;
    }

    public void setWorkFlowSecond(List<WorkFlowSecondVO> workFlowSecond) {
        this.workFlowSecond = workFlowSecond;
    }
}
