/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
import java.util.ArrayList;
import java.util.List;

public class TeamLatihan3Enkapsulasi {
    // daftar anggota hanya bisa diakses di dalam class ini
    private List<StudentLatihan2Enkapsulasi> members;

    public TeamLatihan3Enkapsulasi() {
        this.members = new ArrayList<>();
    }

    // Tambahkan anggota baru ke dalam tim
    public void addMember(StudentLatihan2Enkapsulasi s) {
        if (s != null) {
            members.add(s);
        } else {
            System.out.println("Tidak bisa menambahkan anggota null");
        }
    }

    // Kembalikan salinan list agar tidak bisa diubah dari luar
    public List<StudentLatihan2Enkapsulasi> getMembers() {
        return new ArrayList<>(members); // membuat salinan baru
    }
}
