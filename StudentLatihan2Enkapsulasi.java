/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
public class StudentLatihan2Enkapsulasi {
    private String name;
    private int score;

    public StudentLatihan2Enkapsulasi(String name, int score) {
        if (score > 0 && score < 100) {
            this.name = name;
            this.score = score;
        } else {
            System.out.println("Score harus di antara 0 sampai 100");
            this.name = name;
            this.score = 0; // default jika nilai awal tidak valid
        }
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // Tambahkan nilai (dengan batas maksimum 100)
    public void addScore(int delta) {
        if (score + delta < 100) {
            score += delta;
        } else {
            System.out.println("Penambahan harus dibawah batas maksimum (100)");
        }
    }

    // Kurangi nilai (dengan batas minimum 0)
    public void reduceScore(int delta) {
        if (score - delta > 0) {
            score -= delta;
        } else {
            System.out.println("Pengurangan harus diatas batas minimum (0)");
        }
    }
}
