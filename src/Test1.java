
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kemalmaulana
 */
public class Test1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {9, 10, 8, 4, 5, 3};
        boolean hasil = false;
        int value = 0;
        int input = sc.nextInt();
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length; j++) {
                if(input == (array[i]+array[j])) {
                    value = array[i]+array[j];
                    hasil = true;
                }
            }
        }
        System.out.println(value);
        System.out.println(hasil);
        System.out.println(Integer.MIN_VALUE);
    }
    
}
