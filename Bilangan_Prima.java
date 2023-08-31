package Bilangan;

import java.util.ArrayList;
import java.util.Scanner;

public class Bilangan_Prima {
    public static void main(String[] args) {
        int bilangan,cek=0;
        System.out.println("Selamat Datang di program Cek Bilangan");
        System.out.println("========================================");
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Masukan Bilangan Bulat : ");
        bilangan = keyBoard.nextInt();

        for (int i=2; i<=bilangan; i++){
            if (bilangan%i==0){
                cek++;
            }
        }

        if (cek==1){
            System.out.println(bilangan+" adalah bilangan prima");
        }else {
            ArrayList<Integer> nonBilanganPrima = new ArrayList<Integer>();
            for (int i = 2; i <= bilangan / 2; i++) {
                if (bilangan % i == 0) {
                    nonBilanganPrima.add(i);
                    // System.out.print(i + ","
                }
            }
            
            System.out.print(bilangan+" adalah bilangan bukan prima karena bisa dibagi dengan : ");
            for (int i = 0; i < nonBilanganPrima.size(); i++) {
                System.out.print(nonBilanganPrima.get(i));
                if (i < nonBilanganPrima.size() - 1)
                    System.out.print(", ");
                else
                    System.out.println("");

            }


        } 
    }   
}
