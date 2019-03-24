package com.chuxiang.java.creational.prototype;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public class Test {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) throws Exception{
        Resume resume = new Resume("张三","男",29);
        resume.setEducation(new Education("五道口职业技术学院",sdf.parse("2010-9-1"),sdf.parse("2014-6-30"),"软件工程"));
        resume.setWorks(new ArrayList<WorkExperience>(){{
            add(new WorkExperience("百度",sdf.parse("2014-7-1"),sdf.parse("2016-2-18"),"初级工程师"));
            add(new WorkExperience("腾讯",sdf.parse("2016-3-11"),sdf.parse("2018-5-22"),"中级工程师"));
            add(new WorkExperience("阿里",sdf.parse("2018-5-29"),sdf.parse("2019-8-4"),"高级工程师"));
        }});
        System.out.println("=========被克隆的对象=========");
        System.out.println(resume);

        //浅克隆
        Resume shallow = resume.shallowClone();
        System.out.println("=========浅克隆的对象=========");
        System.out.println(shallow);
        System.out.println("------修改【基本数据类型】属性值-----");
        shallow.setAge(22);
        System.out.println("修改后：");
        System.out.println(resume);
        System.out.println(shallow);
        System.out.println("------修改【引用数据类型】属性值-----");
        shallow.getEducation().setUniversity("清华大学");
        shallow.getEducation().setMajor("土木工程");
        System.out.println("修改后：");
        System.out.println(resume);
        System.out.println(shallow);
        //深克隆
        Resume deep = resume.deepClone();
        System.out.println("=========深克隆的对象=========");
        System.out.println(deep);
        System.out.println("------修改【基本数据类型】属性值-----");
        deep.setAge(28);
        System.out.println("修改后：");
        System.out.println(resume);
        System.out.println(deep);
        System.out.println("------修改【引用数据类型】属性值-----");
        deep.getEducation().setUniversity("北京大学");
        deep.getEducation().setMajor("金融管理");
        System.out.println("修改后：");
        System.out.println(resume);
        System.out.println(deep);
        //序列化
        Resume serialization = resume.deepCloneInSerializable();
        System.out.println("=========（序列化）深克隆的对象=========");
        System.out.println(serialization);
        System.out.println("------修改【基本数据类型】属性值-----");
        serialization.setAge(33);
        System.out.println("修改后：");
        System.out.println(resume);
        System.out.println(serialization);
        System.out.println("------修改【引用数据类型】属性值-----");
        serialization.getEducation().setUniversity("复旦大学");
        serialization.getEducation().setMajor("国际贸易");
        System.out.println("修改后：");
        System.out.println(resume);
        System.out.println(serialization);
    }
}
