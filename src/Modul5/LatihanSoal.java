package Modul5;

import javax.swing.JOptionPane;

public class LatihanSoal {
    
    String judul, aktor, sutradara, publisher, kategori;
    int stok;
    
    void setJudul(String judul) {
        this.judul = judul;
        judul = null;
    }
    
    String getJudul() {
        return judul;
    }
    
    void setAktor(String aktor) {
        this.aktor = aktor;
        aktor = null;
    }
    
    String getAktor() {
        return aktor;
    }
    
    void setSutradara(String sutradara) {
        this.sutradara = sutradara;
        sutradara = null;
    }
    
    String getSutradara() {
        return sutradara;
    }
    
    void setPublish(String publish) {
        this.publisher = publish;
        publish = null;
    }
    
    String getPublish() {
        return publisher;
    }
    
    void setKategori(String categori) {
        this.kategori = categori;
        categori = null;
    }
    
    String getKategori() {
        return kategori;
    }
    
    void setStok(int stoc) {
        this.stok = stoc;
    }
    
    int getStok() {
        return stok;
    }
    
    void tampil(String a) {
        System.out.print(a);
        a = null;
    }
    
    void tampil(int a) {
        System.out.print(a);
        System.out.println("");
    }
}

class main {

    public static void main(String[] args) {
        LatihanSoal ob = new LatihanSoal();
        String judul, aktor, sutradara, publish, kategori;
        int stok;
        
        int batas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah VCD"));
        for (int i = 1; i <= batas; i++) {
            System.out.println("Film Ke " + i);
            judul = JOptionPane.showInputDialog("Judul Film : ");
            ob.setJudul(judul);
            ob.tampil("Merek : " + ob.getJudul() + "\n");
            
            aktor = JOptionPane.showInputDialog("Aktor");
            ob.setAktor(aktor);
            ob.tampil("Aktor : " + ob.getAktor() + "\n");
            
            sutradara = JOptionPane.showInputDialog("Sutradara");
            ob.setSutradara(sutradara);
            ob.tampil("Sutradara : " + ob.getSutradara() + "\n");
            
            publish = JOptionPane.showInputDialog("Publisher");
            ob.setPublish(publish);
            ob.tampil("Publisher : " + ob.getPublish() + "\n");
            
            kategori = JOptionPane.showInputDialog("Kategori");
            ob.setKategori(kategori);
            ob.tampil("Sutradara : " + ob.getKategori() + "\n");
            
            stok = Integer.parseInt(JOptionPane.showInputDialog("Stok"));
            ob.setStok(stok);
            ob.tampil("Stok : " + ob.getStok() + "\n");
            
            ob.tampil("======== \n\n");
        }
    }
}
