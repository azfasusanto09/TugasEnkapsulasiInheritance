/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
public class MainLatihan2Inheritance {
    public static void main(String[] args) {
        // Buat beberapa akun tabungan dan giro
        AccountLatihan2Inheritance[] accounts = {
            new SavingsAccountLatihan2Inheritance("S001", 1000000, 0.05),
            new CheckingAccountLatihan2Inheritance("C001", 2000000, 500000),
            new SavingsAccountLatihan2Inheritance("S002", 1500000, 0.03),
            new CheckingAccountLatihan2Inheritance("C002", 1000000, 300000)
        };

        System.out.println("=== Sebelum bunga ditambahkan ===");
        for (AccountLatihan2Inheritance acc : accounts) {
            acc.showInfo();
        }

        System.out.println("\n=== Menambahkan bunga ke akun tabungan ===");
        for (AccountLatihan2Inheritance acc : accounts) {
            if (acc instanceof SavingsAccountLatihan2Inheritance) {
                SavingsAccountLatihan2Inheritance sa = (SavingsAccountLatihan2Inheritance) acc; // casting dari Account ke SavingsAccount
                sa.addInterest();
            }
        }

        System.out.println("\n=== Setelah bunga ditambahkan ===");
        for (AccountLatihan2Inheritance acc : accounts) {
            acc.showInfo();
        }
    }
}
