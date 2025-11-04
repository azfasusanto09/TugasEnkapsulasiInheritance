/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
public class MotorcycleLatihan1Inheritance extends VehicleLatihan1Inheritance {
    public MotorcycleLatihan1Inheritance(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " motor dinyalakan dengan kunci!");
    }
}
