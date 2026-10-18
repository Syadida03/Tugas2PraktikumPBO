package TugaspraktikumPBO_P2;

public class KecepatanCahaya {
    public static void main(String[] args){
        double bumiBulan = 384400;
        double bumiMatahari = 152100000;
        double kecepatanCahaya = 300000;
        
        double waktuBulanDetik = bumiBulan/kecepatanCahaya;
        double waktuMatahariDetik = bumiMatahari/kecepatanCahaya;
        
        System.out.println("WAKTU TEMPUH");
        System.out.println("Bumi Ke Bulan: " + waktuBulanDetik + " detik");
        System.out.println("Bumi Ke Matahari: " + waktuMatahariDetik + " detik");
    }
}
