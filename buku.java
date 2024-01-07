public class buku extends perpus{
    private String namaBuku;
    private int lamaPinjam,dendaPerHari = 1000;
    // public buku(String nama,String nim){
    //     super(nama, nim);
    // }
    public void pinjamBuku(String namaBuku,int lama){
        this.namaBuku = namaBuku;
        this.lamaPinjam = lama;
        int minimalHari = 5;
        if (lama > minimalHari){
            int hasil = dendaPerHari * (lamaPinjam - minimalHari);
            System.out.print("kena denda sebesat Rp."+hasil);
        }else{
            System.out.println("ok buku sudah dikembalikan, jika ingin pinjam lagi silahkan!!");
        }
    }
    public static void listBuku(){
        System.out.println("[1] petualangan perompak luar angkasa\n[2] buku masakan perancis\n[3] buku panduan pemrograman java\n[4] Kamus bahasa inggris & perancis\n[5] buku panduan pemrograman python\n[6] buku fisika newton");
    }
}
 