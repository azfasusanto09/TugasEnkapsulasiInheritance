/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
public class MainLatihan3Enkapsulasi {
    public static void main(String[] args) {
        // Buat beberapa objek Student
        StudentLatihan2Enkapsulasi s1 = new StudentLatihan2Enkapsulasi("Azfa", 90);
        StudentLatihan2Enkapsulasi s2 = new StudentLatihan2Enkapsulasi("Hammam", 85);
        StudentLatihan2Enkapsulasi s3 = new StudentLatihan2Enkapsulasi("Indra", 81);

        // Buat tim dan tambahkan anggota
        TeamLatihan3Enkapsulasi team = new TeamLatihan3Enkapsulasi();
        team.addMember(s1);
        team.addMember(s2);
        team.addMember(s3);

        // Tampilkan daftar anggota
        System.out.println("Daftar anggota tim:");
        for (StudentLatihan2Enkapsulasi s : team.getMembers()) {
            System.out.println("- " + s.getName() + " (Nilai: " + s.getScore() + ")");
        }

        // Coba ubah list yang dikembalikan oleh getMembers()
        System.out.println("\nHasil menyalin anggota dari list hasil getMembers()...");
        team.getMembers().clear(); // ini tidak mempengaruhi list asli!

        // Tampilkan lagi daftar anggota untuk membuktikan list asli tidak berubah
        System.out.println("\nDaftar anggota tim setelah clear() dipanggil:");
        for (StudentLatihan2Enkapsulasi s : team.getMembers()) {
            System.out.println("- " + s.getName() + " (Nilai: " + s.getScore() + ")");
        }
    }
}
