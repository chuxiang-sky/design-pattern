package com.chuxiang.java.creational.prototype;

import java.io.*;
import java.util.List;
import static java.util.stream.Collectors.*;

/**
 * Created by chuxiang_sky on 2019/03/23.
 * 创建型设计模式
 * -原型模式：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 * --浅克隆：将被克隆对象中的【基本数据类型和String类型】属性的值赋值给克隆对象中对应的属性，将被克隆对象中的【引用数据类型】属性的引用赋值给克隆对象中对应的属性。
 * ----实现方式：被克隆对象通过实现Cloneable接口，并重写clone()方法，在该方法中调用super.clone()方法
 * --深克隆：将被克隆对象中的【基本数据类型和String类型】属性的值赋值给克隆对象中对应的属性，将被克隆对象中的【引用数据类型】属性的引用对象赋值给克隆对象中对应的属性。
 * ----实现方式：
 * --------第一种：被克隆对象及其包含的【引用数据类型】属性都要实现Cloneable接口，在被克隆对象重写clone()方法（或自定义深克隆方法）中调用super.clone()方法后，然后给【引用数据类型】属性重新初始化（可以调用该属性对象的重写的clone()方法）。
 * --------第二种：被克隆对象及其包含的【引用数据类型】属性都要实现Serializable接口，通过序列化和反序列化的方式实现深克隆
 * --基本数据类型：整型（四种，分别为byte、short、int和long）、浮点型（两种，分别为float和double）、布尔型（boolean）和字符型（char）
 * --引用数据类型：类、接口和数组
 */
public class Resume implements Cloneable,Serializable{
    private String name;
    private String gender;
    private int age;
    private Education education;
    private List<WorkExperience> works;

    public Resume(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public List<WorkExperience> getWorks() {
        return works;
    }

    public void setWorks(List<WorkExperience> works) {
        this.works = works;
    }

    @Override
    public String toString() {
        return "Resume={" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age  +
                ", education=" + education.toString() +
                ", works=["+works.stream().map(WorkExperience::toString).collect(joining(","))+"]"+
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /*
    * 浅克隆
    *
    * */
    protected Resume shallowClone() throws CloneNotSupportedException{
        return (Resume)this.clone();
    }
    /*
    * 深克隆
    * */
    protected Resume deepClone() throws CloneNotSupportedException{
        Resume clone = (Resume)this.clone();
        clone.setEducation(clone.getEducation().clone());
        List<WorkExperience> works = clone.getWorks();
        clone.setWorks(clone.getWorks().stream().map(work -> {
            WorkExperience workClone = null;
            try {
                workClone = work.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }finally{
                return workClone;
            }
        }).collect(toList()));
        return clone;
    }

    protected Resume deepCloneInSerializable() throws IOException,ClassNotFoundException{
        //序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Resume)ois.readObject();
    }
}
