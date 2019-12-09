import java.util.*;

public class Formulir
{
	static int menu, index = 0;
    static Scanner input = new Scanner(System.in);
    /*
    void login (String user, String pass)
    {
        if ()
    }
    */

    static void pilihProgram (String prodi[])
    {
        //moves up text/clear screen
        //for (int i = 0; i < 50; ++i) System.out.println();
        System.out.println("====================================");
        System.out.println("Pilih jenjang perkuliahan: ");
        System.out.println("1. S1");
        System.out.println("2. S2");
        System.out.println("3. S3");
        menu = input.nextInt();
        switch (menu)
        {
        case 1 : 
    		prodi[index] = "S1";
        case 2 : 
    		prodi[index] = "S2";
        case 3 : 
    		prodi[index] = "S3";
        }
    } 
    public static void main (String args[])
    {
        //DEKLARASI VARIABEL YANG DIBUTUHKAN UNTUK FORM
        String user[] = new String[10];
        String pass[] = new String[10];
        String nama[] = new String[10];
        String email[] = new String[10];
        String gender[] = new String[10];
        String birth[] = new String[10];
        String sekolah[] = new String[10];
        String ortu[] = new String[10];
        String alamat[] = new String[10];
        String prodi[] = new String[10];
        
        //int index = 0;
        System.out.println("Selamat datang, silakan isi formulir");
        System.out.println("====================================");
        System.out.print("Masukkan nama\t\t: ");
        nama[index] = input.nextLine();
        System.out.print("Masukkan username\t: ");
        user[index] = input.nextLine();
        System.out.print("Masukkan password\t: ");
        pass[index] = input.nextLine();
        
        pilihProgram(prodi);
        
        
        System.out.println(nama[index]);
        System.out.println(user[index]);
        System.out.println(pass[index]);
        System.out.println(prodi[index]);

    }
}