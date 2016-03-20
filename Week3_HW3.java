/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_hw3;

import java.util.*;
import java.io.*;

/**
 *
 * @author 子溦
 */
public class Week3_HW3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        HashMap hashMap = new HashMap();
        int op, t;
        String part, search;
        String[] afterSplit;

        FileWriter fw = new FileWriter("test.txt", true);//寫檔，true繼續接下去
        fw.flush();
        fw.close();

        FileReader fr = new FileReader("test.txt");//讀檔
        BufferedReader br = new BufferedReader(fr);
        while (br.ready()) {
            String ch = br.readLine();
            hashMap.put(ch, br.readLine());
        }
        fr.close();

        while (true) {
            System.out.println("選項 1.新增字符 2.輸入字符來查詢他們出現的次數 -1.");
            op = Integer.valueOf(scanner.nextLine());
            if (op == 1) {
                System.out.println("請輸入一行英文:");
                part = (scanner.nextLine()).toLowerCase();//轉小寫
                afterSplit = part.split("[ ,;\\s\\.]+");
                for (int i = 0; i < afterSplit.length; i++) {
                    if (hashMap.get(afterSplit[i]) == null) {
                        hashMap.put(afterSplit[i], 1);
                    } else {
                        t = Integer.parseInt(hashMap.get(afterSplit[i]).toString());
                        t++;
                        hashMap.put(afterSplit[i], t);
                    }
                }

            } else if (op == 2) {
                System.out.print("輸入要搜尋的字(-1結束): ");
                search = scanner.nextLine().toLowerCase();
                if (search.equals("-1")) {
                    break;
                }
                System.out.println(hashMap.get(search));

            } else if (op == -1) {
                 fw = new FileWriter("test.txt", true);
                for (Object key : hashMap.keySet()) {
                    fw.write(key + "\n" + hashMap.get(key) + "\n");
                }
                fw.flush();
                fw.close();
                break;
            } else {
                System.out.println("輸入錯誤");
            }
        }

    }

}
