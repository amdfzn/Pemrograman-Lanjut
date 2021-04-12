package Algoritme;

public class NIM {
    public String nim;
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getJenjang() {
        char kodeJenjang = nim.charAt(0);
        if (kodeJenjang == '1'){
            return "S1";
        }else if (kodeJenjang == '2'){
            return "S2";
        }else if (kodeJenjang == '3'){
            return "S3";
        }
        return "Anda tidak terdaftar sebagai mahasiswa UIN SUSKA Riau";
    }
    public String getTahunMasuk() {
        char kodeTahun1 = nim.charAt(1);
        char kodeTahun2 = nim.charAt(2);
        return "20" + kodeTahun1 + kodeTahun2;
    }
    public String getFakultas(){
        char kodeFakultas = nim.charAt(3);
        if(kodeFakultas == '1'){
            return "Tarbiyah dan Keguruan";
        }else if (kodeFakultas == '2'){
            return "Syari'ah dan Hukum";
        }else if (kodeFakultas == '3'){
            return "Ushuluddin";
        }else if (kodeFakultas == '4'){
            return "Dakwah dan Komunikasi";
        }else if (kodeFakultas == '5'){
            return "Sains dan Teknologi";
        }else if (kodeFakultas == '6'){
            return "Psikologi";
        }else if (kodeFakultas == '7'){
            return "Ekonomi dan Ilmu Sosial";
        }else if (kodeFakultas == '8'){
            return "Pertanian dan Peternakan";
        }else{
            return "Anda tidak terdaftar sebagai mahasiswa UIN SUSKA Riau";
        }
    }
    public String getJurusan(){
        char kodeJurusan = nim.charAt(4);
        char kodeJurusan2 = nim.charAt(5);
        if(kodeJurusan == '0' && kodeJurusan2 == '1'){
            return "Teknik Informatika";
        }else if(kodeJurusan == '0'&& kodeJurusan2 == '2'){
            return "Teknik Industri";
        }else if(kodeJurusan == '0'&& kodeJurusan2 == '3'){
            return "Sistem Informasi";
        }else if(kodeJurusan == '0'&& kodeJurusan2 == '4'){
            return "Matematika";
        }else if(kodeJurusan == '0'&& kodeJurusan2 == '5'){
            return "Teknik Elektro";
        }else{
            return "Anda bukan Mahasiswa Fakultas Saintek";
        }
    }
    public String getJenisKelamin(){
        char kodeJK = nim.charAt(6);
        if(kodeJK == '1'){
            return "Laki-laki";
        }else if (kodeJK == '2'){
            return "Perempuan";
        }
        return "Error";
    }
    public String getNomorUrutMahasiswa() {
        String nomorUrut = nim.substring(7);
        String nomorUrut1 = nomorUrut;
        return nomorUrut1;
    }
}