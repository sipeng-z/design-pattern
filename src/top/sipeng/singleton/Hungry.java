package top.sipeng.singleton;

import java.awt.*;

/**
 * @Author Si Peng
 * @Date 2020/11/27 10:16
 * @Version 1.0
 * @Description 单例设计 饿汉
 */
public class Hungry {

    private static Hungry instance = new Hungry();

    private Hungry(){}

    public static Hungry getInstance(){
        return instance;
    }

    /**
     * 单例对象的方法
     */
    public void process(){
        System.out.println("方法调用成功");
    }

}
