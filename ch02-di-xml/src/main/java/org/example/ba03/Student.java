package org.example.ba03;

/**
 * @author huzc
 */
public class Student {
    private String name;
    private Integer age;
    private School school;

    public Student(){
        System.out.println("无参构造方法");
    }

    public Student(String myName, Integer myAge, School mySchool){
        System.out.println("有参构造方法");
        this.name = myName;
        this.age = myAge;
        this.school = mySchool;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
