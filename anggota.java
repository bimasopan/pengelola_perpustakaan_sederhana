import java.util.*;
public class anggota extends perpus {
    static Scanner v = new Scanner(System.in);
    static ArrayList<anggota> dataAnggota = new ArrayList<>();
    private String nama,nim;
    private static final String admin = "admin";
    private static boolean cek = false;
    public anggota(String nama,String nim){
        this.nama = nama;
        this.nim = nim;
    }
    public static void daftarAnggota(anggota Anggota){
        dataAnggota.add(Anggota);
        System.out.println("selamat kamu terdaftar jadi anggota di perspustakaan!!!");
    }
    public String getNama(){
        return this.nama;
    }
    public String getNim(){
        return this.nim;
    }
    public static boolean isAdmin(String nickAnggota){
        return nickAnggota.equals(admin);
    }
    public int jumlahAnggota(){
        return dataAnggota.size();
    }
    public static void login (String nama, String nim){
        boolean cek = false;
        for (anggota Anggota : dataAnggota){
            if (Anggota.getNama().equals(nama) && Anggota.getNim().equals(nim)){
                cek = true;
                break;
            }
        }
        if (cek){
            buku.listBuku();
            System.out.println("Pilih buku yang mau dipinjam: ");
            String pinjam = v.next();
        }else{
            System.out.println("login gagal/data tidak ada di dalam dataset");
        }
    }
    public static void ceksudahDaftar(){
        if (dataAnggota.size() == 0){
            System.out.println("anda belum terdaftar");
        }else{
            System.out.println("anda sudah terdaftar");
        }
    }
    public static void cekAnggota(){
        System.out.println("List anggota: ");
        for (anggota Anggota : dataAnggota){
            System.out.println("Nama: "+Anggota.getNama());
            System.out.println("Nim : "+Anggota.getNim());
        }
    }
    public static void loginAdmin(String admin){
        if (isAdmin(admin) == true ){
            System.out.print("[1] cek list anggota\n[2] cek buku");
            System.out.print("\n>");
            int k = v.nextInt();
            switch(k){
                case 1:
                    anggota.cekAnggota();
                    break;
                case 2:
                    System.out.println("buku lengkap");
                    break;
            }
        }else{
            System.out.println("anda bukan admin!!!");
        }
    }
    public static void clear(){
        for (int a = 0; a < 10;a++){
            System.out.print("\033[H\033[2J");
            System.out.flush();

        }
    }
}

