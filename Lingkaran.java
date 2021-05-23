package HitungLuasVolume;

import java.util.Scanner;

public class Lingkaran extends Shape{
    double phi = (float) 3.14;
    double r;

    Scanner input = new Scanner(System.in);
    
    @Override
    public double GetArea() {
        System.out.print("Masukkan jari-jari lingkaran : ");
        r = input.nextInt();
        return phi * r * r;
    }
}


