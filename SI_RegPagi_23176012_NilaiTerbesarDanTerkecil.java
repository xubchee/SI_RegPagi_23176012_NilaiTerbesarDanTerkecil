/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.pertemuan6;

import java.util.Scanner;

/**
 *  Nama      : MOHAMMAD FAJAR SUBECHI
 *  NIM       : 23176012
 *  Prodi     : Sistem Infprmasi
 *  Deskripsi : program ini untuk mencari nilai terkecil dan nilai terbesar
 * @author ACER
 */
public class SI_RegPagi_23176012_NilaiTerbesarDanTerkecil {
public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("===== Program nilai terbesar dan terkecil mahasiswa =====");
        System.out.print("Masukan nama petugas : ");
        String petugas = inputan.nextLine();
        System.out.print("Masukan banyaknya mahasiswa : ");
        int jumlahMahasiswa = inputan.nextInt();
        double nilaiTerbesar = Double.MIN_VALUE;
        double nilaiTerkecil = Double.MAX_VALUE;
        
        for(int i=1; i<=jumlahMahasiswa; i++){
            System.out.print("Masukan nilai mahasiswa ke-"+i+" = ");
            double nilai = inputan.nextDouble();            
            if(nilai > nilaiTerbesar){
                nilaiTerbesar = nilai;
            }
            
            if(nilai < nilaiTerkecil){
                nilaiTerkecil = nilai;
            }
        }               
        
        
        
        System.out.println("\nNilai terbesar adalah : " +nilaiTerbesar);
        System.out.println("Nilai terkecil adalah : " +nilaiTerkecil);
        System.out.println("Petugas : " +petugas);
    }
    
}

