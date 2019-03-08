public class Aplikasi{

    public static void main(String args[]){
        Mahasiswa mhs1 = new Mahasiswa("17090150","Muiz");
        Mahasiswa mhs2 = new Mahasiswa("17090155","Abdul");
        //mhs1.nama = "Muiz";
        //mhs1.nim = "17090150";

        //System.out.println(mhs1.nim+" "+ mhs1.nama);
        //System.out.println(mhs2.nim+" "+ mhs2.nama);
        mhs1.cetak();
        mhs2.cetak();
        System.out.println(mhs1.getNim());
    }

}