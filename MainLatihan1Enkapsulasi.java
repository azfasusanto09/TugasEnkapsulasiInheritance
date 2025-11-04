/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
public class MainLatihan1Enkapsulasi {
    public static void main(String[] args) {
        // Membuat objek Student
        StudentLatihan1Enkapsulasi s1 = new StudentLatihan1Enkapsulasi("Azfa", 90);

        // Menampilkan data awal
        System.out.println("Nama: " + s1.getName());
        System.out.println("Nilai awal: " + s1.getScore());

        // Mengubah nilai dengan setter yang valid
        s1.setScore(95);
        System.out.println("Nilai setelah diubah: " + s1.getScore());

        // Menguji input tidak valid
        try {
            s1.setScore(120); // Akan memicu pengecualian
        } catch (IllegalArgumentException e) {
            System.out.println("" + e.getMessage());
        }
    }
}
