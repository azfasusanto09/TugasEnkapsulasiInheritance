/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
public class MainLatihan2Enkapsulasi {
    public static void main(String[] args) {
        StudentLatihan2Enkapsulasi s1 = new StudentLatihan2Enkapsulasi("Azfa", 90);

        System.out.println("Nama: " + s1.getName());
        System.out.println("Nilai awal: " + s1.getScore());

        s1.addScore(5);
        System.out.println("Setelah tambah nilai: " + s1.getScore());

        s1.reduceScore(20);
        System.out.println("Setelah dikurangi: " + s1.getScore());

        // Uji batasan
        s1.addScore(30);   // harus error (melebihi 100)
        s1.reduceScore(100); // harus error (kurang dari 0)
    }
}
