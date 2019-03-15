import entitas.Mahasiswa;

public class Aplikasi{
    public static void main(String[] args){
        Mahasiswa[] dataMahasiswa = {
            new Mahasiswa("1709001", "Muhamad");
            new Mahasiswa("1709002", "Abdul");
            new Mahasiswa("1709003", "Muiz");
        };

        for(Mahasiswa data : dataMahasiswa){
            data.cetak();
        }
    }
}