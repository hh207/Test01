package com.zb.test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        sc.close();
        Thread t = new Thread();
        //以直接以注解的形式使用。比如使用@Data 注解，新建一个 User 实体
        t.start();
    }
}

class Thread extends java.lang.Thread {
    @Override
    public void run() {
        System.out.println("阿龟");
    }
}
