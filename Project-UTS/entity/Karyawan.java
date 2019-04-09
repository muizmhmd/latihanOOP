package entity;

public class Karyawan{

    private String id;
    private String nama;
    private String divisi;

    public Karyawan(String id, String nama, String divisi) {
        this.id = id;
        this.nama = nama;
        this.divisi = divisi;
    }

    public boolean equals(Object object){
        Karyawan kry = (Karyawan) object;
        return id.equals(kry.getId());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }
}