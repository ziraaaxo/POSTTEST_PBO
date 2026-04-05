import java.awt.datatransfer.SystemFlavorMap;

public class KaryawanKontrak extends Karyawan{
    private int lamaKontrak;

    public KaryawanKontrak(int id, String nama, String jabatan, double gaji, int lamaKontrak) {
        super(id, nama, jabatan, gaji);
        this.lamaKontrak = lamaKontrak;
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Lama Kontrak : " + lamaKontrak + " bulan");
        System.out.println("---------------------------");
    }
}
