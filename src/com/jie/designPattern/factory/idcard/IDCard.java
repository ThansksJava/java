package com.jie.designPattern.factory.idcard;

import com.jie.designPattern.factory.framework.Product;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author fengjie
 * @Description
 * @Date Created in 2017/11/28
 * @Time 10:59
 */
public class IDCard extends Product {
    private String owner;
    //构造函数采用包访问权限，这样包外的类就不能直接创建对象，只能通过工厂类来进行创建
    IDCard(String owner) {
        System.out.println("制作"+owner+"的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用"+owner+"的ID卡");
    }
    public String getOwner(){
        return owner;
    }
}
