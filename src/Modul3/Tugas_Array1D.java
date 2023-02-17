package Modul3;

import javax.swing.JOptionPane;

public class Tugas_Array1D {

    private int bil[], maks, min, index;
    private double rata;

    public void setBil(int bil[]) {
        this.bil = bil;
        bil = null;
    }

    public int[] getBil() {
        return bil;
    }

    public void setRata(int bil[]) {
        int sum = 0;
        for (int i = 0; i < bil.length; i++) {
            sum += bil[i];
        }
        rata = sum / bil.length;
    }

    public double getRata() {
        return rata;
    }

    public void setmaks(int bil[]) {
        maks = bil[0];
        for (int i = 0; i < bil.length; i++) {
            if (bil[i] > maks) {
                maks = bil[i];
            }
        }
    }

    public int getMaks() {
        return maks;
    }
//
//    public void setMin(int bil[]) {
//        min = bil[0];
//        for (int i = 0; i < bil.length; i++) {
//            if (bil[i] < min) {
//                bil[i] = min;
//            }
//        }
//    }

    public void setMin(int bil[]) {
        int temp;
        for (int i = 0; i < bil.length; i++) {
            for (int j = i + 1; j < bil.length; j++) {
                if (bil[i] > bil[j]) {
                    temp = bil[i];
                    bil[i] = bil[j];
                    bil[j] = temp;
                }
            }
        }
    }

    public int getMin() {
        return bil[0];
    }
//
//    public void setIndex(int bil[]) {
//        int cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka Yang Kamu Cari"));
//        for (int i = 0; i < bil.length; i++) {
//            if (bil[i] == cari) {
//                index = i;
//                break;
//            }
//        }
//    }

    public int setIndex(int bil[], int cari) {
        if (bil == null) {
            return -1;
        }
        int len = bil.length;
        int i = 0;
        while (i < len) {
            if (bil[i] == cari) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }
//
//    public int getIndex() {
//        return index;
//    }

    public void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    public void tampil(double a) {
        System.out.println(a);
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
}

class Main {

    public static void main(String[] args) {
        Tugas_Array1D ob = new Tugas_Array1D();
        int bil[] = new int[Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Angka"))];
        for (int i = 0; i < bil.length; i++) {
            bil[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka"));
        }
        ob.setBil(bil);
        ob.tampil("Bilangannya adalah : ");
        ob.tampil(ob.getBil());
        ob.setRata(bil);
        ob.tampil("Nilai Rata-Ratanya Adalah : ");
        ob.tampil(ob.getRata());
        ob.setmaks(bil);
        ob.tampil("Nilai Maksimumnya adalah :");
        ob.tampil(ob.getMaks());
        ob.setMin(bil);
        ob.tampil("Nilai Minimalnya adalah : ");
        ob.tampil(ob.getMin());
        ob.tampil("Nilai Yang Kamu Cari Berada Di Index Ke- " + ob.setIndex(bil, -6));
    }
}
