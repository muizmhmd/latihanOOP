import entitas.Mahasiswa;
import entitas.Dosen;

public class Aplikasi {

    public static void main(String[] args){
        Mahasiswa[] dataMhs = {
            new Mahasiswa("17090150", "Muhamad"),
            new Mahasiswa("17090151", "Abdul"),
            new Mahasiswa("17090152", "Muiz"),
        };
        
        for(Mahasiswa mhs : dataMhs){
            mhs.cetak();
        }

        System.out.println();

        Dosen dsn1 = new Dosen();
        Dosen dsn2 = new Dosen();
        dsn1.setNid("111000");
        dsn2.setNid("111001");
        dsn1.setNama("Abdul");
        dsn2.setNama("Miss");

        dsn1.cetak();
        dsn2.cetak();
    }
}