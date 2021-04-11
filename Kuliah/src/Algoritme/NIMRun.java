package Algoritme;

import java.util.*;
public class NIMRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String nim = scanner.nextLine();
        NIM objNim = new NIM();
        objNim.setNim(nim);
        System.out.println("Jenjang = "+objNim.getJenjang());
        System.out.println("Tahun Masuk = "+objNim.getTahunMasuk());
        System.out.println("Fakultas = "+objNim.getFakultas());
        System.out.println("Jurusan = "+objNim.getJurusan());
        System.out.println("Jenis kelamin = "+objNim.getJenisKelamin());
        System.out.println("Nomor Urut = "+objNim.getNomorUrutMahasiswa());
    }
}
