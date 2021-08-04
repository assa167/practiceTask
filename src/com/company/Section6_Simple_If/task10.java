package com.company.Section6_Simple_If;

import java.io.*;

public class task10 {

    public static void main(String[] args) {
        FileInputStream file = null;
        InputStreamReader isr = null;
        int c = 0;
        try {
            file = new FileInputStream("/Users/dsarz/IdeaProjects/practiceTask/src/com/company/Section6_Simple_If/resources/file_tut.txt");
            isr = new InputStreamReader(file, "UTF-8");
            while ((c = isr.read()) != -1){
                System.out.print((char)c);
            };
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
