public class Mahasiswa{

    private String nama;
    private String nim;

    //konstruktor
    //suatu fungsi yang namanya sama dengan nama kelassnya
    //suatu fungsi yg dipanggil untuk membentuk sebuah objek
    
    //Konstruktor default tanpa parameter
    Mahasiswa(){

        //nama dan nim disebut field / variable dalam class

        nama = "tidak ada nama";
        nim = "0000000";
    }

    //konstruktor dengan 2 parameter
    Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    void cetak(){
        System.out.println(nim + " : " + nama);
    }

    String setNim(String nim){
        return nim;
    }

    String getNim(){
        return nim;
    }


}