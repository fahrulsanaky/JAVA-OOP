import java.util.Scanner;

// this project using class abstract
// fahrul saleh sanaky
// 1/17/2023.

public class Main {
    public static void main(String[] args) {

        String nama;
        int umur;
        String nim = new String();
        String nid = new String();

        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);

        System.out.println("==== MANUSIA ===");
        Manusia manusia = new Manusia();
        System.out.print("Masukkan Nama   : ");
        nama = input.nextLine();
        manusia.setNama(nama);
        System.out.print("Masukkan Umur   : ");
        umur = input.nextInt();
        manusia.setUmur(umur);

        System.out.println("Nama = "+manusia.getNama());
        System.out.println("Umur = "+manusia.getUmur());

        System.out.println("================================");

        Scanner input2 = new Scanner(System.in);

        System.out.println("==== MAHASISWA ===");
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.print("Masukkan Nama   : ");
        nama = input2.nextLine();
        mahasiswa.setNama(nama);
        System.out.print("Masukkan NIM    : ");
        nim = input2.nextLine();
        mahasiswa.setNim(nim);
        System.out.print("Masukkan Umur   : ");
        umur = input2.nextInt();
        mahasiswa.setUmur(umur);

        System.out.println("Nama = "+mahasiswa.getNama());
        System.out.println("Umur = "+mahasiswa.getUmur());
        System.out.println("NIM  = "+mahasiswa.getNim());

        System.out.println("================================");

        Scanner input3 = new Scanner(System.in);

        System.out.println("==== DOSEN ===");
        Dosen dosen = new Dosen();
        System.out.print("Masukkan Nama   : ");
        nama = input3.nextLine();
        dosen.setNama(nama);
        System.out.print("Masukkan NID    : ");
        nid = input3.nextLine();
        dosen.setNid(nid);
        System.out.print("Masukkan Umur   : ");
        umur = input3.nextInt();
        dosen.setUmur(umur);

        System.out.println("Nama = "+dosen.getNama());
        System.out.println("Umur = "+dosen.getUmur());
        System.out.println("NID  = "+dosen.getNid());

        System.out.println("================================");

    }
}