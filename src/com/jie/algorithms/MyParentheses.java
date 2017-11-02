package com.jie.algorithms;

/**
 * Created by IntelliJ IDEA
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-10-27
 * @Time 上午10:25
 */
public class MyParentheses
{
    public static boolean isMatch(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < s.length();i++)
        {
            char s1 = s.charAt(i);
            if(s1 == '(' || s1 == '[' || s1=='}'){
                stack.push(s1);
            }
            if(s1==')')
            {
                if (stack.isEmpty()) return false;
                if(!(stack.pop() =='(')) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()()()";
        System.out.println(isMatch(s));
        String s1 = "()())()";
        System.out.println(isMatch(s1));
    }
}
