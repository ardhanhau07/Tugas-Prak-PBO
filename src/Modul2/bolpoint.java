package Modul2;

import javax.swing.JOptionPane;

class global {

    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

public class bolpoint {

    private int stok, harga, hargaTotal;
    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setHargaTotal(int stok, int harga) {
        hargaTotal = stok * harga;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }
}

class Pensil {

    private int stok, harga, hargaTotal;
    private String nama;

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setHargaTotal(int stok, int harga) {
        hargaTotal = stok * harga;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }

}

class Penghapus {

    private int harga, stok, hargaTotal;

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setHargaTotal(int stok, int harga) {
        hargaTotal = stok * harga;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }
}

class compile {

    public static void main(String[] args) {
        int batas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Barang Yang Dibeli"));
        global umum = new global();
        bolpoint latihan = new bolpoint();
        Pensil pen = new Pensil();
        Penghapus hapus = new Penghapus();
        for (int i = 1; i <= batas; i++) {
            String nama = JOptionPane.showInputDialog("Masukkan Nama Benda");
            umum.setNama(nama);
            if (nama.equals("Pen")) {
                latihan.setStok(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Barang Yang Dibeli")));
                latihan.setHarga(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Harga Satuan")));
                System.out.println("Nama Alat Tulis :" + umum.getNama());
                System.out.println("Jumlah :" + latihan.getStok());
                System.out.println("Harga Satuan :" + latihan.getHarga());
                latihan.setHargaTotal(latihan.getStok(), latihan.getHarga());
                System.out.println("Harga " + umum.getNama() + " : " + latihan.getHargaTotal());
            }
            if (nama.equals("Pensil")) {
                pen.setStok(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Barang Yang Dibeli")));
                pen.setHarga(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Harga Barang")));
                System.out.println("Nama Alat Tulis :" + umum.getNama());
                System.out.println("Jumlah :" + pen.getStok());
                System.out.println("Harga Satuan :" + pen.getStok());
                pen.setHargaTotal(pen.getStok(), pen.getHarga());
                System.out.println("Harga" + umum.getNama() + " : " + pen.getHargaTotal());
            }
            if (nama.equals("Penghapus")) {
                hapus.setStok(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Barang Yang Dibeli")));
                hapus.setHarga(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Harga Barang")));
                System.out.println("Nama Alat Tulis :" + umum.getNama());
                System.out.println("Jumlah :" + hapus.getStok());
                System.out.println("Harga :" + hapus.getHarga());
                hapus.setHargaTotal(hapus.getStok(), hapus.getHarga());
                System.out.println("Harga " + umum.getNama() + " : " + hapus.getHargaTotal());
            }
            System.out.println("========");
        }
        int harga = latihan.getHargaTotal() + pen.getHargaTotal() + hapus.getHargaTotal();
        System.out.println("Harga Total adalah " + harga);
    }
}
