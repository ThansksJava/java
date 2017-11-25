package com.jie.algorithms;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * @author fengjie
 * @Description
 * @Date Created in 17-10-25
 * @Time 下午5:05
 */
public class Evaluate
{
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        String add = "(1+((2*3)*(4*5)))";
        char [] adds = add.toCharArray();
        int index = 0;
        int end = adds.length;
        while (index < end)
        {
            String s = String.valueOf(adds[index]);
            if(s.equals("("));
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if(op.equals("+")) v = vals.pop() + v;
                else if (op.equals("-")) v = vals.pop() - v;
                else if (op.equals("*")) v = vals.pop() * v;
                else if (op.equals("/")) v = vals.pop() / v;
                vals.push(v);
            }
            else
                 vals.push(Double.parseDouble(s));
            index++;
        }
        System.out.println(vals.pop());
    }
}
