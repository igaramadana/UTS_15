import java.util.Scanner;
public class HitungIP15{
    public static void main(String[] args) {
        Scanner input15 = new Scanner (System.in);

        String nama,matkul,huruf; 
        int sks,jmlmatkul = 0,remidi = 0,jmlhSks = 0;
        char ulang = 'N';
        double jmlhIp = 0,totalNilai;

        System.out.println("=======Program Hitung IP=======");
        System.out.print("Masukkan nama : ");
        nama = input15.nextLine();

        do{
        System.out.print("Nama Mata Kuliah : ");
        matkul = input15.next();
        jmlmatkul++;
        System.out.print("Nilai (A,B+,B,C+,C,D,E): ");
        huruf = input15.next();
        System.out.print("Masukkan jumlah SKS : ");
        sks = input15.nextInt();
        //konversi nilai
        double bobot = 0.0;
        switch (huruf) {
            case "A":
                bobot = 4.0;
                break;
            case "B+":
                bobot = 3.5;
                break;
            case "B":
                bobot = 3.0;
                break;
            case "C+":
                bobot = 2.5;
                break;
            case "C":
                bobot = 2.0;
                break;
            case "D":
                bobot = 1.0;
                remidi++;
                break;
            case "E":
                bobot = 0.0;
                remidi++;
                break;
            default:
                System.out.println("Nilai tidak valid untuk mata kuliah ini.");
                continue; // Skip iterasi selanjutnya
        }

        jmlhIp += bobot * sks;
        jmlhSks += sks;

        System.out.print("Apakah Ingin Lanjut Input Nilai (Y/N)? ");
        ulang = input15.next().charAt(0);

     } while (ulang != 'N');
        System.out.println("------------Hasil Perhitungan IP------------");
        System.out.println("Nama                    : " +nama);
        System.out.println("Indeks Prestasi (IP)    : " +jmlhIp) ;
        System.out.println("Jumlah mata kuliah      : " +jmlmatkul);
        System.out.println("Jumlah SKS              : " +jmlhSks);
        System.out.println("Jumlah MK yang harus perbaikan / remidi : " +remidi);
}
}