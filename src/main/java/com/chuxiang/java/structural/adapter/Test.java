package com.chuxiang.java.structural.adapter;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public class Test {

    public static void main(String[] args) {
        English en = new English();
        en.helloworldByEnglish();
        en = new Translate();
        en.helloworldByEnglish();
    }
}
