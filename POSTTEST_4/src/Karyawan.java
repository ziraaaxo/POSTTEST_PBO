import java.util.Scanner;

public class Karyawan {
    protected int id;
    protected String nama;
    protected String jabatan;
    protected double gaji;

    public Karyawan(int id, String nama, String jabatan, double gaji) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    // getter
    public int getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public String getJabatan() { return jabatan; }
    public double getGaji() { return gaji; }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    // overloading 1
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setGaji(double gaji, double bonusTambahan) {
        this.gaji = gaji + bonusTambahan;
    }

    // overloading 2
    public void infoKaryawan(String tambahan) {
        System.out.println("Data karyawan " + nama + tambahan);

    }

    // overriding target
    public void read() {
        System.out.println("ID       : " + id);
        System.out.println("Nama     : " + nama);
        System.out.println("Jabatan  : " + jabatan);
        System.out.printf("Gaji     : %,.0f\n", gaji);
    }

    // overriding tambahan
    public String getInfo() {
        return "Karyawan umum";
    }
}

