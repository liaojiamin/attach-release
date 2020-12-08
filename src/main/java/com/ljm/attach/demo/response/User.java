package com.ljm.attach.demo.response;

/**
 * @author liaojiamin
 * @Date:Created in 15:58 2020/12/8
 */
public class User {
    private Integer id;
    private String name;
    public User(int id, String name){
        super();
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
