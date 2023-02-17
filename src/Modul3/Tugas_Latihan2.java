package Modul3;

import javax.swing.JOptionPane;

public class Tugas_Latihan2 {

    private int bil[], cari;

    public void setBil(int bil[]) {
        this.bil = bil;
        bil = null;
    }

    public int[] getBil() {
        return bil;
    }

    public void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    public void tampil(String a[]) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += ", " + a[i];
            }
        }
        System.out.println(data);
        a = null;
        data = null;
    }

    public void tampil(int a) {
        System.out.println(a);
    }

    public void tampil(int a[]) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += ", " + a[i];
            }
        }
        System.out.println(data);
        a = null;
        data = null;
    }

    public int setCari(int bil[], int cari) {
        if (bil == null) {
            return -1;
        }
        for (int i = 0; i < bil.length; i++) {
            if (cari == bil[i]) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    public int setGanti(int bil[], int ganti, int ubah) {
        for (int i = 0; i < bil.length; i++) {
            if (ganti == bil[i]) {
                bil[i] = ubah;
            }
        }
        return -1;
    }
}

class main {

    public static void main(String[] args) {
        Tugas_Latihan2 ob = new Tugas_Latihan2();
        int bil[] = new int[Integer.parseInt(JOptionPane.showInputDialog("Masukkan Banyaknya Angka"))];
        for (int i = 0; i < bil.length; i++) {
            bil[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Index Ke- " + i));
        }
        ob.setBil(bil);
        ob.tampil("Banyak Bilangan");
        ob.tampil(bil.length);
        ob.tampil("Bilangannya : ");
        ob.tampil(ob.getBil());
        int cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka Yang Kamu Cari"));
        ob.tampil(ob.setCari(bil, cari));
        int ganti = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka Yang Hendal Diganti"));
        int ubah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka Pengganti"));
        ob.tampil(ob.setGanti(bil, ganti, ubah));
    }
}

class Tugas_Latihan {

    int cari;
    int ganti;
    int kali;

    int getCari() {
        return this.cari;
    }

    void setCari(int cari) {
        this.cari = cari;
    }

    int getGanti() {
        return this.ganti;
    }

    void setGanti(int ganti) {
        this.ganti = ganti;
    }

    int[] gantiAngka(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == getCari()) {
                arr[i] = getGanti();
            }
        }
        return arr;
    }

    void setKali(int kali) {
        this.kali = kali;
    }

    int getKali() {
        return this.kali;
    }

    double[] KaliAngka(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 0.5;
        }
        return arr;
    }
    
    double[] ArrayKedua(int[] arrayBaru){
        double[] ubah = new double[arrayBaru.length];
        for (int i = 0; i < arrayBaru.length; i++) {
            ubah[i] = arrayBaru[i];
        }
        return ubah;
    }
}

class main2 {

    public static void main(String[] args) {
        int bil[] = {2, 5, 3, 5, 9, 5};
        int cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka Yang Dicari"));
        int ganti = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka Pengganti"));
        Tugas_Latihan ob = new Tugas_Latihan();
        ob.setCari(cari);
        ob.setGanti(ganti);

        int[] arrayBaru = ob.gantiAngka(bil);
        for (int a : arrayBaru) {
            System.out.print(a);
            System.out.print(",");
        }
        System.out.println("");
        double[] ubah = ob.ArrayKedua(arrayBaru);
        double[] arrayKedua = ob.KaliAngka(ubah);
        for (double b : arrayKedua) {
            System.out.print(b);
            System.out.print(",");
        }
        System.out.println("");
    }
}
