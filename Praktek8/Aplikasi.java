public class Aplikasi {

    public static void main(String[] args){
        Mahasiswa m1 =  new Mahasiswa();
        m1.nama = "Muiz";
        m1.namaStatic = "Muiz-Static";

        System.out.println(m1.nama);
        System.out.println(m1.namaStatic);

        Mahasiswa m2 = new Mahasiswa();
        m2.nama = "Abdul";
        m2.namaStatic = "Abdul-Static";

        System.out.println(m2.nama);
        System.out.println(Mahasiswa.namaStatic);
        System.out.println(Mahasiswa.namaStatic);
    
    }
    static class Mahasiswa {
        public String nama;
        public static String namaStatic;
    }
}