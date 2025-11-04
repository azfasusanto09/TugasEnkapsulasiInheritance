/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
public class MainLatihan4Enkapsulasi {
    public static void main(String[] args) {
        ImmutableStudentLatihan4Enkapsulasi s1 = new ImmutableStudentLatihan4Enkapsulasi("Azfa", 90);

        System.out.println("Nama: " + s1.getName());
        System.out.println("Nilai awal: " + s1.getScore());

        // Tambah nilai → menghasilkan objek baru
        ImmutableStudentLatihan4Enkapsulasi s2 = s1.withAddedScore(5);
        System.out.println("Setelah tambah 5:");
        System.out.println("Nilai lama: " + s1.getScore());
        System.out.println("Nilai baru: " + s2.getScore());

        // Coba tambah nilai melebihi batas
        ImmutableStudentLatihan4Enkapsulasi s3 = s2.withAddedScore(20);
        System.out.println("Setelah coba tambah 20:");
        System.out.println("Hasil nilai: " + s3.getScore());
    }
}
