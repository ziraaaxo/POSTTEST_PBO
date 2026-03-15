import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Karyawan> dataKaryawan = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n===== SISTEM PENDATAAN KARYAWAN =====");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Tampilkan Karyawan");
            System.out.println("3. Update Karyawan");
            System.out.println("4. Hapus Karyawan");
            System.out.println("5. Exit");
            System.out.println("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    create();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    // tambah
    static void create() {
        System.out.print("ID       : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Nama     : ");
        String nama = input.nextLine();

        System.out.print("Jabatan  : ");
        String jabatan = input.nextLine();

        System.out.print("Gaji     : ");
        double gaji = input.nextDouble();

        Karyawan k = new Karyawan(id, nama, jabatan, gaji);
        k.infoKaryawan();
        dataKaryawan.add(k);
    }

    // tampilkan
    static void read() {
        if (dataKaryawan.isEmpty()) {
            System.out.println("Belum ada data karyawan.");
        } else {
            System.out.println("\n===== DATA KARYAWAN =====");
            for (Karyawan k : dataKaryawan) {
                k.read();
            }
        }
    }

    // update
    static void update() {
        System.out.print("Masukkan ID karyawan untuk diupdate: ");
        int id = input.nextInt();
        input.nextLine();

        for (Karyawan k : dataKaryawan) {
            if (k.getId() == id) {
                System.out.print("Nama baru     : ");
                k.setNama(input.nextLine());

                System.out.print("Jabatan baru  : ");
                k.setJabatan(input.nextLine());

                System.out.print("Gaji baru     : ");
                k.setGaji(input.nextDouble());

                System.out.print("Data karyawan berhasil diupdate.\n");
                return;
            }
        }
        System.out.println("ID karyawan tidak ditemukan.");
    }

    // hapus
    static void delete() {
        System.out.print("Masukkan ID karyawan yang ingin dihapus: ");
        int id = input.nextInt();

        for (Karyawan k : dataKaryawan) {
            if (k.getId() == id) {
                dataKaryawan.remove(k);
                System.out.println("Data karyawan berhasil dihapus.");
                return;
            }
        }
        System.out.println("ID karyawan tidak ditemukan.");
    }
}
