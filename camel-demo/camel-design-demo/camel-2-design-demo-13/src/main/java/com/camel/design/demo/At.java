package com.camel.design.demo;

public class At extends Approver{
    /**
     * 处理审批请求的方法，得到一个请求，处理是子类完成，因此该方法做成抽象
     * 抽象类中的approve变量可以直接使用 ， 因为是继承的！
     * @param course
     */
    @Override
    public void deploy(Course course) {
        if (course.getArticle() != null && course.getArticle().length() > 0) {
            System.out.println(course.getName() + "含有手记，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有手记，不批准，流程结束");
            return;
        }
    }
}
