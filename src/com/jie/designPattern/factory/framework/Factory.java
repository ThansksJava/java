package com.jie.designPattern.factory.framework;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author fengjie
 * @Description
 * @Date Created in 2017/11/28
 * @Time 10:56
 */
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registProduct(Product product);
}
