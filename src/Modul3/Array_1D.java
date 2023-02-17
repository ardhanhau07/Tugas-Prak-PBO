package Modul3;

public class Array_1D {

    private String[] mhs;
    private int[] deret;
    private int hasilPenjumlahan;

    public void setMhs(String[] mhs) {
        this.mhs = mhs;
        mhs = null;
    }

    public String[] getMhs() {
        return mhs;
    }

    public void setDeret(int[] deret) {
        this.deret = deret;
        deret = null;
    }

    public int[] getDeret() {
        return deret;
    }

    public void setPenjumlahan(int[] deret) {
        hasilPenjumlahan = 0;
        for (int i = 0; i < deret.length; i++) {
            hasilPenjumlahan += deret[i];
        }
        deret = null;
    }

    public int getPenjumlahan() {
        return hasilPenjumlahan;
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
                data += a[i];
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

    public void hapus() {
        mhs = null;
        deret = null;
        hasilPenjumlahan = 0;
    }
}

class MainArray {

    public static void main(String[] args) {
        Array_1D jek = new Array_1D();
        String mahasiswa[] = {"Dono", "Danu", "Dana", "Dane", "Dano"};
        int deret[] = {2, 5, 6, 9, 7};
        jek.tampil("Daftar Mahasiswa : ");
        jek.setMhs(mahasiswa);
        jek.tampil(jek.getMhs());
        jek.tampil("======");
        jek.tampil("Deret : ");
        jek.setDeret(deret);
        jek.tampil(jek.getDeret());
        jek.tampil("Hasil Penjumlahan Deret : ");
        jek.setPenjumlahan(deret);
        jek.tampil(jek.getPenjumlahan());
        
        //menghapus memory
        jek.hapus();
        mahasiswa = null;
        deret = null;
        jek = null;
    }
}
