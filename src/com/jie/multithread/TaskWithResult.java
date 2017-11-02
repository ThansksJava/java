package com.jie.multithread;

import com.sun.org.apache.xpath.internal.functions.FuncTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-10-24
 * @Time 上午10:23
 */
public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }
    @Override
    public String call() throws Exception {
        return "result is " + id;
    }

    public static void main(String[] args){
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<String>> futureList = new ArrayList<>(5);
        for (int i= 0;i < 5;i++)
        {
            futureList.add(executorService.submit(new TaskWithResult(i)));
        }
        try
        {
            for (Future<String> future : futureList)
            {
                System.out.println(future.get());
            }
        }catch (Exception e)
        {

        }
        finally {
            executorService.shutdown();
        }
    }
}
