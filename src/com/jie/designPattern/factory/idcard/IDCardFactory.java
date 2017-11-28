package com.jie.designPattern.factory.idcard;

import com.jie.designPattern.factory.framework.Factory;
import com.jie.designPattern.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author fengjie
 * @Description
 * @Date Created in 2017/11/28
 * @Time 11:02
 */
public class IDCardFactory extends Factory{
    private List<String> owners = new ArrayList<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
}
