public class Karyawan {
    private int id;
    private String nama;
    private String jabatan;
    private double gaji;

    public Karyawan(int id, String nama, String jabatan, double gaji) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    // default modifier
    void infoKaryawan() {
        System.out.println("Data karyawan tersimpan.");
    }

    // getter
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        if (gaji >= 0) {
            this.gaji = gaji;
        }
    }

    public void read() {
        System.out.println("ID       : " + id);
        System.out.println("Nama     : " + nama);
        System.out.println("Jabatan  : " + jabatan);
        System.out.printf("Gaji     : %,.0f\n", gaji);
    }
}

