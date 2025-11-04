/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
public class AccountLatihan2Inheritance {
    String accNo;
    double balance;

    public AccountLatihan2Inheritance(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void showInfo() {
        System.out.println("Nomor Akun: " + accNo + ", Saldo: " + balance);
    }
}
