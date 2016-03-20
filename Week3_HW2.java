/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_hw2;

import java.util.*;

/**
 *
 * @author 子溦
 */
public class Week3_HW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String[] name = new String[100];
        String search;
        int[] score = new int[100];
        int n = 0, s = 0;
        while (true) {
            System.out.print("輸入學生姓名(-1結束):");
            name[n] = scanner.nextLine();
            if (name[n].matches("-1")) {
                break;
            }
            n++;
            System.out.print("成績");
            score[s] = Integer.valueOf(scanner.nextLine());
            s++;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < n; i++) {
            hashMap.put(name[i], score[i]);
        }
        System.out.println("hashMap=" + hashMap);

        while (true) {
            System.out.print("輸入要搜尋的姓名(-1結束): ");
            search = scanner.next();
            if (search.equals("-1")) {
                break;
            }
            System.out.println(hashMap.get(search));

        }

    }
}
