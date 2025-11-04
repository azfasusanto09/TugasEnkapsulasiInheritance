/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
public class RectangleLatihan3Inheritance extends ShapeLatihan3Inheritance {
    private double width;
    private double height;

    public RectangleLatihan3Inheritance(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String getName() {
        return "Persegi Panjang";
    }
}
