package com.camel.design.demo;

public abstract class Approver {

    /**
     * 责任链的下一个节点
     */
    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    /**
     * 处理审批请求的方法，得到一个请求，处理是子类完成，因此该方法做成抽象
     * @param course
     */
    public abstract void deploy(Course course);



}
