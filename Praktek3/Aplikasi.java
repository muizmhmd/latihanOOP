public class Aplikasi{

    public static void main(String args[]){
        Mahasiswa mhs[] = {
            new Mahasiswa("1901", "muhamad"),
            new Mahasiswa("1902", "abdul"),
            new Mahasiswa("1902", "muiz")
        };

        // -- for
        System.out.println("========for standar=======");
        for(int i = 0; i < mhs.length; i++){
            mhs[i].cetak();
        }

        // System.out.println("\n=====for standar lainnya====");
        // int i = 0;
        // for(; 1 < mhs.length;){
        //     mhs[i].cetak();
        //     i++;
        // }

        System.out.println("\n=======another for=======");
        for(Mahasiswa data : mhs){
            data.cetak();
        }
    }

}