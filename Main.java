package com.company;

import java.util.Scanner;

// id:106021218
// name:劉韋祥
// date:2017 9 25
// purpose:公升轉加侖
public class Main {

    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int val = Scn.nextInt();
        System.out.println(Math.round((val*0.26418)*10)/10f);
    }
}
