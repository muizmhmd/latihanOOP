import services.*;
import entity.*;
import java.util.*;

public class Aplikasi{

    private static KaryawanService service;
    private static Scanner scanner;

    public static void main(String[] args){
        service = new KaryawanService();
        scanner = new Scanner(System.in);

        int opsi = 5;
        do{
            tampilkanMenu();
            try {
                scanner = new Scanner(System.in);
                opsi = scanner.nextInt();
            } catch (InputMismatchException e){
                System.err.println("Silahkan input menunya");
                opsi = 0;
            } catch (NoSuchElementException e){
                System.err.println("Silahkan input menunya");
                opsi = 0;
            } catch (IllegalStateException e){
                System.err.println("Silahkan input menunya");
                opsi = 0;
            }

            seleksi(opsi);
        } while (opsi != 5);
    }

    private static void seleksi(int opsi){
        switch (opsi){
            case 1:
                panggilTambahData();
                break;
            case 2:
                panggilUbahData();
                break;
            case 3:
                panggilHapusData();
                break;
            case 4:
                service.tampilkanData();
                break;
        }
    }

    private static void panggilTambahData(){
        scanner = new Scanner(System.in);
        String id, nama, divisi;

        System.out.println("\n ==== Form Tambah Data ====");
        System.out.println("ID : ");
        id = scanner.nextLine();
        System.out.println("Nama : ");
        nama =scanner.nextLine();
        System.out.println("Divisi : ");
        divisi = scanner.nextLine();
        service.tambahData(new Karyawan(id,nama,divisi));

    }

    private static void panggilUbahData(){
        scanner = new Scanner(System.in);
        String id, nama, divisi;

        System.out.println("\n ==== Form Ubah Data ====");
        System.out.println("ID : ");
        id = scanner.nextLine();
        System.out.println("Nama : ");
        nama = scanner.nextLine();
        System.out.println("Divisi : ");
        divisi = scanner.nextLine();
        service.ubahData(new Karyawan(id,nama,divisi));
    }

    private static void panggilHapusData(){
        scanner = new Scanner(System.in);

        System.out.println("ID : ");
        String id = scanner.nextLine();
        service.hapusData(id);

    }

    private static void tampilkanMenu(){
        System.out.println("\n--= Aplikasi Data Karyawan =--");
        System.out.println("1.Tambah Data");
        System.out.println("2.Ubah Data");
        System.out.println("3.Hapus Data");
        System.out.println("4.Tampilkan Data");
        System.out.println("5.Keluar");
        System.out.println("-------------------");
        System.out.println("opsi > ");
    }

}