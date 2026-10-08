import java.util.Scanner;

public class StudiKasus2_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dasar
        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = sc.nextInt();

        // Logika Pemilihan Bersarang (Nested IF)
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Peringkat juara : ");
            int peringkatJuara = sc.nextInt();

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Memenuhi syarat. Dana penghargaan diberikan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Peringkat juara tidak memenuhi syarat. Dana penghargaan tidak diberikan.");
            }

        } 

        sc.close();
    }
}