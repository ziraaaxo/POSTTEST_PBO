import java.awt.datatransfer.SystemFlavorMap;

public class KaryawanKontrak extends Karyawan{
    private int durasiKontrak;

    public KaryawanKontrak(int id, String nama, String jabatan, double gaji, int durasiKontrak) {
        super(id, nama, jabatan, gaji);
        this.durasiKontrak = durasiKontrak;
    }

    public  void setDurasiKontrak(int durasiKontrak) {
        this.durasiKontrak = durasiKontrak;
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Durasi   : " + durasiKontrak + " bulan");
        System.out.println("---------------------------");
    }

    @Override
    public String getInfo() {
        return "Karyawan Kontrak";
    }
}
