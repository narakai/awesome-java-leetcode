package com.blankj.custom.pretest;

import java.math.BigInteger;
//1、1、2、3、5、8、13、21

public class Fibonacci {
    // 1. 递归 复杂度为O(2^n)，即2的n次方
    static BigInteger fib1(int n) {
        if (n == 1 || n == 2) {
            return BigInteger.valueOf(1);
        } else {
            return fib1(n - 1).add(fib1(n - 2));
        }
    }

    // 2. 循环 O(n)
    static BigInteger fib2(int n) {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        for (int j = 2; j <= n; j++) {
            BigInteger tmp = a;//将第一个值p赋给tmp
            a = b;       //将第二个值q赋给p,以后每一次赋值都将得到的最新的F(n)赋给p,从后面语句可//以看出,q储存的为最新的F(n)
            b = tmp.add(b);
        }
        return b;
    }

    // 3. matrix log(n)
    /**
     * 求斐波那契数列<br/>
     * <pre>
     * [F(n+1) F(n)]    [1  1 ]^n   (n次方,可以使用归纳法证明)<br/>
     * |           |   =|     |                     <br/>
     * [F(n) F(n-1)]    [1  0 ]                     <br/>
     * </pre>
     *
     * @author bing
     */

//    https://blog.csdn.net/flyfish1986/article/details/48014523

    // 关联矩阵
    private static final BigInteger[][] UNIT = {{BigInteger.valueOf(1), BigInteger.valueOf(1)}, {BigInteger.valueOf(1), BigInteger.valueOf(0)}};
    // 全0矩阵
    private static final BigInteger[][] ZERO = {{BigInteger.valueOf(0), BigInteger.valueOf(0)}, {BigInteger.valueOf(0), BigInteger.valueOf(0)}};

    /**
     * 求斐波那契数列
     *
     * @param n
     * @return
     */
//    问题转换为二阶矩阵的n次幂
    public static BigInteger[][] fib3(int n) {
        if (n == 0) {
            return ZERO;
        }
        if (n == 1) {
            return UNIT;
        }
        // n是偶数
        //以计算A6为例
        //将6转化成二进制110 为A的4次方 和 A的2次方
        if ((n & 1) == 0) {
            BigInteger[][] matrix = fib3(n >> 1);
            return matrixMultiply(matrix, matrix);
        }
        // n是奇数
        //10进制7 = 二进制 111
//        例如A7=A4次方∗A2次方∗A
        BigInteger[][] matrix = fib3((n - 1) >> 1);
        return matrixMultiply(matrixMultiply(matrix, matrix), UNIT);
    }

    /**
     * 矩阵相乘
     *
     * @param m r1*c1
     * @param n c1*c2
     * @return 新矩阵, r1*c2
     */
    public static BigInteger[][] matrixMultiply(BigInteger[][] m, BigInteger[][] n) {
        int rows = m.length;
        int cols = n[0].length;
        BigInteger[][] r = new BigInteger[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                r[i][j] = BigInteger.valueOf(0);
                for (int k = 0; k < m[i].length; k++) {
                    r[i][j] = r[i][j].add(m[i][k].multiply(n[k][j]));
                }
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int n = 81;
//        System.out.println("Fibonacci of " + n +
//                "th term" + " " + "is" + " " + fib2(n));
        BigInteger[][] m = fib3(n);
        System.out.println(m[0][1]);
    }
}
