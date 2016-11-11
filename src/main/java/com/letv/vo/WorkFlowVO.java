package com.letv.vo;

import java.util.List;

/**
 * 流程信息
 */
public class WorkFlowVO {
    private long id;
    private String name;
    private List<WorkFlowFirstVO> workFlowFirstVO;

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

    public List<WorkFlowFirstVO> getWorkFlowFirstVO() {
        return workFlowFirstVO;
    }

    public void setWorkFlowFirstVO(List<WorkFlowFirstVO> workFlowFirstVO) {
        this.workFlowFirstVO = workFlowFirstVO;
    }
}
