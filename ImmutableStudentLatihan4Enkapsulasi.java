/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
public final class ImmutableStudentLatihan4Enkapsulasi {
    private final String name;
    private final int score;

    public ImmutableStudentLatihan4Enkapsulasi(String name, int score) {
        if (score <= 0 || score >= 100) {
            throw new IllegalArgumentException("Score harus di antara 0 sampai 100");
        }
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // Membuat objek baru dengan score yang sudah ditambah
    public ImmutableStudentLatihan4Enkapsulasi withAddedScore(int delta) {
        int newScore = this.score + delta;

        if (newScore <= 0 || newScore >= 100) {
            System.out.println("Score hasil perubahan harus di antara 0 sampai 100");
            return this; // kembalikan objek lama kalau tidak valid
        }

        return new ImmutableStudentLatihan4Enkapsulasi(this.name, newScore);
    }
}
