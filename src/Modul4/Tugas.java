package Modul4;

public class Tugas {

    int[][] angka, hasil, jml;

    void setAngka(int[][] angka) {
        this.angka = angka;
        angka = null;
    }

    int[][] getAngka() {
        return angka;
    }

    void setJml(int[][] angka, int jml[][]) {
        hasil = angka;
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                hasil[i][j] = jml[i][j] + angka[i][j];
            }
        }
        angka = null; //menghapus variabel dari memory
    }

    int[][] getJml() {
        return hasil;
    }

//    double[][] setUbah(int[][] arrayBaru) {
//        double[][] ubah = new double[2][3];
//        for (int i = 0; i < arrayBaru.length; i++) {
//            for (int j = 0; j < arrayBaru[i].length; j++) {
//            ubah[i][j] = arrayBaru[i][j];    
//            }
//        }
//        return ubah;
//    }
//
    double[][] ubah, hasil2;
    void setKali(double[][] angka, double a) {
        hasil2 = angka;
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                hasil2[i][j] = angka[i][j] * 0.5;
            }
        }
    }

    double[][] getKali() {
        return hasil2;
    }

    void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    void tampil(String data[][]) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println(" ");
        }
        data = null;
    }

    void tampil(int data[][]) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println(" ");
        }
        data = null;
    }

    void tampil(double data[][]) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
        }
    }

    void hapus() {
        angka = null;
        hasil = null;
    }
}

class main {

    public static void main(String[] args) {
        Tugas ob = new Tugas();
        int[][] angka = {
            {1, 2},
            {3, 5},
            {6, 7}
        };
        int[][] penjumlah = {
            {8, 9},
            {10, 11},
            {12, 13}
        };
        ob.tampil("Data Matrix A : ");
        ob.setAngka(angka);
        ob.tampil(ob.getAngka());
        ob.tampil("");
        ob.tampil("Data Matrix B : ");
        ob.setAngka(penjumlah);
        ob.tampil(ob.getAngka());
        ob.tampil("");
        ob.tampil("Matrix Hasil Penjumlahan");
        ob.setJml(angka, penjumlah);
        int[][] arrayBaru = ob.getJml();
        ob.tampil(ob.getJml());
//        double[][] ubah = ob.setUbah(arrayBaru);
//        double[][] kedua = ob.setKali(ubah, 0.5);

        double angka2[][] = {
            {9, 11},
            {13, 16},
            {18, 20}
        };
        ob.setKali(angka2, 0.5);
        ob.tampil("");
        ob.tampil("Hasil Perkalian Matrix Adalah : ");
        ob.tampil(ob.getKali());
    }
}
