package services;

import entity.*;
import java.util.*;

public class KaryawanService{

    private static List<Karyawan> data = new LinkedList<Karyawan>();

    public void ubahData(Karyawan kry){
        int idx = data.indexOf(kry);
        if(idx >= 0){
            data.set(idx, kry);
            System.out.println("Data dirubah");
        }
    }

    public void tambahData(Karyawan kry){
        data.add(kry);
        System.out.println("Data disimpan");
    }

    public void hapusData(String id){
        int idx = data.indexOf(new Karyawan(id, "", ""));
        if(idx >= 0){
            data.remove(idx);
            System.out.println("Data dihapus");
        }
    }

    public void tampilkanData(){
        System.out.println("\n --- Data Karyawan ---");
        int urutan = 1;
        for(Karyawan kry : data){
            System.out.println("\n Data ke-" + urutan++);
            System.out.println("\n ID : " + kry.getId());
            System.out.println("\n Nama : " + kry.getNama());
            System.out.println("\n Divisi : " + kry.getDivisi());
        }
    }
}