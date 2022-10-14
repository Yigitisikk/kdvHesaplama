import java.util.Scanner;
public class alistirmalar {
    public static void main(String[] args) {

        double tutar, kdvOran,kdvTutar, kdvliTutar;



        System.out.print("Tutarı Giriniz : ");

        Scanner input = new Scanner(System.in);
        tutar = input.nextDouble();


        if (tutar>=0 && tutar<=1000)  {
                kdvOran = (tutar*0.18)/100;
        }
        else {
            kdvOran = (tutar * 0.8)/100;
        }

        kdvliTutar = kdvOran + tutar;
        kdvTutar = kdvliTutar - tutar;


        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);

    }
}
