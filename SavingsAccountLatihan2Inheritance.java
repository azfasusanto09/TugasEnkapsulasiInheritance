/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
public class SavingsAccountLatihan2Inheritance extends AccountLatihan2Inheritance {
    double interestRate;

    public SavingsAccountLatihan2Inheritance(String accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    // Method khusus: menambahkan bunga ke saldo
    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Bunga sebesar " + interest + " telah ditambahkan ke akun " + accNo);
    }
}
