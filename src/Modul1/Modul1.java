package Modul1;

import javax.swing.JOptionPane;

public class Modul1 {

    static void cetak() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Angka ke " + i);
        }
    }

    static void coba(int a) {
        a = 0;
        do {
            System.out.println("Angkanya adalah " + a);
            a++;
        } while (a <= 12);
    }

    static int tiga(int angka) {
        return (angka * angka) / 2;
    }

    public static class kendaraan {

        private String merk;
        private long harga;

        public void setMerk(String merkKendaraan) {
            merk = merkKendaraan;
        }

        public String getMerk() {
            return merk;
        }

        public long harga(long hargaKendaraan) {
            return harga = hargaKendaraan;
        }
    }
}

//Enkapsulasi 
class Enkapsulasi {

    private int panjang, lebar, tinggi;
    private double vBalok;

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setVBalok(int panjang, int lebar, int tinggi) {
        vBalok = (double) (panjang * lebar * tinggi);
    }

    public double getVBalok() {
        return vBalok;
    }
}

class MainEnkapsulasi {

    public static void main(String[] args) {
        Enkapsulasi cb = new Enkapsulasi();
        cb.setPanjang(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang")));
        cb.setLebar(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Lebar")));
        cb.setTinggi(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Tinggi")));
        System.out.println("Nilai Panjang Adalah" + cb.getPanjang());
        System.out.println("Nilai Lebar Adalah " + cb.getLebar());
        System.out.println("Nilai Tinggi Adalah " + cb.getTinggi());
        cb.setVBalok(cb.getPanjang(), cb.getLebar(), cb.getTinggi());
        System.out.println("Volume balok adalah " + cb.getVBalok());
    }
}

class overloading {

    public void cetak() {
        System.out.println("I Love " +JOptionPane.showInputDialog("Masukkan benda yang dicintai"));
    }
    
    public void cetak (int i){
        System.out.println("Method dengan satu parameter " +i);
    }
    
    public void cetak(int i, int j){
        System.out.println("Methode dengan dua parameter " +i+ " $ " +j);
    }

    public void cetak(String objek){
        System.out.println("Objeknya " +objek);
    }
    
    public static void main(String[] args) {
        overloading benda = new overloading();
        benda.cetak();
        benda.cetak(7);
        benda.cetak(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka Pertama")),Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka Kedua")));
        benda.cetak(JOptionPane.showInputDialog("Masukkan Nama Benda"));
    }
}
