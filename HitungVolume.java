package HitungLuasVolume;

import java.util.Scanner;

public class HitungVolume implements Volume{
    double phi = (float) 3.14;
    double r, tinggi, volume, sisi, panjang, lebar;
    
    Scanner input = new Scanner(System.in);
   
    @Override
    public void Kubus() {
        System.out.print("Masukkan panjang sisi : ");
        sisi = input.nextInt();
        volume = sisi * sisi * sisi;
        System.out.println("Volume kubus : "+ volume + " cm^3");
    }

    @Override
    public void Tabung() {
        System.out.print("Masukkan jari - jari : ");
        r = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextInt();   
        volume = phi * r * r * tinggi;
        System.out.println("Volume Tabung : "+ volume + " cm^3");
    }
     @Override
    public void Balok() {
        System.out.print("Masukkan panjang sisi : ");
        panjang = input.nextInt();
        System.out.print("Masukkan panjang lebar : ");
        lebar = input.nextInt();
        System.out.print("Masukkan panjang tinggi : ");
        tinggi = input.nextInt();
        volume = panjang * lebar * tinggi;
        System.out.println("Volume balok : "+ volume + " cm^3");
    }

    @Override
    public void Kerucut () {
        System.out.print("Masukkan jari - jari : ");
        r = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextInt();   
        volume = 0.33 * phi * r * r * tinggi;
        System.out.println("Volume Kerucut : "+ volume + " cm^3");
    }
   
   
}
