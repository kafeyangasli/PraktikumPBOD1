public class App {
    public static void main(String[] args) throws Exception {
        DosenTetap test = new DosenTetap(
            "200624060124130083",
            "0624130083",
            "Maulana Ghazzam",
            new Tanggal(26, 12, 1998),
            new Tanggal(6, 12, 2020),
            "Fakultas Teknik",
            50000000
        );

        test.printInfo();

        DosenTamu test1 = new DosenTamu(
            "200624060124130083",
            "0624130083",
            "Maulana Ghazzam",
            new Tanggal(26, 12, 1998),
            Tanggal.getToday(),
            "Fakultas Teknik",
            50000000.0,
            new Tanggal(12, 12, 2027)
        );

        test1.printInfo();

        Tendik test2 = new Tendik(
            "200624060124130083",
            "Maulana Ghazzam",
            new Tanggal(26, 12, 1998),
            new Tanggal(6, 12, 2020),
            "Akademik",
            50000000.0
        );

        test2.printInfo();
    }
}
