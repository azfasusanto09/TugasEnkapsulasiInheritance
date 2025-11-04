/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
public class MainLatihan1Inheritance {
    public static void main(String[] args) {
        VehicleLatihan1Inheritance[] vehicles = {
            new CarLatihan1Inheritance("Toyota"),
            new MotorcycleLatihan1Inheritance("Honda"),
            new CarLatihan1Inheritance("Mazda"),
            new MotorcycleLatihan1Inheritance("Yamaha")
        };

        for (VehicleLatihan1Inheritance v : vehicles) {
            v.start();
        }
    }
}
