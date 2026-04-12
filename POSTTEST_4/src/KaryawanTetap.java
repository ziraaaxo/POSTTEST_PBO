public class KaryawanTetap extends Karyawan{
    private double bonus;

    public KaryawanTetap(int id, String nama, String jabatan, double gaji, double bonus) {
        super(id, nama, jabatan, gaji);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void read() {
        super.read();

        System.out.printf("Bonus    : %,.0f\n", bonus);

        // 🔥 pakai overloading
        double gajiAsli = getGaji();

        setGaji(gajiAsli, bonus); // jadi total sementara
        System.out.printf("Total    : %,.0f\n", getGaji());

        setGaji(gajiAsli); // kembalikan lagi

        System.out.println("---------------------------");
    }

    @Override
    public String getInfo() {
        return "Karyawan Tetap";
    }
}
