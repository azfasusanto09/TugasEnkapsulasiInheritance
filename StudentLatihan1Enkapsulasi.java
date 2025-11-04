/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
public class StudentLatihan1Enkapsulasi {
    // Atribut bersifat private untuk menjaga enkapsulasi
    private String name;
    private int score;

    // Constructor untuk inisialisasi nilai awal
    public StudentLatihan1Enkapsulasi(String name, int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score harus diantara 0 sampai 100");
        }
        this.name = name;
        this.score = score;
    }

    // Getter untuk mengambil nilai name
    public String getName() {
        return name;
    }

    // Getter untuk mengambil nilai score
    public int getScore() {
        return score;
    }

    // Setter dengan validasi rentang score
    public void setScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score harus diantara 0 sampai 100");
        }
        this.score = score;
    }
}
