import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (i <= 2) {
            if (i == 1) {
                System.out.println(i + ". Informasi Biodata");
            } else {
                System.out.println(i + ". Cetak Pola");
            }
            i++;
        }
        System.out.println("Pilih opsi (1 atau 2) : ");
        int n = Integer.valueOf(sc.nextLine());

        if (n == 1) {
            System.out.print("Input nama depan : ");
            String firstName = sc.nextLine();
            System.out.print("Input nama belakang : ");
            String lastName = sc.nextLine();
            System.out.print("Input tempat lahir : ");
            String birthPlace = sc.nextLine();
            System.out.print("Input tahun lahir : ");
            int birthYear = Integer.valueOf(sc.nextLine());
            System.out.print("Input bahasa pemrograman favorit : ");
            String favLang = sc.nextLine();

            System.out.println("====================================");
            System.out.println("Nama lengkap " + firstName + " " + lastName);
            System.out.println("Lahir di " + birthPlace);
            System.out.println("Tahun lahir " + birthYear);
            System.out.println("Suka bahasa pemrograman " + favLang);
        } else {
            System.out.print("Input n : ");
            int num = Integer.valueOf(sc.nextLine());

            int j, s, k = 0;
            if (num % 2 != 0) {
                for(j = (num/2)+1; j >= 1; j--) {
                    for(s = 1; s <= num-j; s++) {
                        System.out.print("  ");
                    }
                    k = 0;
                    while(k != (2 * j - 1)) {
                        System.out.print("* ");
                        k++;
                    }
                    if(j != 1){
                        System.out.println();
                    }
                }

                for (j = 1; j <= (num/2)+1; j++) {
                    for (s = 1; s <= num-j; s++) {
                        System.out.print("  ");
                    }
                    while (k != (2 * j - 1)) {
                        System.out.print("* ");
                        k++;
                    }
                    System.out.println();
                    k = 0;
                }
            }
        }

        sc.close();
    }
}
