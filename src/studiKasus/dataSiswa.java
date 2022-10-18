package studiKasus;
import java.util.Scanner;

public class dataSiswa{
    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println("MASUKKAN BIODATA DIRI ANDA");
        System.out.println("==========================");
        Scanner input = new Scanner(System.in);
        String Nama, TR, TL, JK, Alamat, AS, PJ, BM;
        int NIS;
        System.out.print("Nama             : ");
        Nama = input.nextLine();
        System.out.print("NIS              : ");
        NIS = input.nextInt();
        System.out.print("Tempat lahir     : ");
        TR = input.nextLine();
        System.out.print("Tanggal lahir    : ");
        TL = input.nextLine();
        System.out.print("Jenis Kelamin    : ");
        JK = input.nextLine();
        System.out.print("Alamat di Malang : ");
        Alamat = input.nextLine();
        System.out.print("Asal Sekolah      : ");
        AS = input.nextLine();
        System.out.println("Pilihan Jurusan : (RPL/TKJ)");
        PJ = input.nextLine();
        System.out.println("Bakat/Minat     : ");
        BM = input.nextLine();
        System.out.println("=================");
        System.out.println("BIODATA DIRI ANDA");
        System.out.println("=================");
        System.out.println("Nama             : "+Nama);
        System.out.println("NIS              : "+NIS);
        System.out.println("Tempat lahir     : "+TR);
        System.out.println("Tanggal lahir    : "+TL);
        System.out.println("Jenis Kelamin    : "+JK);
        System.out.println("Asal Sekolah     : "+AS);
        System.out.println("Pilihan Jurusan     : "+ PJ);
        System.out.println("Alamat di Malang : "+Alamat);
        System.out.println("Bakat/Minat      : "+BM);
    }

}

