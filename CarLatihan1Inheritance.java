/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
public class CarLatihan1Inheritance extends VehicleLatihan1Inheritance {
    public CarLatihan1Inheritance(String brand) {
        super(brand); // panggil constructor milik Vehicle
    }

    @Override
    void start() {
        System.out.println(brand + " mobil dinyalakan dengan kunci!");
    }
}
