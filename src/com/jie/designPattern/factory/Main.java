package com.jie.designPattern.factory;

import com.jie.designPattern.factory.framework.Factory;
import com.jie.designPattern.factory.framework.Product;
import com.jie.designPattern.factory.idcard.IDCard;
import com.jie.designPattern.factory.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product idCard = factory.create("fengjie");
    }
}
