package com.wph.test;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/12/6.
 */
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = getName();
        int age = getAge();
        String address = getAddress();
        System.out.println("我的姓名:"+name+",年龄："+age+",家庭住址:"+address);
    }

    /**
     *获取用户的姓名
     * @return
     */
    public String getName(){
        String name="张三";
        return name;
    }

    /**
     * 获取用户的年龄
     * @return
     */
    public int getAge(){
        int age=100;
        return age;
    }

    /**
     * 获取用户的地址
     * @return
     */
    public String getAddress(){
        String address="河南省郑州市郑东新区妙优车";
        return address;
    }
}
