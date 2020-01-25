/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kemalmaulana
 */
public class Test2 {

    static int[] maximumSubArray(int a[]) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int start = 0;
        int end = 0;
        int s = 0;
        int[] output;

        for (int i = 0; i < a.length; i++) {
            max_ending_here += a[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }


            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }

        }
        int sized = (end - start) + 1;
        output = new int[sized];
        int loop = 0;
        while ((start <= end) && (loop<end)) {
            output[loop] = a[start];
            start++;
            loop++;
        }

        return output;
    }

    public static void main(String[] args) {
        int[] a = {1, -3, 5, -2, 9, -8, -6, 4};
        int[] output = maximumSubArray(a);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

}
