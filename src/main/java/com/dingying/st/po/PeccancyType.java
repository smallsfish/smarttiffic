package com.dingying.st.po;

public class PeccancyType {
    private Integer id;

    //违章类型名称
    private String name;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取违章类型名称
     *
     * @return name - 违章类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置违章类型名称
     *
     * @param name 违章类型名称
     */
    public void setName(String name) {
        this.name = name;
    }
}