import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int miktar,input,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        System.out.print("Giris yapacaginiz Sayi Miktarini Yaziniz :");
        Scanner scanner=new Scanner(System.in);
        miktar=scanner.nextInt();
        for (int i=0;i<miktar;){
            i++;
            System.out.print(i+".Sayi Giriniz :");
            input=scanner.nextInt();
            if (input>max){
                max=input;

            } else if (input<min) {
                min=input;

            }

        }
        System.out.println("En Buyuk Deger :"+max);
        System.out.println("En Kucuk Deger :"+min);
    }
}