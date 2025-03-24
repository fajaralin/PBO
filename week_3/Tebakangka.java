// package week3;

import java.util.Scanner;
import java.util.Random;

public class Tebakangka{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("===================");
        System.out.println("Tebak Angka");
        System.out.println("===================");

        //memasukan angka dari user
        int angka = random.nextInt(100);
        int tebakan = random.nextInt(100);
        System.out.println("Masukan Angka: ");
        // int angka = input.nextInt();

        System.out.println("Angka yang dimasukan adalah: " + angka);

        //tebakan
        // if(angka == tebakan){
        //     System.out.println("Selamat tebakan anda benar!" + tebakan);
        // }else{
        //     System.out.println("Tebakan anda salah! Angka yang benar adalah: " + tebakan);
        // }

        //do while
        do {
            System.out.println("Masukan Angka: ");
            tebakan = input.nextInt();
            if (angka == tebakan) {
            System.out.println("Selamat tebakan anda benar! Angka yang benar adalah: " + tebakan);
            } else {
            System.out.println("Tebakan anda salah! Coba lagi.");
            }

            if (angka < tebakan) {
            System.out.println("Angka terlalu besar");
            } 
            else if (angka > tebakan) {
            System.out.println("Angka terlalu kecil");
            }
        } while (angka != tebakan);
        System.out.println("Masukan Angka: ");
        tebakan = random.nextInt(100);




    }
}