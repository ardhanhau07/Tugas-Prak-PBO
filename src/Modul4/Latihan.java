package Modul4;

public class Latihan {

    String[][] mahasiswa;
    int[][] data, hasil;

    void setMahasiswa(String[][] mahasiswa) {
        this.mahasiswa = mahasiswa;
        mahasiswa = null;
    }

    String[][] getMahasiswa() {
        return mahasiswa;
    }

    void setData(int[][] data) {
        this.data = data;
        data = null;
    }

    int[][] getData() {
        return data;
    }

    void setPerkalianSkalar(int[][] data, int a) {
        hasil = data;
        for (int i = 0; i < data.length; i++) { //Baris
            for (int j = 0; j < data[i].length; j++) { //Kolom
                hasil[i][j] = a * data[i][j];
            }
        }
        data = null; //menghapus variabel parameter dari memory
    }

    int[][] getPerkalianSkalar() {
        return hasil;
    }

    void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    void tampil(String data[][]) {
        //deklarasi baris & kolom
        for (int i = 0; i < data.length; i++) { //baris
            for (int j = 0; j < data[i].length; j++) { //kolom
                System.out.print(data[i][j]+ " ");
            }
            System.out.println();
        }
        data = null;
    }

    void tampil(int data[][]) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][j]);
            }
            System.out.println();
        }
        data = null;
    }

    void hapus() {
        mahasiswa = null;
        data = null;
        hasil = null;
    }
}

class main {

    public static void main(String[] args) {
        Latihan ob = new Latihan();
        String[][] Mhs = {
            //            {kolom,Kolom}
            {"NIM", "NAMA"},
            {"17650123", "DAVID"},
            {"17650124", "AHMAD"},
            {"17650125", "RATIH"},
            {"17650126", "DINA"}};
        ob.tampil("Data Mahasiswa : ");
        ob.tampil(Mhs);
        ob.tampil(ob.getMahasiswa());
        ob.tampil("======");
        int[][] data = {
            //        {kolom,kolom}
            {1, 2},
            {3, 4},
            {5, 6}};
        int pengali = 2;
        ob.tampil("Data Matrix : ");
        ob.setData(data);
        ob.tampil(ob.getData());
        ob.tampil("Data Matrix X " + pengali + " : ");
        ob.setPerkalianSkalar(data, pengali);
        ob.tampil(ob.getPerkalianSkalar());

        //menghapus variabel dari memory untuk optimasi program
        ob.hapus();
        Mhs = null;
        data = null;
        ob = null;
    }
}
