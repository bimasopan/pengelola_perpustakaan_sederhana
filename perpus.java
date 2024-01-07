import java.util.Scanner;
public class perpus{
    public static void main(String []args){
        Scanner v = new Scanner(System.in);
        String nama,jurusan,namaBuku,nim,pinjam;
        char ang,input;
        do{
            System.out.print("Mau login sebagai user atau admin: ");
            String i = v.next();
            switch(i){
               case "user":
                    System.out.print("\nMau pinjam buku?[y/n]: ");
                    pinjam = v.next();

                    switch (pinjam) {
                        case "y":
                            System.out.println("apakah kamu punya kartu keanggotaan?[y/n]: ");
                            ang = v.next().charAt(0);
                            switch(ang){
                                case 'y':
                                    System.out.println("silahkan login");
                                    System.out.print("Masukan nama: ");
                                    nama = v.next();
                                    System.out.print("\nMasukan nim: ");
                                    nim = v.next();
                                    anggota.login(nama, nim);
                                    break;
                                case 'n':
                                    System.out.println("silakan daftar jangan lupa masukan data dirimu!!");
                                    System.out.print("Masukan nama: ");
                                    nama = v.next();
                                    System.out.print("\nMasukan nim: ");
                                    nim = v.next();
                                    anggota c = new anggota(nama, nim);
                                    anggota.daftarAnggota(c);
                                    anggota.ceksudahDaftar();
                                    break;
                            }
                            break;
                            case "n":
                                buku.listBuku();
                                System.out.print("ok mau baca buku apa: ");
                                String baca = v.next();
                                break;
                    }
                    break;
                case "admin":
                    System.out.print("Masukan kata identitas: ");
                    String admin = v.next();
                    anggota.loginAdmin(admin);
                    
                    break;
            }           
            System.out.println("Apakah kamu ingin mengulang?[y/n]: ");
            input = v.next().charAt(0);
            anggota.clear();
        }while(input == 'y');
    }
}