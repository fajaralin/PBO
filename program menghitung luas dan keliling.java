/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author ThinkBook
 */
  import java.util.Scanner;1
public class JavaApplication17 {

   



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menu pilihan
        System.out.println("Pilih bangun yang ingin dihitung:");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Kubus");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1: // Persegi
                System.out.print("Masukkan sisi persegi: ");
                double sisi = input.nextDouble();
                double luasPersegi = sisi * sisi;
                double kelilingPersegi = 4 * sisi;
                System.out.println("Luas Persegi: " + luasPersegi);
                System.out.println("Keliling Persegi: " + kelilingPersegi);
                break;

            case 2: // Segitiga
                System.out.print("Masukkan alas segitiga: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = input.nextDouble();
                System.out.print("Masukkan sisi pertama: ");
                double sisi1 = input.nextDouble();
                System.out.print("Masukkan sisi kedua: ");
                double sisi2 = input.nextDouble();
                System.out.print("Masukkan sisi ketiga: ");
                double sisi3 = input.nextDouble();
                double luasSegitiga = 0.5 * alas * tinggi;
                double kelilingSegitiga = sisi1 + sisi2 + sisi3;
                System.out.println("Luas Segitiga: " + luasSegitiga);
                System.out.println("Keliling Segitiga: " + kelilingSegitiga);
                break;

            case 3: // Lingkaran
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();
                double luasLingkaran = Math.PI * jariJari * jariJari;
                double kelilingLingkaran = 2 * Math.PI * jariJari;
                System.out.println("Luas Lingkaran: " + luasLingkaran);
                System.out.println("Keliling Lingkaran: " + kelilingLingkaran);
                break;

            case 4: // Kubus
                System.out.print("Masukkan sisi kubus: ");
                double sisiKubus = input.nextDouble();
                double luasKubus = 6 * sisiKubus * sisiKubus;
                double kelilingKubus = 12 * sisiKubus;
                System.out.println("Luas Kubus: " + luasKubus);
                System.out.println("Keliling Kubus: " + kelilingKubus);
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
