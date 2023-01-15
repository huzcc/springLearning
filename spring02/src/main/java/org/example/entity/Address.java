package org.example.entity;

/**
 * @author huzc
 */
public class Address {
    private Integer id;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void init_method(){
        System.out.println("init");
    }

    public void destroy_method(){
        System.out.println("destroy_method");
    }
}
