public class Karyawan {
    int id;
    String nama;
    String jabatan;
    double gaji;

    Karyawan(int id, String nama, String jabatan, double gaji) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    void read() {
        System.out.println("ID       : " + id);
        System.out.println("Nama     : " + nama);
        System.out.println("Jabatan  : " + jabatan);
        System.out.printf("Gaji     : %,.0f\n", gaji);
        System.out.println("---------------------------");
    }
}
