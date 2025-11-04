/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
public class CheckingAccountLatihan2Inheritance extends AccountLatihan2Inheritance {
    double overdraftLimit;

    public CheckingAccountLatihan2Inheritance(String accNo, double balance, double overdraftLimit) {
        super(accNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void showOverdraft() {
        System.out.println("Akun " + accNo + " memiliki limit overdraft sebesar " + overdraftLimit);
    }
}
