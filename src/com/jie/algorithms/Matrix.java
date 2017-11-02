package com.jie.algorithms;

/**
 * Created by IntelliJ IDEA.
 *<p>
 * @author fengjie
 * @Description 矩阵相乘
 * @Date Created in 17-10-25
 * @Time 下午2:45
 */
public class Matrix {
    public double[][] multi(double [][] a,double [][] b)
    {
        int m = a.length;
        int n = b[0].length;
        double[][] c = new double[m][n];
        for (int i = 0;i < m;i++)
        {
            for (int j = 0; j < m;j++)
            {
                for (int k = 0;k < m;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        double [][] a = new double[2][];
    }
}
