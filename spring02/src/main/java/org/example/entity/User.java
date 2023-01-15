package org.example.entity;

import java.util.*;

/**
 * @author huzc
 */
public class User {

    private Integer id;
    private String passWord;
    private String sex;
    private Integer age;
    private Date bornDate;
    private String[] hobbies;
    private Set<String> phones;
    private List<String> names;
    private Map<String,String> countries;
    private Properties properties;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Set<String> getPhones() {
        return phones;
    }

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public Map<String, String> getCountries() {
        return countries;
    }

    public void setCountries(Map<String, String> countries) {
        this.countries = countries;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", passWord='" + passWord + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", bornDate=" + bornDate +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", phones=" + phones +
                ", names=" + names +
                ", countries=" + countries +
                ", properties=" + properties +
                ", address=" + address +
                '}';
    }
}
