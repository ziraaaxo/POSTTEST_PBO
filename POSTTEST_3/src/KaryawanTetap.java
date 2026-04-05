public class KaryawanTetap extends Karyawan{
    private double bonus;

    public KaryawanTetap(int id, String nama, String jabatan, double gaji, double bonus) {
        super(id, nama, jabatan, gaji);
        this.bonus = bonus;
    }

    @Override
    public void read() {
        super.read();
        System.out.printf("Bonus    : %,.0f\n", bonus);
        System.out.println("---------------------------");
    }
}
