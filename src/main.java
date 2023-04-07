
public class main {
    
        public static void main(String[] args) {
        Laporan laporan1 = new Laporan ();
        Barang barang1 = new Barang();
        Transaksi transaksi1 = new Transaksi();
        Member member1 = new Member ();
        transaksi1.prosesTransaksi (member1, transaksi1, barang1);
        
        laporan1.laporan(barang1);
        laporan1.laporan(member1);
        laporan1.laporan(transaksi1, barang1);
        
        
    }
}
