package com.jie.algorithms;
import java.util.Stack;
/**
 * Created by IntelliJ IDEA
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-10-27
 * @Time 上午10:48
 */
public class ParenthesisPatch {
    private Stack<String> vals = new Stack<>();
    private Stack<String> ops = new Stack<>();
    public String patch(String s){
        for(int i = 0;i < s.length();i++)
        {
            String sub = s.substring(i,i+1);
            if (sub.equals("+")||sub.equals("-")||"*".equals(sub)||"/".equals(sub))
            {
                ops.push(sub);
            }
            else if(sub.equals(")"))
            {
                String res = ")"+vals.pop()+ops.pop()+vals.pop()+"(";
                vals.push(res);
            }
            else{
                vals.push(sub);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ParenthesisPatch patch = new ParenthesisPatch();
        System.out.println(patch.patch("1+2)*3-4)*5-6)))"));
    }
}
