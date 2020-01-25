/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kemalmaulana
 */
public class Test4 {

    static int minCoins(int coins[], int V) {
        int table[] = new int[V + 1];

        table[0] = 0;

        for (int i = 1; i <= V; i++) {
            table[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i <= V; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    int sub_res = table[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE
                            && sub_res + 1 < table[i]) {
                        table[i] = sub_res + 1;
                    }
                }
            }
        }
        return table[V];
    }

    public static void main(String[] args) {
        int[] denomination = {1, 2, 4, 8};
        System.out.println(minCoins(denomination, 46));

    }
}
