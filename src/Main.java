import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n,total=0;

        Scanner imp =new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz : ");
            n=imp.nextInt();
            if (n%4==0){
                total+=n;
            }
        }while (n%2==0);
        System.out.println("Toplam : "+total);
    }
}