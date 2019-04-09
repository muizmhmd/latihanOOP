import services.*;
import entity.*;
import java.util.*;

public class Aplikasi{

    private static MahasiswaService service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new MahasiswaService();
        scanner = new Scanner(System.in);

        int opsi = 5;
        do {
            tampilkanMenu();
            try {
                scanner = new Scanner(System.in);
                opsi = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Silahkan input menunya");
                opsi = 0;
            } catch (NoSuchElementException e) {
                System.err.println("Inputnya exhaust");
                opsi = 0;
            } catch (IllegalStateException e){
                System.err.println("Scanner ketutup");
                opsi = 0;
            }
            seleksi(opsi);
        } while (opsi != 5);
    }

    private static void seleksi(int opsi){
        switch (opsi){
            case 1:
                callFromTambahData();
                break;
            case 2:
                callFromUbahData();
                break;
            case 3:
                callFromHapusData();
                break;
            case 4:
                service.tampilkanData();
                break;
        }
    }

    private static void callFromHapusData(){
        scanner = new Scanner(System.in);

        System.out.println("NIM : ");
        String nim = scanner.nextLine();
        service.hapusData(nim);
    }

    private static void callFromUbahData(){
        scanner = new Scanner(System.in);
        String nim, nama, kelas;

        System.out.println("\n --= Form Ubah Data =--");
        System.out.println("NIM : ");
        nim = scanner.nextLine();
        System.out.println("Nama : ");
        nama = scanner.nextLine();
        System.out.println("Kelas : ");
        kelas = scanner.nextLine();
        service.ubahData(new Mahasiswa(nim,nama,kelas));

    }

    private static void callFromTambahData(){
        scanner = new Scanner(System.in);
        String nim, nama, kelas;

        System.out.println("\n --= Form Tambah Data =--");
            System.out.println("NIM : ");
            nim = scanner.nextLine();
            System.out.println("Nama : ");
            nama = scanner.nextLine();
            System.out.println("Kelas : ");
            kelas = scanner.nextLine();
            service.tambahData(new Mahasiswa(nim,nama,kelas));

        }

    private static void tampilkanMenu(){
        System.out.println("\n--= Aplikasi Mahasiswa =--");
        System.out.println("1.Tambah Data");
        System.out.println("2.Ubah Data");
        System.out.println("3.Hapus Data");
        System.out.println("4.Tampilkan Data");
        System.out.println("5.Keluar");
        System.out.println("-------------------");
        System.out.println("opsi > ");
    }
}