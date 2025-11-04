/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author zc
 */
public class MainLatihan3Inheritance {
    public static void main(String[] args) {
        ShapeLatihan3Inheritance[] shapes = {
            new TriangleLatihan3Inheritance(10, 5),
            new RectangleLatihan3Inheritance(4, 6),
            new CircleLatihan3Inheritance(7)
        };

        double totalArea = 0;

        System.out.println("=== Hasil Perhitungan Luas Setiap Bentuk ===\n");

        for (ShapeLatihan3Inheritance s : shapes) {
            double area = s.area();
            System.out.println("Luas " + s.getName() + ": " + area);
            totalArea += area;
        }

        System.out.println("\nTotal luas semua bentuk: " + totalArea);
    }
}
