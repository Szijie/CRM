package com.yjxxt.crm;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        Scanner can=new Scanner(System.in);
        String str=can.next();
        String[] strArray=str.split(",");
        System.out.println(Arrays.toString(change(strArray)));
    }

    private static String[] change(String[] strArray) {
        for (int i = 0; i < strArray.length ; i+=2) {
            if(strArray.length%2!=0&&i==strArray.length-1){
                break;
            }
                String str=strArray[i];
                strArray[i]=strArray[i+1];
                strArray[i+1]=str;
        }
        return strArray;
    }
}
