package InterfaceProject;
import java.util.Scanner;

public class PhoneApp {
    public static void main(String[] args){

        Phone RedmiNote9 = new Xiaomi();

        PhoneUser user = new PhoneUser(RedmiNote9);

        user.turnOnThePhone();

        Scanner input = new Scanner(System.in);
        String aksi;

        while(true){

            System.out.println("==== APLIKASI INTERFAE HANDPHONE ====");
            System.out.println("1. Nyalakan HP");
            System.out.println("2. Matikan HP");
            System.out.println("3. Perbesar Volume");
            System.out.println("4. Kecilkan Volume");
            System.out.println("0. Exit");
            System.out.println("======================================");
            System.out.println("Pilih Aksi : ");
            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("1")){
                user.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                user.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                user.turnPhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                user.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Aksi yang anda pilih salah !");
            }
        }
    }
}
