package HitungLuasVolume;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilihan;
        HitungVolume v = new HitungVolume();
        Scanner input = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("    Program Menghitung Luas dan Volume    ");
        System.out.println("       --- Silahkan Pilih Menu ---        ");
        System.out.println("==========================================");
        System.out.println("1. Menghitung Luas ");
        System.out.println("2. Menghitung Volume ");
        System.out.println("==========================================");
        System.out.print("Inputkan pilihan Anda : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Lingkaran");
                System.out.println("==========================================");
                System.out.print("Inputkan Pilihan Anda: ");
                pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        Persegi a = new Persegi();
                        System.out.println("Luas persegi : " + a.GetArea() + " cm^2");
                        break;
                    case 2:
                        PersegiPanjang b = new PersegiPanjang();
                        System.out.println("Luas persegi panjang : " + b.GetArea() + " cm^2");
                        break;
                    case 3:
                        Segitiga c = new Segitiga();
                        System.out.println("Luas persegi panjang : " + c.GetArea() + " cm^2");
                        break;
                    case 4:
                        Lingkaran d = new Lingkaran();
                        System.out.println("Luas lingkaran : " + d.GetArea() + " cm^2");
                        break;
                    default:
                        System.out.println("Inputan yang Anda Masukkan Salah!");
                        break;
                }
                break;
            case 2:
                System.out.println("1. Kubus");
                System.out.println("2. Tabung");
                System.out.println("3. Balok");
                System.out.println("4. Kerucut");
                System.out.print("Inputkan Pilihan Anda : ");
                pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        v.Kubus();
                        break;
                    case 2:
                        v.Tabung();
                        break;
                    case 3:
                        v.Balok();
                        break;
                    case 4:
                        v.Kerucut ();
                        break;
                    default:
                        System.out.println("Inputan yang Anda Masukkan Salah!");
                        break;
                }
                break;
            default:
                System.out.println("Inputan yang Anda Masukkan Salah!");
                break;
        }
    }
}