package PBO12_24060124130083;

import java.util.Map;
import java.util.HashMap;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaList = new HashMap<>();
        mahasiswaList.put("24060124120001", "Adi");
        mahasiswaList.put("24060124120002", "Bambang");
        mahasiswaList.put("24060124120003", "Cici");
        mahasiswaList.put("24060124120004", "Didi");

        // Lambda
        mahasiswaList.forEach((nim, nama) -> System.out.printf("Ada mahasiswa %s dengan NIM %s.\n", nama, nim));
    }
}
