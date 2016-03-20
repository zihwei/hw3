/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_hw1;
import java.util.*;

/**
 *
 * @author 子溦
 */
public class Week3_HW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String part;
        String[] afterSplit;
        String[] num = new String[30];
        int n = 0;
        String[] words = new String[30];
        int w = 0;
        int count = 0;

        int sum = 0;
        System.out.println("請輸入一行英文:");
        part = (scanner.nextLine()).toLowerCase();//轉小寫
        afterSplit = part.split("[ ,;\\s\\.]+");
        for (int i = 0; i < afterSplit.length; i++) {
            count = 0;
            char[] str = afterSplit[i].toCharArray();
            for (int j = 0; j < str.length; j++) {
                if (Character.isDigit(str[j])) {
                    sum = sum + Integer.parseInt(String.valueOf(str[j]));
                    num[n] = String.valueOf(str[j]);
                    n++;
                    count++;
                }
            }
            if (count == 0) {
                words[w] = afterSplit[i];
                w++;
            }
        }
        System.out.println("數字總和:" + sum);
        for (int i = 0; i < num.length; i++) {
            if (num[i] != null) {
                System.out.print(num[i] + "\t");
            }
        }
        System.out.println();
        System.out.println("字串有:");

        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                System.out.print(words[i]+"\t");
            }
        }


//        for (int i=0;i<afterSplit.length;i++)
//        System.out.println(afterSplit[i]);
    }

}
