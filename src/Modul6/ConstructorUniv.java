package Modul6;

import static Modul6.ConstructorUniv.univer;
import javax.swing.JOptionPane;

public class ConstructorUniv {

    static String univer;

    protected ConstructorUniv() {
        univer = null;
    }

    protected ConstructorUniv(String univ) {
        this.univer = univ;
        univ = null;
    }

    static void setUniv(String univ) {
        ConstructorUniv.univer = univ;
    }

    static String getUniv() {
        return ConstructorUniv.univer;
    }

}

class DataMhs {

    static String nama, alamat, jurusan;
    String nim;

    void setNim(String nim) {
        this.nim = nim;
    }

    String getNim() {
        return nim;
    }

    void setNama(String nama) {
        DataMhs.nama = nama;
    }

    String getNama() {
        return DataMhs.nama;
    }

    void setAlamat(String alamat) {
        DataMhs.alamat = alamat;
    }

    String getAlamat() {
        return DataMhs.alamat;
    }

    void setJurusan(String jurusan) {
        DataMhs.jurusan = jurusan;
    }

    String getJurusan() {
        return DataMhs.jurusan;
    }

}

class main {

    static void utama() {
        String univ, nim, nama, alamat, jurusan;

        univ = JOptionPane.showInputDialog("Masukkan Nama Universitas");
        nim = JOptionPane.showInputDialog("Masukkan NIM");
        nama = JOptionPane.showInputDialog("Masukkan Nama Mahasiswa");
        alamat = JOptionPane.showInputDialog("Masukkan Alamat");
        jurusan = JOptionPane.showInputDialog("Masukkan Jurusan");

        ConstructorUniv.setUniv(univ);
        System.out.println("Universitas : " + ConstructorUniv.getUniv());

        DataMhs ob = new DataMhs();
        ob.setNim(nim);
        System.out.println("NIM : " + ob.getNim());

        ob.setNama(nama);
        System.out.println("Nama : " + ob.getNama());

        ob.setAlamat(alamat);
        System.out.println("Alamat : " + ob.getAlamat());

        ob.setJurusan(jurusan);
        System.out.println("Jurusan : " + ob.getJurusan());
        
        System.out.println("=========");

    }

    public static void main(String[] args) {
        utama();
        String opsi = JOptionPane.showInputDialog("Apakah Ingin Memasukkan Data ? (Y/T)");
        int ulang = Integer.parseInt(JOptionPane.showInputDialog("Berapa Kali Pengulangan ?"));
        if (opsi.equals("Y")) {
            for (int i = 0; i < ulang; i++) {
                utama();
            }
        } else {
            System.exit(0);
        }
    }
}
