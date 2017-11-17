package com.jie.exception;

/**
 * Created by IntelliJ IDEA
 *
 * @author fengjie
 * @Description
 * @Date Created in 2017/11/14
 * @Time 13:48
 */
public class FinallyTest
{
    public void doubleTryCatchFinally(){
        try{
            try {
                int [] a  = new int[1];
                a[2]=2;

            }catch (IndexOutOfBoundsException e){
                System.out.println("内部捕获异常");
            }
            finally {
                System.out.println("执行内部finally！");
            }

        }
        catch (Exception e){
            System.out.println("外部捕获异常！");

        }
        finally{
            System.out.println("外部finally执行！");
        }
    }

    public static void main(String[] args) {
        new FinallyTest().doubleTryCatchFinally();
    }
}
