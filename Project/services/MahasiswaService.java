package services;

import java.util.*;
import entity.*;

public class MahasiswaService{

    private static List<Mahasiswa> data = new LinkedList<Mahasiswa>();

    public void tambahData(Mahasiswa mhs){
        data.add(mhs);
        System.out.println("Data telah tersimpan");
    }

    public void ubahData(Mahasiswa mhs){
        int idx = data.indexOf(mhs);
        if(idx >= 0){
            data.set(idx, mhs);
            System.out.println("Data telah berubah");
        }
    }

    public void hapusData(Mahasiswa mhs){}

    public void tampilkanData(){
        System.out.println("\n-- data mahasiswa --");
        int urutan = 1;
        for(Mahasiswa mhs : data){
            System.out.println("\n data ke-" + urutan++);
            System.out.println("\n NIM :" + mhs.getNim());
            System.out.println("\n NAMA :" + mhs.getNama());
            System.out.println("\n KELAS :" + mhs.getKelas());

        }

    }

}