package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("mời bạn lựa chọn loại tiền tệ 1: vnd; 2: usd;");
        float  tiente ;
        int nhap;
        Scanner scanner = new Scanner(System.in);
         nhap = scanner.nextInt();

        switch (nhap){
            case 1:
                System.out.println(" bạn đã lựa chọn vnd sang usd");
                tiente = scanner.nextFloat();
                float vnd = tiente / 23000 ;
                System.out.println("so tien doi duoc: " + vnd + " usd");
                break;
            case 2:
                System.out.println("ban lua chon doi usd sang vnd");
                tiente = scanner.nextFloat();
                float usd =  tiente*23000 ;
                System.out.println(" so tien ban nhan duoc : " + usd + " vnd");
                break;
        }
    }
}
