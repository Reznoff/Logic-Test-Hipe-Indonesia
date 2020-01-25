/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kemalmaulana
 */
public class Test3 {

    public static int divide(int value, int divider) {          
        if (divider == -1 && value == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        long B = divider;
        long A = value;

        int sign = -1;
        if ((A < 0 && B < 0) || (A > 0 && B > 0)) {
            sign = 1;
        }
        if (A < 0) {
            A = A * -1;
        }
        if (B < 0) {
            B = B * -1;
        }

        int ans = 0;
        long currPos = 1;
        while (A >= B) {
            B <<= 1;
            currPos <<= 1;
        }
        B >>= 1;
        currPos >>= 1;
        while (currPos != 0) {
            if (A >= B) {
                A -= B;
                ans |= currPos;
            }
            B >>= 1;
            currPos >>= 1;
        }
        return ans * sign;
    }

    public static void main(String[] args) {
        System.out.println(divide(6, 3));
    }
}
