package asistensi;

import java.io.Serializable;

public class olah_app_crud_CS implements Serializable{
    int nim;
    String nama, jurusan, alamat;

    public olah_app_crud_CS(int nim, String nama, String jurusan, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }
    
    @Override
    public String toString() {
        return "\nNIM = " + nim + "\nNAMA = " + nama + "\nASAL = " + jurusan + "\nKELAS = " + alamat+"\n";
    }
    
}
