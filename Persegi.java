package HitungLuasVolume;

import java.util.Scanner;

public class Persegi extends Shape{
    private double sisi;

    Scanner input = new Scanner(System.in);
    
    @Override
    public double GetArea() {
        System.out.print("Masukkan panjang sisi : ");
        sisi = input.nextInt();
        return sisi*sisi;
    }
}

